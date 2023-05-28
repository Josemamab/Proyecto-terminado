package entidades;

public class Clubes {

	private int TeamId;
	private String TeamName;
	private String City;
	private String StadiumId;
	private int Capacity;
	private String StadiumName;
	public int getTeamId() {
		return TeamId;
	}
	public void setTeamId(int teamId) {
		TeamId = teamId;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStadiumId() {
		return StadiumId;
	}
	public void setStadiumId(String stadiumId) {
		StadiumId = stadiumId;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public String getStadiumName() {
		return StadiumName;
	}
	public void setStadiumName(String stadiumName) {
		StadiumName = stadiumName;
	}
	@Override
	public String toString() {
		return "Clubes [TeamId=" + TeamId + ", TeamName=" + TeamName + ", City=" + City + ", StadiumId=" + StadiumId
				+ ", Capacity=" + Capacity + ", StadiumName=" + StadiumName + "]";
	}

	
}
