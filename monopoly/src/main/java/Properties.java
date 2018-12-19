import java.util.HashMap;
import java.util.Map;

public class Properties {

    String name;
    int value;

    public Properties(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return name;
    }
}
