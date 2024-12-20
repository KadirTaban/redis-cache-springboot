package dev.kadir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrcApplication.class, args);
    }

}
