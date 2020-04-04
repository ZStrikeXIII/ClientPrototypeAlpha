package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This program is a prototype for an inventory management system for my client, and is clickable
 * with some functionality to demonstrate what the system will need to do.
 *
 * @author jbturner
 */
public class Main extends Application {

  /**
   * The start point of the JavaFX program.
   *
   * @param primaryStage The primary stage.
   * @throws Exception Any errors or exceptions that may occur during execution.
   */
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    primaryStage.setTitle("Inventory Management System");
    primaryStage.setScene(new Scene(root, 372, 248));
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
