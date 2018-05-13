package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Aquatic;
import animaltypes.Mammal;

public class Hypopotome extends Animal implements Mammal,Aquatic {
	public Hypopotome(){
		this.addDiet(Food.MEAT);
	};
	public Hypopotome(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.MEAT);
	}

	@Override
	public void lactate() {
		System.out.println("Giving milk!");

	}

	@Override
	public void swimming() {
		System.out.println("Swimming!");
		
	}

}
