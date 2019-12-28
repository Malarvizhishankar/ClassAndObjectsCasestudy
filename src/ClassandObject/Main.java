package ClassandObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String st1,st2;
		st1=br.readLine();
		st2=br.readLine();
		Team t = new Team(st1,st2);
	}

}
