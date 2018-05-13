package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class FileUtil {

	public static boolean readFile(InputStream reader){
		
		try {
		    Properties props = new Properties();
		    props.load(reader);
		    int animalTotal = Integer.parseInt(props.getProperty("Animals","100"));
		    int keeperTotal = Integer.parseInt(props.getProperty("Keepers","40"));
		    List<String> names = Arrays.asList(props.getProperty("Names","John,Mary").split(", "));
		    List<String> surnames = Arrays.asList(props.getProperty("SurNames","Aaberg, Aaby").split(", "));
		    Util.createKeepers(keeperTotal, names, surnames);
		    List<Integer> values = Util.generateArrayInteger(animalTotal,InterfacesUtil.loadAnimalSpecies().size());
		    for (int i = 0; i < InterfacesUtil.loadAnimalSpecies().size(); i++) {
		    	Util.createAnimals(InterfacesUtil.loadAnimalSpecies().get(i),values.get(i) , names);
			}
		    reader.close();
		} catch (FileNotFoundException ex) {
		    System.out.println("file does not exist");
		    return false;
		} catch (IOException ex) {
		    System.out.println("I/O error");
		    return false;
		}
		return true;
	}
}
