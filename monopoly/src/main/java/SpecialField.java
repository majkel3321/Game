import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class SpecialField {


    public void specialEvent(ArrayList opponentProperties, Bank myBank, Bank opponentsBank, Text money, Text opponentsMoney, Properties properties) {


        if (opponentProperties.contains(properties)){

            opponentsBank.amount += 100;
            myBank.amount -= 100;
            money.setText("Bank: " + myBank.getAmount() + "$");
            opponentsMoney.setText("Bank: " + opponentsBank.getAmount() + "$");
        }

        else{
            money.setText("Menda");
        }




       /* if (fieldDetection.field(pawn).getValue() == 0) {

            if (fieldDetection.field(pawn).getName() == "GO TO JAIL") {

                GridPane.setColumnIndex(pawn, 0);
                GridPane.setRowIndex(pawn, 10);
            }
        } else {

            if (opponentProperties.contains(fieldDetection.field(pawn))){

                myBank.amount -= 100;
                money.setText("Banksy:" + myBank.getAmount());

            }


        }*/
    }
}
