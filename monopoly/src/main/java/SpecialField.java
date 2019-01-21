import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


import java.util.ArrayList;

public class SpecialField {

    FieldDetection fieldDetection = new FieldDetection();

    public void specialEvent(FlowPane pawn, ArrayList<Properties> opponentProperties, Bank myBank, Bank opponentsBank, Text money,
                             Text opponentsMoney, Properties properties, Text info, Bank parking, Label parkingLabel, ArrayList<Properties> myProperties) {



        String fieldName = fieldDetection.field(pawn).getName();


        if (opponentProperties.contains(properties)) {
            opponentsBank.addAmount(properties.getRent());
            myBank.removeAmount(properties.getRent());
            money.setText("Bank: " + myBank.getAmount() + "$");
            opponentsMoney.setText("Bank: " + opponentsBank.getAmount() + "$");

        } if (fieldDetection.field(pawn).getValue() == 0) {

            if (fieldName.equals("START")){
                myBank.addAmount(200);
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

           /*else if ("GO TO JAIL".equals(fieldName)){
                GridPane.setColumnIndex(pawn,0);
                GridPane.setRowIndex(pawn,10);
            }*/

            else if("Income Tax".equals(fieldName)){
                myBank.removeAmount(200);
                parking.addAmount(200);
                parkingLabel.setText(parking.getAmount() + "$");
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if("Luxury Tax".equals(fieldName)){
                myBank.removeAmount(200);
                parking.addAmount(200);
                parkingLabel.setText(parking.getAmount() + "$");
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if("Community Chest".equals(fieldName)){
                info.setText("You pay 50$");
                myBank.removeAmount(50);
                parking.addAmount(50);
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");

            }

            else if("Parking".equals(fieldName)){
                myBank.addAmount(parking.getAmount());
                parking.removeAmount(parking.getAmount());
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");

            }

            else if("Chance".equals(fieldName)){
                info.setText("You must pay a tax.\n" +
                        "You pay 50$ for every\n" +
                        "property you own");

                myBank.removeAmount(50 * myProperties.size());
                parking.addAmount(50 * myProperties.size());
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");


           }


            }

        }
    }


