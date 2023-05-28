package entidades;

public class Jugadores {

	private int PlayerId;
	private int TeamId;
	private String LastName;
	private String FirstName;
	public int getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}
	public int getTeamId() {
		return TeamId;
	}
	public void setTeamId(int teamId) {
		TeamId = teamId;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	@Override
	public String toString() {
		return "Jugadores [PlayerId=" + PlayerId + ", TeamId=" + TeamId + ", LastName=" + LastName + ", FirstName="
				+ FirstName + "]";
	}
	
	
	
}
