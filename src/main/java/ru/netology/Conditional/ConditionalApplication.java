package ru.netology.Conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.JavaConfig;

@SpringBootApplication
public class ConditionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConditionalApplication.class, args);
		final var context = new AnnotationConfigApplicationContext(JavaConfig.class);
	}
}
