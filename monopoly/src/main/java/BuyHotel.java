import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashMap;


public class BuyHotel {


    public void buyHotel(ArrayList<Properties> playersProperties, Label propertyList, Text price, Text money,
                         ArrayList<Properties> opponentProperties, Properties properties, Bank myBank){


        if (properties.getValue() == 0){
            price.setText("You can't buy it!");
        }
        else{

            if(playersProperties.contains(properties)){
                price.setText("It's already\nyours!");
            }

            else{

                if (opponentProperties.contains(properties)){
                    price.setText("Opponent have it!");
                }

                else{

                    if(myBank.getAmount()- properties.getValue() < 0){
                        price.setText("You don't have\nenough money!");
                    }

                    else{

                        playersProperties.add(properties);
                        myBank.amount -= properties.getValue();
                        propertyList.setText("My properties:\n" + playersProperties);
                        money.setText("Bank: " + myBank.getAmount() + "$");
                    }

                }
            }
        }


    }

}
