package cat.itacademy.barcelonactiva.kuzmina.ganna.s04.t01.n01.S04T01N01KuzminaGanna.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloWorldController {
	@RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
	public String hello1(@RequestParam (defaultValue = "UNKNOWN") String name) {
		return "Hello, " + name + ". You're executing a Maven project";	
	}
	
	@RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"}, method = RequestMethod.GET)
	public String hello2(@PathVariable  Optional<String> name) {
		return "Hello, " + (name.isPresent()?name.get():"UNKNOWN") + ". You're executing a Maven project";	
	}
}
