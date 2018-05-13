package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Mammal;

public class Bear extends Animal implements Mammal {
	public Bear(){
		this.addDiet(Food.MEAT);
	};
	public Bear(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.MEAT);
	}

	@Override
	public void lactate() {
		System.out.println("Giving milk!");

	}

}
