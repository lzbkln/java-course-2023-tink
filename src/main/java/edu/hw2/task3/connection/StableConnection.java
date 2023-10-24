package edu.hw2.task3.connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StableConnection implements Connection {
    private final static Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(String command) {
        LOGGER.info("Executing command on stable connection: " + command);
    }

    @Override
    public void close() {
        LOGGER.info("Closing stable connection");
    }
}
