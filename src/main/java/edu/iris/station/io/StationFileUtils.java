package edu.iris.station.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import edu.iris.station.model.FDSNStationXML;

public class StationFileUtils {
	public static FDSNStationXML stationXmlDocument(final File file) throws JAXBException, SAXException, IOException {
		validateFile(file);
		InputStream inputStream = null;

		try {
			inputStream = new FileInputStream(file);
			return StationIOUtils.stationXmlDocument(inputStream);
		} catch (final IOException | RuntimeException | JAXBException | SAXException ex) {
			if (inputStream != null) {
				inputStream.close();
			}
			throw ex;
		}
	}

	public static StationXmlIterator stationXmlIterator(final File file) throws IOException {
		validateFile(file);
		InputStream inputStream = null;

		try {
			inputStream = new FileInputStream(file);
			return StationIOUtils.stationXmlIterator(inputStream);
		} catch (final IOException | RuntimeException ex) {
			if (inputStream != null) {
				inputStream.close();
			}
			throw ex;
		}
	}

	public static void writeXml(final File file, FDSNStationXML document) throws IOException {
		validateFile(file);
		try (FileOutputStream outputStream = new FileOutputStream(file)) {
			StationIOUtils.writeXml(outputStream, document);
		} catch (JAXBException e) {
			throw new IOException(e);
		}
	}

	public static void validateFile(final File file) throws IOException {
		if (file.exists()) {
			if (file.isDirectory()) {
				throw new IOException("File '" + file + "' exists but is a directory");
			}
			if (file.canRead() == false) {
				throw new IOException("File '" + file + "' cannot be read");
			}
		} else {
			throw new FileNotFoundException("File '" + file + "' does not exist");
		}
	}
}
