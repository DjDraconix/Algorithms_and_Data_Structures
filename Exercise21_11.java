import java.net.URL;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;import java.io.*;
import java.awt.*;


public class Exercise21_11 extends Application {
  private Map<String, Integer>[] mapForBoy = new HashMap[10];
  private Map<String, Integer>[] mapForGirl = new HashMap[10];
  
  private Button btFindRanking = new Button("Find Ranking");
  private ComboBox<Integer> cboYear = new ComboBox<>();
  private ComboBox<String> cboGender = new ComboBox<>();
  private TextField tfName = new TextField();
  private Label lblResult = new Label();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) throws FileNotFoundException {
    
    try{
      int j = 0;
      for (int i = 2001; i < 2011; i++) {
        URL file = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + i + ".txt");
        Scanner in = new Scanner(file.openStream());
        Map<String, Integer> malePercent = new HashMap<>();
        Map<String, Integer> girlPercent = new HashMap<>();
        while (in.hasNext()) {
          int rank = in.nextInt();
          malePercent.put(in.next(), rank);
          in.nextInt();
          girlPercent.put(in.next(), rank);
          in.nextInt();
        }
        mapForBoy[j] = malePercent;
        mapForGirl[j] = girlPercent;
        j++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    GridPane gridPane = new GridPane();
    gridPane.add(new Label("Select a year:"), 0, 0);
    gridPane.add(new Label("Boy or girl?"), 0, 1);
    gridPane.add(new Label("Enter a name:"), 0, 2);
    gridPane.add(cboYear, 1, 0);
    gridPane.add(cboGender, 1, 1);
    gridPane.add(tfName, 1, 2);
    gridPane.add(btFindRanking, 1, 3);
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(5);
    gridPane.setVgap(5);
  
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(gridPane);
    borderPane.setBottom(lblResult);
    BorderPane.setAlignment(lblResult, Pos.CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 370, 160);
    primaryStage.setTitle("Exercise21_11"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    for (int year = 2001; year <= 2010; year++) {
      cboYear.getItems().add(year);
    }
    cboYear.setValue(2001);
        
    cboGender.getItems().addAll("Male", "Female");
    cboGender.setValue("Male");
    
    btFindRanking.setOnAction(e -> {
      lblResult = setLabel(mapForBoy, mapForGirl, cboYear, cboGender, tfName);
    });
  }
  
  public static Label setLabel(Map<String, Integer>[] male, Map<String, Integer>[] femail, ComboBox<Integer> year, ComboBox<String> gender, TextField name) {
    
    return null;
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
