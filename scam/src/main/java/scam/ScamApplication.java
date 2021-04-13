package scam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author y'l'l
 */
@SpringBootApplication
@MapperScan("scam.dao")
public class ScamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScamApplication.class, args);
    }

}
