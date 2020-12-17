package theme_17;

import java.util.ArrayList;
import java.util.Arrays;

class Pilots {
	String name;
	Team team;
	National national;
	
	ArrayList <Race> races;
	
	Pilots(){
		races = new ArrayList<Race> (Arrays.asList(
				new Race (1),
				new Race (2),
				new Race (3)
				));
	}

}
