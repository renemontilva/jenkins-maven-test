package com.rene.test;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void main( String[] args )
    {
        LOGGER.info("Logging an INFO-level message");
    }
}
