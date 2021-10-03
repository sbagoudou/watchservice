package com.sbagoudou.watchservice;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchServiceApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(WatchServiceApplication.class, args);

		initializeWatchService();

	}

	/**
	 * Initialize a WatchService on the system's user home directory
	 * @throws IOException
	 * @throws InterruptedException
	 */
	private static void initializeWatchService() throws IOException, InterruptedException {
		
		WatchService watchService = FileSystems.getDefault().newWatchService();
		
		Path path = Paths.get(System.getProperty("user.home"));
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);
		
		WatchKey key;
		while ((key = watchService.take()) != null) {
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context() + "..");
			}
			key.reset();
		}

		watchService.close();
 
	}

}
