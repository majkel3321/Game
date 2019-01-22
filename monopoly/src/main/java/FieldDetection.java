import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import java.util.HashMap;



public class FieldDetection{

    private HashMap<Integer,Properties> propertiesHashMap = new HashMap<>();

    public FieldDetection(){
        propertiesHashMap.put(0,new Properties("Parking",0,0,0));
        propertiesHashMap.put(1,new Properties("Kentucky Avenue",220,20,150));
        propertiesHashMap.put(2,new Properties("Chance",0,0,0));
        propertiesHashMap.put(3,new Properties("Indiana Avenue",220,20,150));
        propertiesHashMap.put(4,new Properties("Illinois Avenue",240,22,150));
        propertiesHashMap.put(5,new Properties("B.& O. Railroad",200,25,0));
        propertiesHashMap.put(6,new Properties("Atlantic Avenue",260,24,150));
        propertiesHashMap.put(7,new Properties("Ventnor Avenue",260,28,150));
        propertiesHashMap.put(8,new Properties("Water Works",150,20,0));
        propertiesHashMap.put(9,new Properties("Marvin Gardens",280,26,150));
        propertiesHashMap.put(10,new Properties("GO TO JAIL",0,0,0));
        propertiesHashMap.put(11,new Properties("Pacific Avenue",300,28,200));
        propertiesHashMap.put(12,new Properties("North Carolina Avenue",300,28,200));
        propertiesHashMap.put(13,new Properties("Community Chest",0,0,0));
        propertiesHashMap.put(14,new Properties("Pennsylvania Avenue",320,30,200));
        propertiesHashMap.put(15,new Properties("Short Line",200,25,0));
        propertiesHashMap.put(16,new Properties("Chance",0,0,0));
        propertiesHashMap.put(17,new Properties("Park Place",350,33,200));
        propertiesHashMap.put(18,new Properties("Luxury Tax",0,0,200));
        propertiesHashMap.put(19,new Properties("BoardWalk",400,38,200));
        propertiesHashMap.put(600,new Properties("START",0,0,0));
        propertiesHashMap.put(570,new Properties("Mediterranean Avenue",60,2,50));
        propertiesHashMap.put(540,new Properties("Community Chest",0,0,50));
        propertiesHashMap.put(510,new Properties("Baltic Avenue",60,4,50));
        propertiesHashMap.put(480,new Properties("Income Tax",0,0,50));
        propertiesHashMap.put(450,new Properties("Reading Railroad",200,25,0));
        propertiesHashMap.put(420,new Properties("Oriental Avenue",100,6,50));
        propertiesHashMap.put(390,new Properties("Chance",0,0,0));
        propertiesHashMap.put(360,new Properties("Vermont Avenue",100,6,50));
        propertiesHashMap.put(330,new Properties("Connecticut Avenue",120,10,60));
        propertiesHashMap.put(300,new Properties("JAIL",0,0,0));
        propertiesHashMap.put(270,new Properties("St.Charles Place",140,12,70));
        propertiesHashMap.put(240,new Properties("Electric Company",150,20,0));
        propertiesHashMap.put(210,new Properties("States Avenue",140,12,70));
        propertiesHashMap.put(180,new Properties("Virginia Avenue",160,14,80));
        propertiesHashMap.put(150,new Properties("Pennsylvania RailRoad",200,25,0));
        propertiesHashMap.put(120,new Properties("St.James Place",180,16,90));
        propertiesHashMap.put(90,new Properties("Community Chest",0,0,0));
        propertiesHashMap.put(60,new Properties("Tennessee Avenue",180,16,100));
        propertiesHashMap.put(30,new Properties("New York Avenue",200,18,100));



    }

    public Properties field(FlowPane pawn){

        int x = GridPane.getColumnIndex(pawn);
        int y = GridPane.getRowIndex(pawn);
        int p = 0;

        if ((x < 10 && y == 0) || (x >= 10 && y <= 9)) {
            p = x + y;
        }
        else if ((x > 0 && y <= 10) || (x == 0 && y <= 10)){
           p = (x + y) * 30;
        }


        return propertiesHashMap.get(p);

    }




}
