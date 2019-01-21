import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;
import java.util.ArrayList;



public class GameRunner extends Application {

    private Image image = new Image("monopoly.jpg");
    private Image bill = new Image("100$.jpg",55,100,true,false);
    private Image opponentBill = new Image("Red dollar.jpg",55,100,true,false);
    private FlowPane pawn = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pawn2 = new FlowPane(Orientation.HORIZONTAL);
    private Label text = new Label();
    private Text field = new Text();
    private Text money = new Text();
    private Text opponentMoney = new Text();
    private Text price = new Text();
    private Label propertyList = new Label();
    private Label opponentsLabel = new Label();
    private Label parkingLabel = new Label();
    private Text dummy = new Text();
    Rectangle r = new Rectangle(330,360);
    Rectangle b = new Rectangle(350,380);
    Rectangle r2 = new Rectangle(330,360);
    Rectangle b2 = new Rectangle(350,380);
    GridPane grid = new GridPane();
    FieldDetection fieldDetection = new FieldDetection();
    Move move = new Move();
    BuyHotel buyHotel = new BuyHotel();
    OpponentBuy opponentBuy = new OpponentBuy();
    Bank myBank = new Bank(1500);
    Bank opponentsBank = new Bank(1500);
    Bank parking = new Bank(0);
    ArrayList<Properties> playersProperties = new ArrayList<>();
    ArrayList<Properties> opponentProperties = new ArrayList<>();




    public static void main(String[] args) {

        launch(args);
    }

    private void action(){


        move.move(text,field,price,pawn,opponentProperties,myBank,opponentsBank,money,fieldDetection.field(pawn),opponentMoney,parking,parkingLabel,playersProperties);
        move.opponentMove(pawn2,playersProperties,fieldDetection.field(pawn2),opponentsBank,myBank,opponentMoney,money,price,parking,parkingLabel,opponentProperties);
        opponentBuy.buy(opponentsLabel,playersProperties,opponentProperties,opponentMoney,fieldDetection.field(pawn2),opponentsBank);
        buyHotel.build(grid,pawn2,fieldDetection.field(pawn2),opponentProperties,dummy,opponentsBank,opponentMoney,Color.WHITE);
        buyHotel.build(grid,pawn2,fieldDetection.field(pawn2),opponentProperties,dummy,opponentsBank,opponentMoney,Color.WHITE);
        buyHotel.build(grid,pawn2,fieldDetection.field(pawn2),opponentProperties,dummy,opponentsBank,opponentMoney,Color.WHITE);
        buyHotel.build(grid,pawn2,fieldDetection.field(pawn2),opponentProperties,dummy,opponentsBank,opponentMoney,Color.WHITE);




    }


    @Override
    public void start(Stage primaryStage) throws Exception {




        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);


        grid.setAlignment(Pos.TOP_LEFT);
        grid.setBackground(background);
        //grid.setGridLinesVisible(true);


        grid.getColumnConstraints().add(new ColumnConstraints(130));
        for(int i = 1; i <=9; i++){
            grid.getColumnConstraints().add(new ColumnConstraints(82));

        }
        grid.getColumnConstraints().add(new ColumnConstraints(130));
        grid.getRowConstraints().add(new RowConstraints(130));



        for(int i = 1; i <= 9; i++){
            grid.getRowConstraints().add(new RowConstraints(82));
        }
        grid.getRowConstraints().add(new RowConstraints(130));


        opponentMoney.setText("Bank: 1500$");
        propertyList.setText("My properties:");
        opponentsLabel.setText("Opponents properties:");



        Button button1 = new Button();
        button1.setText("Move");
        button1.setOnAction(event -> action());

        Button button2 = new Button();
        button2.setText("Buy");
        button2.setOnAction(event -> buyHotel.buyHotel(playersProperties,propertyList,price,money,opponentProperties,
                fieldDetection.field(pawn),myBank));

        Button button3 = new Button();
        button3.setText("Build");
        button3.setOnAction(event -> buyHotel.build(grid,pawn,fieldDetection.field(pawn),playersProperties,price,myBank,money,Color.BLACK));


        r.setFill(Color.AZURE);
        b.setFill(Color.BLUE);
        r2.setFill(Color.AZURE);
        b2.setFill(Color.RED);




        text.setTextFill(Color.RED);
        text.setFont(new Font(22));
        money.setFont(new Font("Arial",18));
        opponentMoney.setFont(new Font("Arial",18));
        field.setFont(new Font("Arial",28));
        price.setUnderline(true);
        price.setFont(new Font(28));
        r.setTranslateX(72);
        r.setTranslateY(20);
        b.setTranslateX(62);
        b.setTranslateY(20);
        r2.setTranslateX(72);
        r2.setTranslateY(20);
        b2.setTranslateX(62);
        b2.setTranslateY(20);
        money.setTranslateX(75);
        money.setTranslateY(-60);
        money.setText("Bank : 1500$");
        opponentMoney.setTranslateX(75);
        opponentMoney.setTranslateY(-60);
        propertyList.setFont(new Font("Arial",18));
        propertyList.setTranslateX(75);
        propertyList.setTranslateY(-5);
        opponentsLabel.setFont(new Font("Arial",18));
        opponentsLabel.setTranslateX(75);
        opponentsLabel.setTranslateY(-55);
        pawn.setAlignment(Pos.CENTER);
        pawn.setTranslateY(-5);
        pawn2.setAlignment(Pos.CENTER);
        pawn2.setTranslateY(15);
        propertyList.setWrapText(true);
        propertyList.setMaxHeight(360);
        propertyList.setMinHeight(360);
        propertyList.setMinWidth(330);
        propertyList.setMaxWidth(330);
        opponentsLabel.setWrapText(true);
        opponentsLabel.setMaxHeight(360);
        opponentsLabel.setMinHeight(360);
        opponentsLabel.setMinWidth(330);
        opponentsLabel.setMaxWidth(330);
        parkingLabel.setText("0$");
        parkingLabel.setFont(new Font(26));
        parkingLabel.setTextFill(Color.BLUE);
        parkingLabel.setTranslateX(10);
        parkingLabel.setTranslateY(50);





        ImageView img = new ImageView(bill);
        ImageView img2 = new ImageView(opponentBill);
        pawn.getChildren().add(img);
        pawn2.getChildren().add(img2);



        grid.add(pawn, 10,1);
        grid.add(pawn2, 10,5);
        grid.add(button1,4,8);
        grid.add(button2,5,8);
        grid.add(button3,6,8);
        grid.add(text,4,9);
        grid.add(field,4,1);
        grid.add(price,4,2);
        grid.add(b,12,8);
        grid.add(r,12,8);
        grid.add(b2,12,2);
        grid.add(r2,12,2);
        grid.add(money,12,7);
        grid.add(opponentMoney,12,1);
        grid.add(propertyList,12,8);
        grid.add(opponentsLabel,12,3);
        grid.add(parkingLabel,0,0);






        Scene scene = new Scene(grid, 1500, 1000, Color.AZURE);

        primaryStage.setTitle("Monopoly");
        primaryStage.setScene(scene);
        primaryStage.show();


        //domki, koniec gry

    }
}