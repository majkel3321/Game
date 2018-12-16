import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import java.util.HashMap;
import java.util.Map;


public class FieldDetection {


    public int  fieldDetection(Label field, FlowPane pawn){

        int x = GridPane.getColumnIndex(pawn);
        int y = GridPane.getRowIndex(pawn);
        int price = 0;
        Properties properties = new Properties();

        HashMap<String,Integer> propertiesMap = properties.getMap();

        HashMap<Integer,HashMap> property = new HashMap<>();

       /* property.put(1,propertiesMap.);
        property.put("Kentucky\nAvenue",220);*/

        if(x == 0 && y == 0){
            field.setText(property.);
        }

        else if (x == 1 && y == 0){
            field.setText(property.get(2));
            price = 220;
        }

        else if (x == 2 && y == 0) {
            field.setText("Chance");
        }

        else if (x == 3 && y == 0){
            field.setText("Indiana \nAvenue");
            price = 220;
        }

        else if (x == 4 && y == 0){
            field.setText("Illinois \nAvenue");
            price = 240;
        }

        else if (x == 5 && y == 0){
            field.setText("B. & O. \nRailroad");
            price = 200;
        }

        else if (x == 6 && y == 0){
            field.setText("Atlantic \nAvenue");
            price = 260;
        }

        else if (x == 7 && y == 0){
            field.setText("Ventnor \nAvenue");
            price = 260;
        }

        else if (x == 8 && y == 0){
            field.setText("Water \nWorks");
            price = 150;
        }

        else if (x == 9 && y == 0){
            field.setText("Marvin \nGardens");
            price = 280;
        }

        else if (x == 10 && y == 0){
            field.setText("GO TO  \nJAIL");
        }

        return price;
    }



}
