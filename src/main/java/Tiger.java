import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tiger extends Animal {
    public String name;

    @JsonCreator
    public Tiger(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public String getType() {
//        return "carnivorous";
//    }

    @Override
    public String toString() {
        return "Tiger [name=" + name + ", getName()=" + getName()/* + ", getType()=" + getType()*/;
    }
}
