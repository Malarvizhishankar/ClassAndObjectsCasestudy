package Laparray;

public class Lap {
	
	private Byte lapNo ;
	private Byte throwsMade;
	private String fastestPlayer;
	private Float fastestTime;
	
	public Byte getLapNo() {
		return lapNo;
	}
	public void setLapNo(Byte lapNo) {
		this.lapNo = lapNo;
	}
	public Byte getThrowsMade() {
		return throwsMade;
	}
	public void setThrowsMade(Byte throwsMade) {
		this.throwsMade = throwsMade;
	}
	public String getFastestPlayer() {
		return fastestPlayer;
	}
	public void setFastestPlayer(String fastestPlayer) {
		this.fastestPlayer = fastestPlayer;
	}
	public Float getFastestTime() {
		return fastestTime;
	}
	public void setFastestTime(Float fastestTime) {
		this.fastestTime = fastestTime;
	}
	
	public Lap(Byte lapNo, Byte throwsMade, String fastestPlayer, Float fastestTime) {
		super();
		this.lapNo = lapNo;
		this.throwsMade = throwsMade;
		this.fastestPlayer = fastestPlayer;
		this.fastestTime = fastestTime;
		
		
	}
	@Override
	public String toString() {
		return "Lap [lapNo=" + lapNo + ", throwsMade=" + throwsMade + ", fastestPlayer=" + fastestPlayer
				+ ", fastestTime=" + fastestTime + "]";
	}
	
}
