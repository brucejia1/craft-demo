package simpleapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simpleapp.dto.Player;
import simpleapp.exception.ApiErrorResponse;
import simpleapp.exception.SimpleAppException;
import simpleapp.service.DataService;

@RestController
@RequestMapping("/api")
public class SimpleAppController {
	
	@Autowired
	DataService dataService;
	
	@RequestMapping("/hello")
    public Player api() {	
		Player player = new Player();
		player.setNameFirst("John");
		player.setNameLast("Jeen");
		return player;
	}
	
	@GetMapping("/players/{playerID}")
	public List<Player> getPlayer(@PathVariable("playerID") String playerID) {
		
		return dataService.getPlayer(playerID);
	}
	
	@ExceptionHandler(SimpleAppException.class)
	public ResponseEntity<ApiErrorResponse> errorHandle(SimpleAppException e) {
		// 
		ApiErrorResponse response = new ApiErrorResponse();
		return new ResponseEntity<ApiErrorResponse>(response, response.getStatus());
	}
}
