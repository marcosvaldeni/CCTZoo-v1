package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Insect;

public class Scorpion extends Animal implements Insect {
	public Scorpion(){
		this.addDiet(Food.FRUIT);
	};
	public Scorpion(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.FRUIT);
	}

	@Override
	public void metamorphose() {
		System.out.println("Metamorphosing!");
	}


}
