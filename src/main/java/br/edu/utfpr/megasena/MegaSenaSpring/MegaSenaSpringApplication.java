package br.edu.utfpr.megasena.MegaSenaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.eventoapp.controllers"}) 
@ComponentScan({"br.edu.utfpr.megasena.controllers"})
@SpringBootApplication
public class MegaSenaSpringApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(MegaSenaSpringApplication.class, args);
	}
	
	
}
