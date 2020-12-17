package theme_17;

import java.util.ArrayList;

public class F1_Test {

	public static void main(String[] args) {
		
		Team team = new Team ();
		team.name = "Mercedes";
		
		National HamiltonCountry = new National();
		HamiltonCountry.name = "England";
		
		National BottasCountry = new National();
		BottasCountry.name = "Finland";
		
		Pilots pilots1 = new Pilots();
		pilots1.national = HamiltonCountry;
		pilots1.name = "Hamilton";
		
		Pilots pilots2 = new Pilots();
		pilots2.national = BottasCountry;
		pilots2.name = "Bottas";
		
		team.pilot = new Arrays.asList(pilots1, pilots2);
		
		
		for (Pilots pilots : team.pilot) {
			System.out.println( pilots.name + " " + pilots.national.name );
		}
		
		

	}

}
