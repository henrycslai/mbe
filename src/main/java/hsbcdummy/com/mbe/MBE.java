package hsbcdummy.com.mbe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MBE {
	
	private final static Logger slf4jLogger = LoggerFactory.getLogger(MBE.class);

    public static void main(String[] args) {
        slf4jLogger.info("Logging: MBE Start v4");
        SpringApplication.run(MBE.class, args);
    }

}