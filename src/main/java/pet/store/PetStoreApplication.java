package pet.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This annotation enables auto-configuration, component scanning, and configuration in Spring Boot.
public class PetStoreApplication {

    public static void main(String[] args) {
        // Start Spring Boot by calling SpringApplication.run and passing in the class reference.
        SpringApplication.run(PetStoreApplication.class, args);
    }
}
