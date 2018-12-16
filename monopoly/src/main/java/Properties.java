import java.util.HashMap;
import java.util.Map;

public class Properties {

    HashMap<String,Integer> properties = new HashMap<>();

    public Properties(){
        properties.put("Parking",1);
        properties.put("Kentucky\nAvenue",220);
    }

    public HashMap<String,Integer> getMap(){
        return properties;
    }
}
