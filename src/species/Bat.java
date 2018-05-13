package species;
import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Avian;
import animaltypes.Mammal;

public class Bat extends Animal implements Mammal, Avian {
	public Bat(){
		this.addDiet(Food.FRUIT);
	};
	public Bat(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.FRUIT);
	}

	@Override
	public void fly() {
		System.out.println("Flying!");
	}

	@Override
	public void walk() {
		System.out.println("Walking!");
	}

	@Override
	public void lactate() {
		System.out.println("Giving milk!");
	}


}
