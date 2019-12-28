package Playerdetails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		byte matchpld = Byte.parseByte(br.readLine());
		byte now = Byte.parseByte(br.readLine());
		byte nol = Byte.parseByte(br.readLine());
		float avglapspd = Float.parseFloat(br.readLine());
		float maxlapspd = Float.parseFloat(br.readLine());
		float avgthwdt = Float.parseFloat(br.readLine());
		float maxthwdt = Float.parseFloat(br.readLine());
		PlayerRecord pr=new PlayerRecord(matchpld,now,nol,avglapspd,maxlapspd,avgthwdt,maxthwdt);
		pr.displayPlayerRecord();
	}

}
