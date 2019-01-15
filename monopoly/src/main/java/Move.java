import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

public class Move {

    //OpponentBuy opponentBuy = new OpponentBuy();
    FieldDetection fieldDetection = new FieldDetection();
    SpecialField specialField = new SpecialField();
    Random generator = new Random();





    public void move(Label text, Text field, Text price,FlowPane pawn,ArrayList opponentProperties, Bank myBank, Bank opponentsBank, Text money, Properties properties, Text opponentsMoney){

        int los = generator.nextInt(6) + 1;
        text.setText("Los : " + los);



       // for (int i = 1; i <= los; i++){

            if (GridPane.getColumnIndex(pawn) < 10 && GridPane.getRowIndex(pawn) == 0 ) {
                GridPane.setColumnIndex(pawn, GridPane.getColumnIndex(pawn) + 1);
            }
            else if (GridPane.getColumnIndex(pawn) >= 10 && GridPane.getRowIndex(pawn) <= 9){
                GridPane.setRowIndex(pawn,GridPane.getRowIndex(pawn) + 1 );
            }
            else if (GridPane.getColumnIndex(pawn) > 0 && GridPane.getRowIndex(pawn) <= 10){
                GridPane.setColumnIndex(pawn, GridPane.getColumnIndex(pawn) - 1);
            }
             else if(GridPane.getColumnIndex(pawn) == 0 && GridPane.getRowIndex(pawn) <= 10 )
            {
                GridPane.setRowIndex(pawn,GridPane.getRowIndex(pawn) - 1);
            }


     // }


        field.setText(fieldDetection.field(pawn).getName());
        price.setText("Price: " + fieldDetection.field(pawn).getValue() + "$");

        if (opponentProperties.contains(properties)){
            specialField.specialEvent(opponentProperties, myBank, opponentsBank,money,opponentsMoney,properties);

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



        public void opponentMove(FlowPane pawn2, ArrayList myProperties, Properties properties, Bank opponentsBank, Bank myBank, Text opponentsMoney, Text money ){

            int los = generator.nextInt(6) + 1;


           // for (int i = 1; i <= los; i++) {

                if (GridPane.getColumnIndex(pawn2) < 10 && GridPane.getRowIndex(pawn2) == 0) {
                    GridPane.setColumnIndex(pawn2, GridPane.getColumnIndex(pawn2) + 1);
                } else if (GridPane.getColumnIndex(pawn2) >= 10 && GridPane.getRowIndex(pawn2) <= 9) {
                    GridPane.setRowIndex(pawn2, GridPane.getRowIndex(pawn2) + 1);
                } else if (GridPane.getColumnIndex(pawn2) > 0 && GridPane.getRowIndex(pawn2) <= 10) {
                    GridPane.setColumnIndex(pawn2, GridPane.getColumnIndex(pawn2) - 1);
                } else if (GridPane.getColumnIndex(pawn2) == 0 && GridPane.getRowIndex(pawn2) <= 10) {
                    GridPane.setRowIndex(pawn2, GridPane.getRowIndex(pawn2) - 1);
                }
           // }

            if (myProperties.contains(properties)){
                specialField.specialEvent(myProperties, opponentsBank, myBank, opponentsMoney, money, properties);
            }



    }




    }

