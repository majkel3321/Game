import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

public class OpponentBuy {

    public void buy(Label opponentLabel, ArrayList<Properties> playerProperties,
                    ArrayList<Properties> opponentProperties, Text opponentMoney, Properties properties, Bank opponentsBank){

        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(10)+1;

        if (properties.getValue() != 0){

            if (!opponentProperties.contains(properties)){

                if (!playerProperties.contains(properties)){

                    if (opponentsBank.getAmount() - properties.getValue() > 0){

                        if (random < 5){
                            opponentProperties.add(properties);
                            opponentsBank.removeAmount(properties.getValue());
                            opponentLabel.setText("Opponent properties:\n" + opponentProperties);
                            opponentMoney.setText("Bank: " + opponentsBank.getAmount() + "$");
                        }
                    }
                }
            }
        }


    }



}
