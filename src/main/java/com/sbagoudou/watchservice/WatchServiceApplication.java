package com.sbagoudou.watchservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchServiceApplication {

	public static final String REGEX = "[0-9]{3}_WatchServiceFile_[0-9]{8}.xml";

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(WatchServiceApplication.class, args);

		initializeWatchService();

	}

	/**
	 * Initialize a WatchService on the system's user home directory
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	private static void initializeWatchService() throws IOException, InterruptedException {

		WatchService watchService = FileSystems.getDefault().newWatchService();

		String sourceFolder = System.getProperty("user.home");

		Path path = Paths.get(sourceFolder);
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);

		WatchKey key;
		while ((key = watchService.take()) != null) {
			for (WatchEvent<?> event : key.pollEvents()) {

				WatchEvent<Path> eventPath = (WatchEvent<Path>) event;
				Path pathFile = eventPath.context();
				File file = pathFile.toFile();
				String fileName = file.getName();

				System.out.println("Event kind:" + event.kind() + ". File affected: " + sourceFolder + "/" + fileName);
				
				if(event.kind().equals(StandardWatchEventKinds.ENTRY_CREATE)) {
					handleFile(sourceFolder, fileName);
				}
				
			}
			key.reset();
		}

		watchService.close();

	}

	/**
	 * Read a certain kind of xml files and show the content
	 * 
	 * @param sourceFolder
	 * @param fileName
	 */
	private static void handleFile(String sourceFolder, String fileName) {
		// Check if the file name matches the files we want to handle
		if (fileName.matches(REGEX)) {
			System.out.println(fileName + " matches the file name expected");
			
			try {
				// Unmarchal the file 
				JAXBContext context = JAXBContext.newInstance(com.sbagoudou.dto.WatchService.class);
				Unmarshaller unmarchaller = context.createUnmarshaller();
				
				File file = new File(sourceFolder + "/" + fileName);
				com.sbagoudou.dto.WatchService dto = (com.sbagoudou.dto.WatchService) unmarchaller.unmarshal(file);
				
				// Read the file
				dto.getDatas().getData().stream().forEach(data -> {
					System.out.println("Name:"+data.getName());
					System.out.println("Langage:"+data.getLangage());
				});
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
