package simpleapp.service.impl;

import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import simpleapp.dto.Player;
import simpleapp.service.DataService;

public class DataServiceImpl implements DataService {
	
	private static final String DATA_PATH = "./data/";

	@Override
	public List<Player> getPlayer(String playerId) {
		
		List<Player> players = readPlayers();
		
		if(StringUtils.isEmpty(playerId)) {
			return players;
		} else {
			for(Player player : players) {
				if(playerId.trim().equals(player.getPlayerId())) {
					List<Player> onePlayerLst = new ArrayList<Player>();
					onePlayerLst.add(player);
					return onePlayerLst;
				}
			}
		}
		
		return new ArrayList<Player>();
	}
	
	private List<Player> readPlayers() {
		List<Player> players = new ArrayList();
		URL classesRootDir = getClass().getProtectionDomain().getCodeSource().getLocation();
		
		
	            Reader reader = null;
				try {
					reader = Files.newBufferedReader(Paths.get(classesRootDir.getPath() + DATA_PATH + "People.csv"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            CsvToBean<Player> csvToBean = new CsvToBeanBuilder<Player>(reader)
	                    .withType(Player.class)
	                    .withIgnoreLeadingWhiteSpace(true)
	                    .build();

	            Iterator<Player> playerIterator = csvToBean.iterator();

	            while (playerIterator.hasNext()) {
	            	Player player = playerIterator.next();
	            	players.add(player);
	            }
	
		return players;
		
	}

}
