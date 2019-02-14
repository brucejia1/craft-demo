package simpleapp.dto;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByPosition;


public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7393621362755542681L;
	
	@CsvBindByPosition(position = 0)
	private String playerId;
	
	@CsvBindByPosition(position = 1)
	private String birthYear;
	
	@CsvBindByPosition(position = 2)
	private String birthNonth;
	
	@CsvBindByPosition(position = 3)
	private String birthDay;
	@CsvBindByPosition(position = 7)
	private String deathYear;
	@CsvBindByPosition(position = 8)
	private String deathNonth;
	@CsvBindByPosition(position = 9)
	private String deathDay;
	@CsvBindByPosition(position = 13)
	private String nameFirst;
	@CsvBindByPosition(position = 14)
	private String nameLast;
	@CsvBindByPosition(position = 17)
	private String height;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthNonth() {
		return birthNonth;
	}

	public void setBirthNonth(String birthNonth) {
		this.birthNonth = birthNonth;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(String deathYear) {
		this.deathYear = deathYear;
	}

	public String getDeathNonth() {
		return deathNonth;
	}

	public void setDeathNonth(String deathNonth) {
		this.deathNonth = deathNonth;
	}

	public String getDeathDay() {
		return deathDay;
	}

	public void setDeathDay(String deathDay) {
		this.deathDay = deathDay;
	}

	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
