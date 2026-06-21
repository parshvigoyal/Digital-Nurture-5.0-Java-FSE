package module_4_test_driven_development_and_logging_framework.SL4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

    private static final Logger logger =
            LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {

        logger.info("Application started");
        logger.error("Sample error message");
    }
}
