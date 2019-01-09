import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Move {

    OponentBuy oponentBuy = new OponentBuy();

    public void move(Label text, Text field, Text price, FlowPane pawn, Text turn, FlowPane pawn2){

        Random generator = new Random();
        FieldDetection fieldDetection = new FieldDetection();
        int los = generator.nextInt(6) + 1;
        text.setText("Los : " + los);



        //for (int i = 1; i <= los; i++){

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


       //}


        field.setText(fieldDetection.field(pawn).getName());
        price.setText("Price: " + fieldDetection.field(pawn).getValue() + "$");
        turn.setText("Opponent turn!");



        opponentMove(pawn2,text,turn);

        /*try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }*/


        }



        public void opponentMove(FlowPane pawn2, Label text, Text turn ){


            Random generator = new Random();
            FieldDetection fieldDetection = new FieldDetection();
            int los = generator.nextInt(6) + 1;
            text.setText("Los : " + los);

            for (int i = 1; i <= los; i++) {

                if (GridPane.getColumnIndex(pawn2) < 10 && GridPane.getRowIndex(pawn2) == 0) {
                    GridPane.setColumnIndex(pawn2, GridPane.getColumnIndex(pawn2) + 1);
                } else if (GridPane.getColumnIndex(pawn2) >= 10 && GridPane.getRowIndex(pawn2) <= 9) {
                    GridPane.setRowIndex(pawn2, GridPane.getRowIndex(pawn2) + 1);
                } else if (GridPane.getColumnIndex(pawn2) > 0 && GridPane.getRowIndex(pawn2) <= 10) {
                    GridPane.setColumnIndex(pawn2, GridPane.getColumnIndex(pawn2) - 1);
                } else if (GridPane.getColumnIndex(pawn2) == 0 && GridPane.getRowIndex(pawn2) <= 10) {
                    GridPane.setRowIndex(pawn2, GridPane.getRowIndex(pawn2) - 1);
                }
            }

            oponentBuy.buy(pawn2);
            turn.setText("Your turn!");





    }




    }

