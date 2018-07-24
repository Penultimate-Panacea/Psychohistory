package penultimate.psychohistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PsychohistoryApplication {

	public static void main(String[] args) {
        System.out.println("Initalized");
		DataUpdater du = new DataUpdater();
		System.out.println("Starting Factions");
		du.getFactionsFromURL();
		System.out.println("Complete Factions");
		System.out.println("Starting Stations");
		du.getStationsFromURL();
		System.out.println("Complete Stations");
		System.out.println("Starting SystemsPopulated");
		du.getSystemsPopluatedFromURL();
		System.out.println("Complete SystemsPopulated");
		System.out.println("Completed");
	    SpringApplication.run(PsychohistoryApplication.class, args);

	}
}
