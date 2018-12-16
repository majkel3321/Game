import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import java.util.Random;

public class Move {

    public void move(Label text, Label field, FlowPane pawn){

        Random generator = new Random();
        FieldDetection fieldDetection = new FieldDetection();
        int los = generator.nextInt(6) + 1;
        text.setText("Los :" + los);

        GridPane.setColumnIndex(pawn, GridPane.getColumnIndex(pawn) + 1);

       /* for (int i = 1; i <= los; i++){

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


        }*/

        fieldDetection.fieldDetection(field,pawn);             //returns price

    }




    }

