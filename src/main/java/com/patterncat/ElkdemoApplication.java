package com.patterncat;

import com.patterncat.service.LogDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ElkdemoApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(ElkdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ElkdemoApplication.class, args);
	}

	@Autowired
    LogDemoService logDemoService;

	@Override
	public void run(String... strings) throws Exception {
		while(true){
			logDemoService.generateLog();
			Thread.sleep(1000);
			logger.info("current thread:{},content:{}",Thread.currentThread().getName(), UUID.randomUUID().toString());
		}
	}
}
