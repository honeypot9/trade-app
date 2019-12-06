package ru.trade.datacollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.core.env.SimpleCommandLinePropertySource;

@EnableBinding(Sink.class)
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

	@StreamListener(target=Sink.INPUT)
	public void logfast(String msg) {
		System.out.println("Read message: " + msg);
	}

}