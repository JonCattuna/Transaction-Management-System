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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TransactionController 
{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    
    @FXML
    private Button importButton;

    @FXML
    private RadioButton PrintLNrb;

    @FXML
    private RadioButton PrintSrb;

    @FXML
    private RadioButton PrintDOrb;

    @FXML
    private Button PrintButton;

    @FXML
    private TextArea PrintText;

    @FXML
    private Button createButton;

    @FXML
    private RadioButton SrbM;

    @FXML
    private RadioButton MMrbM;

    @FXML
    private RadioButton CrbM;

    @FXML
    private CheckBox checkDD;

    @FXML
    private CheckBox checkLoyal;

    @FXML
    private DatePicker inputDateM;

    @FXML
    private TextField inputFirstM;

    @FXML
    private TextField inputLastM;

    @FXML
    private TextArea AccountText;

    @FXML
    private Button closeButton;

    @FXML
    private Button DepositButton;

    @FXML
    private DatePicker inputDateD;

    @FXML
    private TextField amountD;

    @FXML
    private TextField inputFirstD;

    @FXML
    private TextField inputLastD;

    @FXML
    private Button WithdrawButton;
    
    @FXML
    void importFile(ActionEvent event) 
    {
    	FileChooser chooser = new FileChooser();
    	chooser.setTitle("Open Source file for import");
    	chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
    		new ExtensionFilter("All Files", "*.txt"));
    	Stage stage = new Stage();
    	File SourceFile = chooser.showOpenDialog(stage);
    	//Write code to read from file
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
    	//Write code to write to file

    }
    
    @FXML
    void getDate(ActionEvent event) 
    {
    	
    	//date text field to take input create/close/deposit/withdraw
    }

    @FXML
    void getFirst(ActionEvent event) 
    {
    	
    	//first name text field to take input create/close/deposit/withdraw
    }

    @FXML
    void getLast(ActionEvent event) 
    {
    	//last name text field to take input create/close/deposit/withdraw
    }
    
    @FXML
    void AccountClose(ActionEvent event) 
    {
    	//close account button 
    }

    @FXML
    void AccountCreation(ActionEvent event) 
    {
    	//open account button
    }
    
    @FXML
    void Deposit(ActionEvent event) 
    {
    	//Deposit button

    }

    @FXML
    void Withdraw(ActionEvent event) 
    {
    	//withdraw button
    }

    @FXML
    void SelectAmount(ActionEvent event) 
    {
    	//Amount textfield for deposit/withdraw
    }

    @FXML
    void SelectChecking(ActionEvent event) 
    {
    	//radio button for checking account create/close
    }
    
    @FXML
    void checkDD(ActionEvent event) 
    {
    	//checkbox for Direct Deposit in create
    }

    @FXML
    void SelectMoneyMarket(ActionEvent event) 
    {
    	//radio button for money market account create/close
    }

    @FXML
    void SelectSavings(ActionEvent event) 
    {
    	//radio button for savings account create/close
    }
   
    @FXML
    void checkLoyal(ActionEvent event) 
    {
    	//checkbox for loyalty in create
    }
    
    @FXML
    void clickPrint(ActionEvent event) 
    {
    	//Print button
    }

    @FXML
    void selectPrint(ActionEvent event) 
    {
    	//Standard print radio button
    }

    @FXML
    void selectPrintDate(ActionEvent event) 
    {
    	//Printing by date created radio button
    }

    @FXML
    void selectPrintLast(ActionEvent event) 
    {
    	//printing by last name radio button
    }
    ////////////////////////////////////////////////////////////////////////////////////////

   


    
 

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() 
    {

    }
}




  
    

