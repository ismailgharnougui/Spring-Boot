package tn.esprit.springprojoctismail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringProjoctIsmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjoctIsmailApplication.class, args);
    }

}
