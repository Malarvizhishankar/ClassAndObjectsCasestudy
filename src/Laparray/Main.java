package Laparray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Lapdetail.Lap;

public class Main {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Byte lapNo = Byte.parseByte(br.readLine());
		Byte throwsMade = Byte.parseByte(br.readLine());
		String fastestPlayer =br.readLine();
		Float fastestTime=Float.parseFloat(br.readLine());
		Lap l = new Lap(lapNo,throwsMade,fastestPlayer,fastestTime);
		LapManager lm = new LapManager();
		lm.displayAllLaps(null);
	}

}
