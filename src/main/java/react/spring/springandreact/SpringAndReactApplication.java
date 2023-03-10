package react.spring.springandreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringAndReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndReactApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringAndReactApplication.class);
    }

}
