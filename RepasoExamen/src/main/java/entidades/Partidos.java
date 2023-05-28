package entidades;

import java.time.LocalDateTime;

public class Partidos {

	private LocalDateTime MatchDate;
	private int HomeTeamId;
	private int AwayTeamScore;
	private int HomeTeamScore;
	private int MatchId;
	private int AwayTeamId;
	
	private String Local;
	private String Visitante;
	
	public LocalDateTime getMatchDate() {
		return MatchDate;
	}
	public void setMatchDate(LocalDateTime matchDate) {
		MatchDate = matchDate;
	}
	public int getHomeTeamId() {
		return HomeTeamId;
	}
	public void setHomeTeamId(int homeTeamId) {
		HomeTeamId = homeTeamId;
	}
	public int getAwayTeamScore() {
		return AwayTeamScore;
	}
	public void setAwayTeamScore(int awayTeamScore) {
		AwayTeamScore = awayTeamScore;
	}
	public int getHomeTeamScore() {
		return HomeTeamScore;
	}
	public void setHomeTeamScore(int homeTeamScore) {
		HomeTeamScore = homeTeamScore;
	}
	public int getMatchId() {
		return MatchId;
	}
	public void setMatchId(int matchId) {
		MatchId = matchId;
	}
	public int getAwayTeamId() {
		return AwayTeamId;
	}
	public void setAwayTeamId(int awayTeamId) {
		AwayTeamId = awayTeamId;
	}
	
	public String getLocal() {
		return Local;
	}
	public void setLocal(String local) {
		Local = local;
	}
	public String getVisitante() {
		return Visitante;
	}
	public void setVisitante(String visitante) {
		Visitante = visitante;
	}
	@Override
	public String toString() {
		return "Partidos [MatchDate=" + MatchDate + ", HomeTeamId=" + HomeTeamId + ", AwayTeamScore=" + AwayTeamScore
				+ ", HomeTeamScore=" + HomeTeamScore + ", MatchId=" + MatchId + ", AwayTeamId=" + AwayTeamId
				+ ", Local=" + Local + ", Visitante=" + Visitante + "]";
	}

	
	
}
