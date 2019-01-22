import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

public class Move {

    FieldDetection fieldDetection = new FieldDetection();
    SpecialField specialField = new SpecialField();
    Random generator = new Random();


    public void move(Label text, Text field, Text price, FlowPane pawn, ArrayList<Properties> opponentProperties, Bank myBank,
                     Bank opponentsBank, Text money, Properties properties, Text opponentsMoney, Bank parking, Label parkingLabel,
                     ArrayList<Properties> myproperties) {

        int los = generator.nextInt(6) + 1;
        text.setText("Los : " + los);


        movePawnCheckStart(pawn, myBank, money, los);


        field.setText(fieldDetection.field(pawn).getName());
        price.setText("Price: " + fieldDetection.field(pawn).getValue() + "$");

        if (opponentProperties.contains(properties) || fieldDetection.field(pawn).getValue() == 0) {
            specialField.specialEvent(pawn, opponentProperties, myBank, opponentsBank, money, opponentsMoney, properties, price, parking, parkingLabel,myproperties);


        }


        /*try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }*/


    }





    public void opponentMove(FlowPane pawn2, ArrayList myProperties, Properties properties, Bank opponentsBank,
                             Bank myBank, Text opponentsMoney, Text money, Text info, Bank parking, Label parkingLabel,ArrayList opponentsProperties) {

        int los = generator.nextInt(6) + 1;


        movePawnCheckStart(pawn2, opponentsBank, opponentsMoney, los);

        if (myProperties.contains(properties) || fieldDetection.field(pawn2).getValue() == 0) {
                specialField.specialEvent(pawn2, myProperties, opponentsBank, myBank, opponentsMoney, money, properties, info, parking, parkingLabel,opponentsProperties);
            }





    }

    private void movePawnCheckStart(FlowPane pawn, Bank opponentsBank, Text opponentsMoney, int los) {
        for (int i = 1; i <= los; i++) {

            movePawn(pawn);

            if ("START".equals(fieldDetection.field(pawn).getName())){
                opponentsBank.addAmount(200);
                opponentsMoney.setText("Bank: " + opponentsBank.getAmount() + "$");
            }

        }
    }


    private void movePawn(FlowPane pawn) {


        if (GridPane.getColumnIndex(pawn) < 10 && GridPane.getRowIndex(pawn) == 0) {
            GridPane.setColumnIndex(pawn, GridPane.getColumnIndex(pawn) + 1);
        } else if (GridPane.getColumnIndex(pawn) >= 10 && GridPane.getRowIndex(pawn) <= 9) {
            GridPane.setRowIndex(pawn, GridPane.getRowIndex(pawn) + 1);
        } else if (GridPane.getColumnIndex(pawn) > 0 && GridPane.getRowIndex(pawn) <= 10) {
            GridPane.setColumnIndex(pawn, GridPane.getColumnIndex(pawn) - 1);
        } else if (GridPane.getColumnIndex(pawn) == 0 && GridPane.getRowIndex(pawn) <= 10) {
            GridPane.setRowIndex(pawn, GridPane.getRowIndex(pawn) - 1);
        }


    }
}

