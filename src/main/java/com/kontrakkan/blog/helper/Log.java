package com.kontrakkan.blog.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

    public static void infoLog(String message, Class<?> context) {
        Logger logger = LoggerFactory.getLogger(context);
        logger.info(message);
    }

    public static void debugLog(String message, Class<?> context) {
        Logger logger = LoggerFactory.getLogger(context);
        logger.debug(message);
    }

    public static void errorLog(String message, Class<?> context) {
        Logger logger = LoggerFactory.getLogger(context);
        logger.error(message);
    }

    public static void warnLog(String message, Class<?> context) {
        Logger logger = LoggerFactory.getLogger(context);
        logger.warn(message);
    }

    public static void traceLog(String message, Class<?> context) {
        Logger logger = LoggerFactory.getLogger(context);
        logger.trace(message);
    }
}
