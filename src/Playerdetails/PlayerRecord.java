package Playerdetails;

public class PlayerRecord {
	public PlayerRecord(byte matchesPlayed, byte numOfWins, byte numOfLosses, float avgLapSpeed, float maxLapSpeed,
			float avgThrowDistance, float maxThrowDistance) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.numOfWins = numOfWins;
		this.numOfLosses = numOfLosses;
		this.avgLapSpeed = avgLapSpeed;
		this.maxLapSpeed = maxLapSpeed;
		this.avgThrowDistance = avgThrowDistance;
		this.maxThrowDistance = maxThrowDistance;
	}

	private byte matchesPlayed;
	private byte numOfWins;
	private byte numOfLosses;
	private float avgLapSpeed;
	private float maxLapSpeed;
	private float avgThrowDistance;
	private float maxThrowDistance;
	
	void displayPlayerRecord()
	{
		System.out.println("No.of matchesPlayed: "+matchesPlayed);
		System.out.println("No.of Wins: "+numOfWins);
		System.out.println("No.of Losses: "+numOfLosses);
		System.out.println("Avg Lap Speed: "+avgLapSpeed);
		System.out.println("Max Lap Speed: "+maxLapSpeed);
		System.out.println("Avg Throw Distance: "+avgThrowDistance);
		System.out.println("Max Throw Distance: "+maxThrowDistance);
	}
}
