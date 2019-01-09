import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.Random;

public class OponentBuy {

    ArrayList<Properties> oponentProperties = new ArrayList<>();
    FieldDetection fieldDetection = new FieldDetection();

    public void buy(FlowPane pawn2){

        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(10)+1;

        if(random <= 3){

            oponentProperties.add(fieldDetection.field(pawn2));

        }


    }



}
