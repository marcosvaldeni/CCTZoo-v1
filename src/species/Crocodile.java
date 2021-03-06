package species;

import java.time.LocalDate;
import java.util.List;

import utils.Food;
import animaltypes.Aquatic;
import animaltypes.Reptile;

public class Crocodile extends Animal implements Reptile, Aquatic {
	public Crocodile(){
		this.addDiet(Food.MEAT);
	};
	public Crocodile(String Name,LocalDate dateOfBirth, LocalDate dateOfArrival,
			Character gender, List<Animal> offspring) {
		super(Name, dateOfBirth, dateOfArrival, gender, offspring);
		this.addDiet(Food.MEAT);
	}

	@Override
	public void swimming() {
		System.out.println("Swimming!");
		
	}

	@Override
	public void walk() {
		System.out.println("Walking!");
		
	}

	@Override
	public void crawl() {
		System.out.println("Crawling!");
		
	}


}
