package org.measure.smm.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.measure.smm.measure.model.SMMMeasure;

public class MeasurePackager {

	public static final String MEATADATAFILE = "MeasureMetadata.xml";
	public static final String JARFILE = "org.measure.smmmeasure.impl.jar";

	public static void packageMeasure(Path implementationPath,Path libsPath, SMMMeasure data, Path measurePath)
			throws JAXBException, IOException {
		File xmlTmpFile = File.createTempFile("SMMMeasure", "xml");

		JAXBContext context = JAXBContext.newInstance(SMMMeasure.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(data, xmlTmpFile);

		// Create target Directories
		Files.createDirectories(measurePath.getParent());

		// Zip Measure
		ZipOutputStream zipStream = new ZipOutputStream(new FileOutputStream(measurePath.toFile()));

		addToZip(MEATADATAFILE, xmlTmpFile, zipStream);
		addToZip(implementationPath.toFile().getName(), implementationPath.toFile(), zipStream);
		
		for(File lib : libsPath.toFile().listFiles()){
			addToZip("lib/"+ lib.getName(), lib, zipStream);
		}

		zipStream.close();
	}

	private static void addToZip(String targetName, File file, ZipOutputStream zipStream)
			throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream(file);
		zipStream.putNextEntry(new ZipEntry(targetName));

		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			zipStream.write(buf, 0, len);
		}
		in.close();
	}

	public static SMMMeasure getMeasureData(Path metadataPath) throws JAXBException, ZipException, IOException {
		if(metadataPath.toFile().exists()){
			JAXBContext context = JAXBContext.newInstance(SMMMeasure.class);
			Unmarshaller um = context.createUnmarshaller();
			return (SMMMeasure) um.unmarshal(new FileReader(metadataPath.toFile()));
		}
		throw new FileNotFoundException();
	}

	public static SMMMeasure getMeasureDataFromZip(Path zipPath) throws JAXBException, ZipException, IOException {
		try (ZipFile zipFile = new ZipFile(zipPath.toFile())) {
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				if (entry.getName().equals(MEATADATAFILE)) {
					InputStream stream = zipFile.getInputStream(entry);
					JAXBContext context = JAXBContext.newInstance(SMMMeasure.class);
					Unmarshaller um = context.createUnmarshaller();
					return (SMMMeasure) um.unmarshal(stream);
				}
			}
		}
		return null;
	}

}
