package cat.itacademy.barcelonactiva.kuzmina.ganna.s04.t01.n02.S04T01N02KuzminaGanna.contollers;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
	public String hello1(@RequestParam (defaultValue = "UNKNOWN") String name) {
		return "Hello, " + name + ". You're executing a Gradle project";	
	}
	
	@RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"}, method = RequestMethod.GET)
	public String hello2(@PathVariable  Optional<String> name) {
		return "Hello, " + (name.isPresent()?name.get():"UNKNOWN") + ". You're executing a Gradle project";	
	}
}

