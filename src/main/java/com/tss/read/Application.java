package com.tss.read;

/**
 * @author huzaifa bhavnagri
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println(
				"spring-boot-read-from-property Application is started on endpoint http://localhost:10000/readProperty as default");
	}
}