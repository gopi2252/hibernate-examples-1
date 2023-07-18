package guru.springframework.sdjpaintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SdjpaIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdjpaIntroApplication.class, args);
	}

}
