package controls;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ControlDemo extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        ImageView img = new ImageView(new Image("controls/image/usIcon.gif"));
        
//      Label myLabel = new Label("Text", img);
//      TextField tf1 = new TextField("Text");

//        ToggleGroup tg = new ToggleGroup();
//        RadioButton rb1 = new RadioButton("Choice 1");
//        RadioButton rb2 = new RadioButton("Choice 2");
//        RadioButton rb3 = new RadioButton("Choice 3");
//        rb1.setToggleGroup(tg);
//        rb2.setToggleGroup(tg);
//        rb3.setToggleGroup(tg);    

        ObservableList<String> items = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
//        ComboBox<String> cmb1 = new ComboBox<>(items);

        Slider sl1 = new Slider(0, 100, 75);
        sl1.setMajorTickUnit(10);
        sl1.setShowTickMarks(true);
        sl1.setShowTickLabels(true);


        StackPane pane = new StackPane();
        pane.getChildren().addAll(sl1);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("UI Controls"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

