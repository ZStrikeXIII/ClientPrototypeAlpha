package sample;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

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

  public void handleParButtonAction(ActionEvent actionEvent) {
    //try{
    String newPar = newParField.getText();
    parLevelField.setText(newPar);
    System.out.println("Par Level Adjustment Confirmed");
    /*} catch (SQLException e) {
      e.printStackTrace();
    }*/
  }

  public void handleAddButtonAction(ActionEvent actionEvent) {
    try {
      String initValueString = itemField3.getText();
      int initValue = Integer.parseInt(initValueString);
      String addValueString = addRemoveItemField.getText();
      int addValue = Integer.parseInt(addValueString);
      int newValue = initValue + addValue;
      String newValueString = Integer.toString(newValue);
      itemField3.setText(newValueString);
      System.out.println("Added Items Confirmed");
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }

  public void handleRemoveButtonAction(ActionEvent actionEvent) {
    try {
      String initValueString = itemField3.getText();
      int initValue = Integer.parseInt(initValueString);
      String removeValueString = addRemoveItemField.getText();
      int removeValue = Integer.parseInt(removeValueString);
      int newValue = initValue + removeValue;
      if (newValue < 0) {
        System.out.println("Cannot have a Negative Amount of Items");
      } else {
        String newValueString = Integer.toString(newValue);
        itemField3.setText(newValueString);
        System.out.println("Removal of Items Confirmed");
      }
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
