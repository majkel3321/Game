import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


import java.util.ArrayList;

public class SpecialField {

    FieldDetection fieldDetection = new FieldDetection();

    public void specialEvent(FlowPane pawn, ArrayList opponentProperties, Bank myBank, Bank opponentsBank, Text money,
                             Text opponentsMoney, Properties properties, Text info, Bank parking, Label parkingLabel, ArrayList myProperties) {



        String fieldName = fieldDetection.field(pawn).getName();


        if (opponentProperties.contains(properties)) {
            opponentsBank.amount += (properties.getValue() / 2);
            myBank.amount -= (properties.getValue() / 2);
            money.setText("Bank: " + myBank.getAmount() + "$");
            opponentsMoney.setText("Bank: " + opponentsBank.getAmount() + "$");
        } if (fieldDetection.field(pawn).getValue() == 0) {

           /* switch (fieldName) {

                case "START": {
                    myBank.amount += 200;
                    money.setText("Bank: " + myBank.getAmount() + "$");
                }
                break;

                case "GO TO JAIL": {
                    GridPane.setColumnIndex(pawn, 10);
                    GridPane.setRowIndex(pawn, 2);
                }
                break;

                case "Income Tax": {
                    myBank.amount -= 200;
                    money.setText("Bank: " + myBank.getAmount() + "$");
                }
                break;

                case "Luxury Tax": {
                    myBank.amount -= 100;
                    money.setText("Bank: " + myBank.getAmount() + "$");
                }
                break;

                case "Community Chest": {
                    info.setText("You must pay 100$");
                    myBank.amount -= 100;
                    parking.amount += 100;
                    money.setText("Bank: " + myBank.getAmount() + "$");
                    parkingLabel.setText(parking.getAmount() + "$");
                }
                break;

                case "Parking": {
                    myBank.amount += parking.getAmount();
                    parking.amount = 0;
                    money.setText("Bank: " + myBank.getAmount() + "$");
                    parkingLabel.setText(parking.getAmount() + "$");
                }
                break;*/



           /*  if (fieldName == "START"){
                myBank.amount += 200;
                money.setText("Bank: " + myBank.getAmount() + "$");
            }*/

           if (fieldName == "GO TO JAIL"){
                GridPane.setColumnIndex(pawn,0);
                GridPane.setRowIndex(pawn,10);
            }

            else if(fieldName == "Income Tax"){
                myBank.amount -= 200;
                parking.amount += 200;
                parkingLabel.setText(parking.getAmount() + "$");
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if(fieldName == "Luxury Tax"){
                myBank.amount -= 100;
                parking.amount += 100;
                parkingLabel.setText(parking.getAmount() + "$");
                money.setText("Bank: " + myBank.getAmount() + "$");
            }

            else if(fieldName == "Community Chest"){
                info.setText("You pay 50$");
                myBank.amount -= 50;
                parking.amount += 50;
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");

            }

            else if(fieldName == "Parking"){
                myBank.amount += parking.getAmount();
                parking.amount = 0;
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");

            }

            else if(fieldName == "Chance"){
                info.setText("You must pay a tax.\n" +
                        "You pay 50$ for every\n" +
                        "property you own");

                myBank.amount -= 50 * myProperties.size();
                parking.amount += 50 * myProperties.size();
                money.setText("Bank: " + myBank.getAmount() + "$");
                parkingLabel.setText(parking.getAmount() + "$");


           }


            }


        }
    }


