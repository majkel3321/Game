import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashMap;


public class BuyHotel {

    int bank = 1500;
    FieldDetection fieldDetection = new FieldDetection();



    public void buyHotel(ArrayList<Properties> playersProperties, Label propertyList, Text price, FlowPane pawn, Text money){

        int key = fieldDetection.field(pawn).value;


        if(key == 0){
            price.setText("You can't buy it!");
        }

        else {

            if (playersProperties.contains(fieldDetection.field(pawn))) {
                price.setText("It's already\nyours!");

            } else {

                int value = fieldDetection.field(pawn).getValue();
                bank -= value;
                money.setText("Bank: " + bank + "$");
                playersProperties.add(fieldDetection.field(pawn));
                propertyList.setText("My properties:" + playersProperties);

            }

        }

    }
}
