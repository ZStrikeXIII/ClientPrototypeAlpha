package sample;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

/**
 * Controller class to handle all of the events that will occur in the system, mainly three button
 * clicks that will perform varying actions.
 *
 * @author jbturner
 */
public class Controller {
  //FX ID Setups

  @FXML
  private Tab viewInventoryTab;

  @FXML
  private Tab adjustParTab;

  @FXML
  private Tab addRemoveTab;

  @FXML
  private TextField itemField1;

  @FXML
  private TextField itemField2;

  @FXML
  private TextField itemField3;

  @FXML
  private TextField itemField4;

  @FXML
  private TextField itemField5;

  @FXML
  private TextField parItemField;

  @FXML
  private TextField parLevelField;

  @FXML
  private TextField newParField;

  @FXML
  private TextField addRemoveItemField;

  @FXML
  private TextField numItems;

  @FXML
  private Button confirmParButton;

  @FXML
  private Button addButton;

  @FXML
  private Button removeButton;

  /**
   * Method to handle the actions that will occur when the Adjust Par Level button is clicked.
   *
   * @param actionEvent The button being clicked is the actionEvent that will make the method
   *                    occur.
   */
  public void handleParButtonAction(ActionEvent actionEvent) {
    //try{ //Try and catch blocks were not needed.
    String newPar = newParField.getText(); //Getting new Par Level
    parLevelField.setText(newPar); //Setting new Par Level
    System.out.println("Par Level Adjustment Confirmed"); //Confirmation of process
    /*} catch (SQLException e) {
      e.printStackTrace();
    }*/
  }

  /**
   * Method to handle the actions that will occur when the Add Items button is clicked.
   *
   * @param actionEvent The button being clicked is the actionEvent that will make the method
   *                    occur.
   */
  public void handleAddButtonAction(ActionEvent actionEvent) {
    try {
      String initValueString = itemField3.getText(); //Getting item's initial value in the system
      int initValue = Integer.parseInt(initValueString); //Changing String to int
      String addValueString = numItems.getText();//Getting value to be added to initial value
      //System.out.println(addValueString);
      int addValue = Integer.parseInt(addValueString);
      int newValue = initValue + addValue; //Adding
      String newValueString = Integer.toString(newValue); //Converting back to String
      itemField3.setText(newValueString); //Setting new item value
      System.out.println("Added Items Confirmed"); //Confirmation of process
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }

  /**
   * Method to handle the actions that occur when the Remove Items button is clicked.
   *
   * @param actionEvent The button being clicked is the actionEvent that will make the method
   *                    occur.
   */
  public void handleRemoveButtonAction(ActionEvent actionEvent) {
    try {
      String initValueString = itemField3.getText(); //Getting item's initial value in the system
      int initValue = Integer.parseInt(initValueString); //Converting to int
      String removeValueString = numItems
          .getText(); //Getting value to be removed from initial value
      int removeValue = Integer.parseInt(removeValueString);
      int newValue = initValue - removeValue; //Subtracting
      if (newValue < 0) { //Checking if result is negative
        System.out.println("Cannot have a Negative Amount of Items");
      } else { //If result isn't negative...
        String newValueString = Integer.toString(newValue); //Converting back to String
        itemField3.setText(newValueString); //Setting new item value
        System.out.println("Removal of Items Confirmed"); //Confirmation of process
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
