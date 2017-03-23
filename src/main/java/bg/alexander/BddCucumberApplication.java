package bg.alexander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackages = "bg.alexander.model", basePackageClasses = Jsr310JpaConverters.class)
public class BddCucumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BddCucumberApplication.class, args);
	}
}
