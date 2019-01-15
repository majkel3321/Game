import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


import java.util.ArrayList;

public class SpecialField {

    FieldDetection fieldDetection = new FieldDetection();


    public void specialEvent(FlowPane pawn, ArrayList opponentProperties, Bank myBank, Bank opponentsBank, Text money,
                             Text opponentsMoney, Properties properties, Text info, Bank parking, Label parkingLabel) {


        String fieldName = fieldDetection.field(pawn).getName();

        if (opponentProperties.contains(properties)){
            opponentsBank.amount += (properties.getValue()/10);
            myBank.amount -= (properties.getValue()/10);
            money.setText("Bank: " + myBank.getAmount() + "$");
            opponentsMoney.setText("Bank: " + opponentsBank.getAmount() + "$");
        }

         else if(fieldDetection.field(pawn).getValue() == 0){

            if (fieldName == "START"){
                myBank.amount += 200;
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if (fieldName == "GO TO JAIL"){
                GridPane.setColumnIndex(pawn,10);
                GridPane.setRowIndex(pawn,2);
            }

            else if(fieldName == "Income Tax"){
                myBank.amount -= 200;
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if(fieldName == "Luxury Tax"){
                myBank.amount -= 100;
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if(fieldName == "Community Chest"){
                info.setText("You pay 100$");
                myBank.amount -= 100;
                parking.amount += 100;
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");

            }

            else if(fieldName == "Parking"){
                myBank.amount += parking.getAmount();
                parking.amount = 0;
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");

            }

        }


        }
    }

