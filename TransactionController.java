/**
 * Sample Skeleton for 'TransactionController.fxml' Controller Class
 */

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class TransactionController 
{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    
    
    
    
    @FXML
    void importFile(ActionEvent event) 
    {
    	FileChooser chooser = new FileChooser();
    	chooser.setTitle("Open Source file for import");
    	chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
    		new ExtensionFilter("All Files", "*.txt"));
    	Stage stage = new Stage();
    	File SourceFile = chooser.showOpenDialog(stage);
    	//Wreit code to read from file
    }
    
    
    
    @FXML
    void exportFile(ActionEvent event) 
    {
    	FileChooser chooser = new FileChooser();
    	chooser.setTitle("Open Target file to export");
    	chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
    		new ExtensionFilter("All Files", "*.txt"));
    	Stage stage = new Stage();
    	File TargetFile = chooser.showSaveDialog(stage);
    	//Writee code to write to file

    }
    
    @FXML
    void AccountClose(ActionEvent event) {

    }

    @FXML
    void AccountCreation(ActionEvent event) {

    }

    @FXML
    void DepositClick(ActionEvent event) {

    }

    @FXML
    void SelectAmount(ActionEvent event) {

    }

    @FXML
    void SelectChecking(ActionEvent event) {

    }

    @FXML
    void SelectMoneyMarket(ActionEvent event) {

    }

    @FXML
    void SelectSavings(ActionEvent event) {

    }

    @FXML
    void WithdrawClick(ActionEvent event) {

    }

    @FXML
    void checkDD(ActionEvent event) {

    }

    @FXML
    void checkLoyal(ActionEvent event) {

    }

    @FXML
    void clickPrint(ActionEvent event) {

    }

    @FXML
    void getDate(ActionEvent event) {

    }

    @FXML
    void getFirst(ActionEvent event) {

    }

    @FXML
    void getLast(ActionEvent event) {

    }

    @FXML
    void selectPrint(ActionEvent event) {

    }

    @FXML
    void selectPrintDate(ActionEvent event) {

    }

    @FXML
    void selectPrintLast(ActionEvent event) {

    }

    
    
 

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }
}




  
    

