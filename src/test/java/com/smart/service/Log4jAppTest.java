package com.smart.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2015/12/15.
 */
public class Log4jAppTest {
    static Logger logger = LogManager.getLogger(Log4jAppTest.class);

    public static void main(String[] args){
        logger.debug("this is debug message");
        logger.info("this is info message");
        logger.error("this is error message");
    }
}
