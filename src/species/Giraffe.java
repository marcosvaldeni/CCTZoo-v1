package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Mammal;

public class Giraffe extends Animal implements Mammal {
	public Giraffe(){
		this.addDiet(Food.PLANT);
	};
	public Giraffe(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.PLANT);
	}

	@Override
	public void lactate() {
		System.out.println("Giving milk!");

	}

}
