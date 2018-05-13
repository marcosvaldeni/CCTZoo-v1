package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Aquatic;
import animaltypes.Mammal;

public class Whale extends Animal implements Mammal, Aquatic {
	public Whale(){
		this.addDiet(Food.FISH);
	};
	public Whale(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.FISH);
	}

	@Override
	public void swimming() {
		System.out.println("Swimming!");
	}

	@Override
	public void lactate() {
		System.out.println("Giving milk!");
	}

}
