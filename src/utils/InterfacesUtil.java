package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import animaltypes.AnimalType;
import animaltypes.Aquatic;
import animaltypes.Avian;
import animaltypes.Insect;
import animaltypes.Mammal;
import animaltypes.Reptile;
import species.Animal;
import species.Bat;
import species.Bear;
import species.Crocodile;
import species.Giraffe;
import species.Hypopotome;
import species.Scorpion;
import species.Seagull;
import species.Snake;
import species.Tiger;
import species.Whale;

public class InterfacesUtil {
	public static List<Class<?extends AnimalType>> animaltypes = null;
	public static List<Class<?extends Animal>> animalspecies = null;
	public static List<Class<?extends Animal>> animalSpeciesByType(Class<?extends AnimalType> type){
		return animalspecies.stream().filter(
				x->Arrays.asList(x.getInterfaces()).stream().anyMatch(
						y->y.getSimpleName().equals(type.getSimpleName())
				)
		).collect(Collectors.toList());
	}
	public static List<Class<?extends AnimalType>> loadAnimalTypes() {
		if(animaltypes == null){
			animaltypes = new ArrayList<Class<?extends AnimalType>>();
			animaltypes.add(Aquatic.class);
			animaltypes.add(Insect.class);
			animaltypes.add(Reptile.class);
			animaltypes.add(Avian.class);
			animaltypes.add(Mammal.class);
		}
		return animaltypes;
	}
	public static List<Class<?extends Animal>> loadAnimalSpecies() {
		if(animalspecies == null){
			animalspecies = new ArrayList<Class<?extends Animal>>();
			animalspecies.add(Bat.class);
			animalspecies.add(Bear.class);
			animalspecies.add(Crocodile.class);
			animalspecies.add(Giraffe.class);
			animalspecies.add(Hypopotome.class);
			animalspecies.add(Scorpion.class);
			animalspecies.add(Seagull.class);
			animalspecies.add(Snake.class);
			animalspecies.add(Tiger.class);
			animalspecies.add(Whale.class);
		}
		return animalspecies;
	}
}
