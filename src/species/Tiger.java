package species;
import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Mammal;



public class Tiger extends Animal implements Mammal {
	public Tiger(){
		this.addDiet(Food.FISH,Food.MEAT);
	};
	public Tiger(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.FISH,Food.MEAT);
	}

	@Override
	public void lactate() {
		System.out.println("Giving milk!");
		
	}

}
