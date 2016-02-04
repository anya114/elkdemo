package com.patterncat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by patterncat on 2016-02-04.
 */
@Component
public class LogDemoService {

    private static final Logger logger = LoggerFactory.getLogger(LogDemoService.class);

    public void generateLog(){
        logger.info("hello:{}", UUID.randomUUID().toString());
    }
}
