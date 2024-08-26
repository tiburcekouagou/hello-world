package bj.highfiveuniversity.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController 
// annotion qui dit à Spring que ce code décrit un endpoint (url)
// devrait être rendu disponible dans le navigateur
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
// Route::get("/hello", [...Controller, hello])
	@GetMapping("/hello")
	// on définit une route GET "/hello" 
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	public String hello(String name) {
		return String.format("Hello %s !", name);
	}
}
