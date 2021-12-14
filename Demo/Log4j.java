package Demo;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Log4j {

        public static Logger logger = LogManager.getLogger(Log4j.class);

        public static void main(String[] args) throws InterruptedException {
            System.out.print("This is an Log4j demo");

            logger.info("This is an information message");
            logger.error("This is an error message");
            logger.warn("This is an warning message");

            System.out.print("Completed!");
        }


    }
