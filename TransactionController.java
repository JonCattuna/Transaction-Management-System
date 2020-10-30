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
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class TransactionController 
{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    
    @FXML
    private Button importButton;
///////////////////////////////////////////Printing radio button group
    @FXML
    private RadioButton PrintLNrb;

    @FXML
    private RadioButton PrintSrb;

    @FXML
    private RadioButton PrintDOrb;
    
    @FXML
    private Group PrintGroup;
///////////////////////////////////////////////
    @FXML
    private Button PrintButton;

    @FXML
    private TextArea PrintText;

    @FXML
    private Button createButton;
/////////////////////////////grouping account radio buttons
    @FXML
    private RadioButton SrbM;
    //RadioButton SrBM = new RadioButton();

    @FXML
    private RadioButton MMrbM;

    @FXML
    private RadioButton CrbM;
    
    @FXML
    private Group ManagerGroup;
    //Group ManagerGroup = new Group;
    //ToggleGroup ManagerGroup;
    //ManagerGroup.getChildren().add(MMrbM);
    //SrBM.setToggleGroup(ManagerGroup);
    
////////////////////////////////////////////////
    @FXML
    private CheckBox checkDD;
    boolean dd = false;

    @FXML
    private CheckBox checkLoyal;
    boolean loyal = false;

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
    private TextField amountD;

    @FXML
    private TextField inputFirstD;

    @FXML
    private TextField inputLastD;

    @FXML
    private Button WithdrawButton;
    
    //////////////////////Date for the deposit/withdarw tab
    @FXML
    private TextField DayD;
    

    @FXML
    private TextField MonthD;

    @FXML
    private TextField YearD;
 //////////////////////////////////////////////////
    
    //////////////////////////////date for account manager tab
    @FXML
    private TextField DayM;

    @FXML
    private TextField MonthM;

    @FXML
    private TextField YearM;
/////////////////////////////////////////////////////////////
    String ManagerFirstName;
    String ManagerLastName;
    String DepositFirstName;
    String DepositLastName;
    
    /////Creating printing booleans///////////
    boolean Sprint = false;
    boolean Lprint = false;
    boolean Dprint = false;
    
    ///////////////Day month year//////////////////
    String dayM;
    String monthM;
    String yearM;
    
    String dayD;
    String monthD;
    String yearD;
    
    
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
    void getFirst(ActionEvent event) 
    {
    	ManagerFirstName = inputFirstM.getText();    	
    	DepositFirstName = inputFirstD.getText();
    	
    	
    	//first name text field to take input create/close/deposit/withdraw
    }

    @FXML
    void getLast(ActionEvent event) 
    {
    	DepositLastName = inputLastD.getText();
    	ManagerLastName = inputLastM.getText();
    	//last name text field to take input create/close/deposit/withdraw
    }
    
    @FXML
    void AccountClose(ActionEvent event) 
    {
    	AccountText.setText("Closing Account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	//close account button 
    }

    @FXML
    void AccountCreation(ActionEvent event) 
    {
    	//System.out.println("Creating accoutn");
    	AccountText.setText("New Account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
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
    	checkLoyal.setDisable(true);
    	checkLoyal.setSelected(false);
    	checkDD.setDisable(false);
    	
    	//radio button for checking account create/close
    }
   
    @FXML
    void SelectMoneyMarket(ActionEvent event) 
    {
    	checkDD.setDisable(true);
    	checkDD.setSelected(false);
    	checkLoyal.setDisable(true);
    	checkLoyal.setSelected(false);
    	
    	//radio button for money market account create/close
    }

    @FXML
    void SelectSavings(ActionEvent event) 
    {    	
    	checkLoyal.setDisable(false);
    	checkDD.setDisable(true);
    	checkDD.setSelected(false);
  
    	//checkLoayal.setDisable(true);
    	
    	//radio button for savings account create/close
    }
   
    
    @FXML
    void checkDD(ActionEvent event) 
    {
    	
    	//checkbox for Direct Deposit in create
    }

    @FXML
    void checkLoyal(ActionEvent event) 
    {
    	
    	//checkbox for loyalty in create
    }
 
//////////////////////////////////Printing radio buttons methods
    @FXML
    void clickPrint(ActionEvent event) 
    {
    	if(Sprint == true)
    	{
    		//printAccounts();
    		PrintText.setText("PRINTING NORAML ACCOUTN LSIT");
    	}
    	else if(Dprint == true)
    	{
    		//printByDateOpen();
    		PrintText.setText("PRINGTING DATE ORDERED LIST");
    	}
    	else if(Lprint == true)
    	{
    		//printByLastName();
    		PrintText.setText("PRINTING LASST NAME ORDRED ACCOUTN LSIT");
    	}
    	else
    	{
    		//printAccounts();
    		PrintText.setText("PRINTING NORAML ACCOUTN LSIT");
    	}
    	//Print button
    }

    @FXML
    void selectPrint(ActionEvent event) 
    {
    	Sprint = true;
    	Dprint = false;
    	Lprint = false;
    	
    	//Standard print radio button
    }

    @FXML
    void selectPrintDate(ActionEvent event) 
    {
    	Dprint = true;
    	Sprint = false;
    	Lprint = false;
    	
    	//Printing by date created radio button
    }

    @FXML
    void selectPrintLast(ActionEvent event) 
    {
    	Lprint = true;
    	Dprint = false;
    	Sprint = false;
    	//printing by last name radio button
    }
///////////////////////////////////////////////////////////    
    
    
    
    @FXML
    void inputDay(ActionEvent event) 
    {
    	dayM = DayM.getText();
    	dayD = DayD.getText();
    }

    @FXML
    void inputMonth(ActionEvent event) 
    {
    	monthM = MonthM.getText();
    	monthD = MonthD.getText();

    }

    @FXML
    void inputYear(ActionEvent event) 
    {
    	yearM = YearM.getText();
    	yearD = YearD.getText();

    }
    ////////////////////////////////////////////////////////////////////////////////////////

   


    
 

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() 
    {
    	
    	ToggleGroup ManagerGroup = new ToggleGroup();
    	SrbM.setToggleGroup(ManagerGroup);
    	MMrbM.setToggleGroup(ManagerGroup);
    	CrbM.setToggleGroup(ManagerGroup);
    	
    	ToggleGroup PrintGroup = new ToggleGroup();
    	PrintLNrb.setToggleGroup(PrintGroup);
    	PrintSrb.setToggleGroup(PrintGroup);
    	PrintDOrb.setToggleGroup(PrintGroup);
    	
    	
    }
}




  
    

