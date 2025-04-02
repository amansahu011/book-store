package in.sp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.sp.controller")
public class BookstoreappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreappApplication.class, args);
	}

}
