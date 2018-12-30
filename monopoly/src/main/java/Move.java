import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

public class Move {

    public void move(Label text, Text field, Text price, Text money, Label propertyList, FlowPane pawn, int bank, ArrayList<Properties> list){

        Random generator = new Random();
        FieldDetection fieldDetection = new FieldDetection();
        int los = generator.nextInt(6) + 1;
        text.setText("Los :" + los);



        for (int i = 1; i <= los; i++){

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


        }


        field.setText(fieldDetection.field(pawn).getName());
        price.setText("Price: " + fieldDetection.field(pawn).getValue() + "$");
        money.setText("Bank: " + bank + "$");
        propertyList.setText("My properties:" + list);





    }




    }

