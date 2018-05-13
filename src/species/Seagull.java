package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Avian;

public class Seagull extends Animal implements Avian {
	public Seagull(){
		this.addDiet(Food.FISH);
	};
	public Seagull(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.FISH);
	}

	@Override
	public void fly() {
		System.out.println("Flying!");

	}

	@Override
	public void walk() {
		System.out.println("Walking!");

	}

}
