package shoppingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Message {
	
	@GetMapping(value = "/message") 
	String showMessage() {

		return " hello ";

	}

}
