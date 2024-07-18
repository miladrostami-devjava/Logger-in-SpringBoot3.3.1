package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoggingController {
    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/logging")
    public String logging(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        return "Check the logs for messages";
    }
}
