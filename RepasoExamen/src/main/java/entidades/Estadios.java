package entidades;

import java.time.LocalDateTime;

public class Estadios {
	private int StadiumId;
	private String StadiumName;
	private String Capacity;
	private int City;
	private LocalDateTime InaugurationDate;
	public int getStadiumId() {
		return StadiumId;
	}
	public void setStadiumId(int stadiumId) {
		StadiumId = stadiumId;
	}
	public String getStadiumName() {
		return StadiumName;
	}
	public void setStadiumName(String stadiumName) {
		StadiumName = stadiumName;
	}
	public String getCapacity() {
		return Capacity;
	}
	public void setCapacity(String capacity) {
		Capacity = capacity;
	}
	public int getCity() {
		return City;
	}
	public void setCity(int city) {
		City = city;
	}
	public LocalDateTime getInaugurationDate() {
		return InaugurationDate;
	}
	public void setInaugurationDate(LocalDateTime inaugurationDate) {
		InaugurationDate = inaugurationDate;
	}
	@Override
	public String toString() {
		return "Estadios [StadiumId=" + StadiumId + ", StadiumName=" + StadiumName + ", Capacity=" + Capacity
				+ ", City=" + City + ", InaugurationDate=" + InaugurationDate + "]";
	}
	
	
}
