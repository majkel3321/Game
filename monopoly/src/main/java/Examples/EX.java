package Examples;
import javafx.application.*;
        import javafx.geometry.Insets;
        import javafx.geometry.Orientation;
        import javafx.geometry.Pos;
        import javafx.scene.*;                      //?
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.*;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Ellipse;
        import javafx.scene.shape.Rectangle;
        import javafx.scene.text.Font;
        import javafx.scene.transform.Rotate;
        import javafx.stage.*;

        import java.util.Random;
        import java.util.concurrent.TimeUnit;


public class EX extends Application {

    private Image image = new Image("monopoly.jpg");
    private Image bill = new Image("100$.jpg",50,100,true,false);
    private FlowPane pawn = new FlowPane(Orientation.HORIZONTAL);
    private Label text = new Label();
    GridPane grid = new GridPane();
    int x = 0;
    int y =0;
    int z = 0;

    public static void main(String[] args) {

        launch(args);
    }

    public void move(){

        Random random = new Random();
        int los = random.nextInt(6)+1;
        text.setText("" + los);

        for(int i = 1; i <= los; i++){

            if (pawn.getTranslateX() + 82 >= 926){
                pawn.setTranslateY(pawn.getTranslateY() + 90);

            }

            else{
                pawn.setTranslateX(pawn.getTranslateX() + 82 );
            }

        }

    }






    @Override
    public void start(Stage primaryStage) throws Exception {



        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        grid.setAlignment(Pos.TOP_LEFT);
        grid.setBackground(background);

        Button button = new Button();
        button.setText("Examples.EX");
        button.setOnAction((e) ->{move();
        });

        ImageView img = new ImageView(bill);
        pawn.getChildren().add(img);

        grid.add(pawn,1,1);
        grid.add(button,2,2);
        grid.add(text,10,10);
        grid.setGridLinesVisible(true);


        pawn.setTranslateX(66);
        pawn.setTranslateY(40);
        //pawn.getTransforms().add(new Rotate(90));

        button.setTranslateX(70);
        button.setTranslateY(120);
        // button.setScaleX(2);
        //button.setScaleY(2);

        text.setLayoutX(600);
        text.setLayoutY(100);  // nie dziala

        Scene scene = new Scene(grid, 1500, 1000, Color.AZURE);

        primaryStage.setTitle("Monopoly");
        primaryStage.setScene(scene);
        primaryStage.show();


        // jak usunac obrazek z pola



























        /*Group root = new Group();
        Scene scene = new Scene(root,1600,900, Color.BLACK);

        Rectangle r = new Rectangle(50,50,1500,800);
        //Rectangle s = new Rectangle(0,0,250,250);
        //Ellipse e = new Ellipse(800,450,500,100);

       // s.setFill(Color.RED);
        r.setFill(Color.RED);
       // e.setFill(Color.BLUE);
        root.getChildren().add(r);
       // root.getChildren().add(s);
        //root.getChildren().add(e);


        primaryStage.setTitle("Scene");
        primaryStage.setScene(scene);
        primaryStage.show();*/



    }
}














