import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Deserlizer {

    private static String inFile = "test.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Zoo zoo = mapper.readValue(new File(inFile), Zoo.class);
        System.out.println(zoo.toString());
    }
}
