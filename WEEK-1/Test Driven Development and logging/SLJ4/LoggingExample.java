package module_4_test_driven_development_and_logging_framework.SL4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.error("Database connection failed");
        logger.warn("Low memory warning");
    }
}
