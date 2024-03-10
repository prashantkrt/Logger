package com.myLearning.loggers;

//import java.util.logging.Level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LaunchDemo {

	private static final Logger logger = LogManager.getLogger(LaunchDemo.class);

	public static void main(String[] args) {
		service();
	}

	public static void service() {

		// business logics
		// logic to store in db....
		/*
		 * 1.trace 2.debug 3.info 4.warn 5.error 6.fatal
		 */
		// **important**
		// levels : 1: trace > 2: debug > 3: info > 4: warn > 5: error > 6: fatal

		logger.trace("Message coming from trace method");// higest and the deepest

		logger.debug("Message coming from debug method");

		logger.info("Message coming from Info method");

		logger.warn("Message coming from warn method");

		// exception
		logger.error("Message coming from error method");

		// server down or env or nw issue
		logger.fatal("Message coming from fatal method");

		logger.fatal("Message coming from fatal method {0}", "sdsds");

		//**import java.util.logging.Logger**
		
//		java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LaunchDemo.class.getName());
//
//
//		logger.log(Level.INFO, "logging: {0} ", "message1");
//		logger.log(Level.INFO, "logging: {0} ", "message2");

//		  logger.trace("Trace Message!");
//	      logger.debug("Debug Message!");
//	      logger.info("Info Message!");
//	      logger.warn("Warn Message!");
//	      logger.error("Error Message!");
//	      logger.fatal("Fatal Message!");
	}

}
