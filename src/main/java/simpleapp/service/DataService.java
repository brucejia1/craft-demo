package simpleapp.service;

import java.util.List;

import simpleapp.dto.Player;

public interface DataService {
	public List<Player> getPlayer(String playerId);
}
