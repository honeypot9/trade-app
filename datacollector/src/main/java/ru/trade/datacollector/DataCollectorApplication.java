package ru.trade.datacollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import ru.trade.init.messages.Queues;

@EnableBinding(Queues.class)
@SpringBootApplication
public class DataCollectorApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DataCollectorApplication.class);
        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
        if (!source.containsProperty("spring.profiles.active") &&
                !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
            app.setAdditionalProfiles("profile1");
        }
        app.run();
    }
}