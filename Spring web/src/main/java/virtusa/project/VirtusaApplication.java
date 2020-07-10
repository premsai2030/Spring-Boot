package virtusa.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//it will do annotation applications like @configuration , @component , @autoscan
public class VirtusaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtusaApplication.class, args);
	}

}
