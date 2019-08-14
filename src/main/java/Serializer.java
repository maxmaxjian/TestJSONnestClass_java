import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

    private static String outFile = "test.json";

    public static void main(String[] args) throws JsonMappingException, IOException {
        Lion lion = new Lion("lion");
        Tiger tiger = new Tiger("tiger");
        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(tiger);
        Zoo zoo = new Zoo("My Park", "Bos");
        zoo.setAnimals(animals);

        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(new FileWriter(new File(outFile)), lion);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outFile), zoo);
//        mapper.writeValue(new File(outFile), tiger);
    }

}
