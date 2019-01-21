import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.util.ArrayList;



public class BuyHotel {


    public void buyHotel(ArrayList<Properties> playersProperties, Label propertyList, Text price, Text money,
                         ArrayList<Properties> opponentProperties, Properties properties, Bank myBank){


        if (properties.getValue() == 0){
            price.setText("You can't buy it!");
        }
        else{

            if(playersProperties.contains(properties)){
                price.setText("It's already\nyours!");
            }

            else{

                if (opponentProperties.contains(properties)){
                    price.setText("Opponent have it!");
                }

                else{

                    if(myBank.getAmount()- properties.getValue() < 0){
                        price.setText("You don't have\nenough money!");
                    }

                    else{

                        playersProperties.add(properties);
                        myBank.removeAmount(properties.getValue());
                        propertyList.setText("My properties:\n" + playersProperties);
                        money.setText("Bank: " + myBank.getAmount() + "$");
                    }

                }
            }
        }


    }


    public void build(GridPane grid, FlowPane pawn,Properties properties,ArrayList<Properties> myProperties,Text price,Bank myBank,Text money,Color color){

        int x = GridPane.getColumnIndex(pawn);
        int y = GridPane.getRowIndex(pawn);


        if (x < 10 && y == 0) {
            buildHotelX(grid,pawn,properties,myProperties,price,myBank,money,color);

        } else if (x >= 10 && y <= 9) {
            buildHotelY2(grid,properties,myProperties,price,myBank,money,x,y,color);

        } else if (x > 0 && y <= 10) {
            buildHotelX(grid,pawn,properties,myProperties,price,myBank,money,color);

        } else if (x == 0 && y <= 10) {
            buildHotelY1(grid,properties,myProperties,price,myBank,money,x,y,color);

        }



    }

    public void buildHotelX (GridPane grid,FlowPane pawn,Properties properties,ArrayList<Properties> myProperties,Text price,Bank myBank,Text money,Color color){

        int x = GridPane.getColumnIndex(pawn);
        int y = GridPane.getRowIndex(pawn);

        Rectangle rectangle = new Rectangle(26.6,28,color);
        rectangle.setTranslateX(2);
        rectangle.setTranslateY(-49);


        Label label = new Label("HOTEL");
        label.setTranslateX(6);
        label.setTranslateY(-48);
        label.setFont(new Font("Arial",22));
        label.setTextFill(Color.RED);

        if (myProperties.contains(properties)) {

            if (myBank.getAmount() - properties.getHotel() < 0 ){
                price.setText("You don't have\nenough money to\nbuild a house!");
            }

            else {


                if (properties.getLevel() == 0) {
                    grid.add(rectangle, x, y);
                    properties.addLevel();
                    myBank.removeAmount(properties.getHotel());
                    money.setText("Bank: " + myBank.getAmount() + "$");

                } else if (properties.getLevel() == 1) {
                    grid.add(rectangle, x, y);
                    rectangle.setTranslateX(28.6);
                    properties.addLevel();
                    myBank.removeAmount(properties.getHotel());
                    money.setText("Bank: " + myBank.getAmount() + "$");

                } else if (properties.getLevel() == 2) {
                    grid.add(rectangle, x, y);
                    rectangle.setTranslateX(55.2);
                    properties.addLevel();
                    myBank.removeAmount(properties.getHotel());
                    money.setText("Bank: " + myBank.getAmount() + "$");

                } else setLabel(grid, properties, myBank, money, x, y, label);
            }


        }

        else{

            price.setText("To build a hotel\nyou must buy it first!");


        }



    }

    public void buildHotelY1(GridPane grid,Properties properties,ArrayList<Properties> myProperties,Text price,Bank myBank,Text money,int x, int y,Color color){

        Rectangle rectangle = new Rectangle(26.6,28,color);
        rectangle.setTranslateX(103);
        rectangle.setTranslateY(-24);

        Label label = new Label("HOTEL");
        label.setTranslateY(1);
        label.setTranslateX(80);
        label.setRotate(90);
        label.setFont(new Font("Arial",22));
        label.setTextFill(Color.RED);

        buildHotelY(grid, properties, myProperties, price, myBank, money, x, y, rectangle, label);

    }

    public void buildHotelY2(GridPane grid,Properties properties,ArrayList<Properties> myProperties,Text price,Bank myBank,Text money,int x, int y,Color color){

        Rectangle rectangle = new Rectangle(26.6,28,color);
        rectangle.setTranslateX(2);
        rectangle.setTranslateY(-24);

        Label label = new Label("HOTEL");
        label.setTranslateY(1);
        label.setTranslateX(-20);
        label.setRotate(-90);
        label.setFont(new Font("Arial",22));
        label.setTextFill(Color.RED);

        buildHotelY(grid, properties, myProperties, price, myBank, money, x, y, rectangle, label);
    }

    private void buildHotelY(GridPane grid, Properties properties, ArrayList<Properties> myProperties, Text price, Bank myBank, Text money, int x, int y, Rectangle rectangle, Label label) {

        if (myProperties.contains(properties)) {

            if (myBank.getAmount() - properties.getHotel() < 0 ){
                price.setText("You don't have\nenough money to\nbuild a house!");
            }

            else {


                if (properties.getLevel() == 0) {
                    grid.add(rectangle, x, y);
                    properties.addLevel();
                    myBank.removeAmount(properties.getHotel());
                    money.setText("Bank: " + myBank.getAmount() + "$");
                }
                else if (properties.getLevel() == 1) {
                    grid.add(rectangle, x, y);
                    rectangle.setTranslateY(0);
                    properties.addLevel();
                    myBank.removeAmount(properties.getHotel());
                    money.setText("Bank: " + myBank.getAmount() + "$");

                } else if (properties.getLevel() == 2) {
                    grid.add(rectangle, x, y);
                    rectangle.setTranslateY(28);
                    properties.addLevel();
                    myBank.removeAmount(properties.getHotel());
                    money.setText("Bank: " + myBank.getAmount() + "$");

                } else {
                    setLabel(grid, properties, myBank, money, x, y, label);
                }
            }


        }

        else{

            price.setText("To build a hotel\nyou must buy it first!");


        }
    }

    private void setLabel(GridPane grid, Properties properties, Bank myBank, Text money, int x, int y, Label label) {
        if (properties.getLevel() == 3) {
            grid.add(label, x, y);
            properties.addLevel();
            myBank.removeAmount(properties.getHotel());
            money.setText("Bank: " + myBank.getAmount() + "$");

        }
    }

}
