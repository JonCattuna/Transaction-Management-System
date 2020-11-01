/**
 * Controller class 'TransactionController.fxml' this class controls all aspects of the GUI
 * @author Jon Cattuna, George Job
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
	AccountDatabase data = new AccountDatabase();
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
    
    ///////////////accoutn radi obuttons booleans
    boolean checking = false;
    boolean saving = false;
    boolean money = false;
    
    
    @FXML
    /**
     * Write code to read from file
     * @param event
     */
    void importFile(ActionEvent event) 
    {
    	FileChooser chooser = new FileChooser();
    	chooser.setTitle("Open Source file for import");
    	chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
    		new ExtensionFilter("All Files", "*.txt"));
    	Stage stage = new Stage();
    	File SourceFile = chooser.showOpenDialog(stage);
    	//
    }
    
    
    
    @FXML
    /**
     * Write code to write to file
     * @param event
     */
    void exportFile(ActionEvent event) 
    {
    	FileChooser chooser = new FileChooser();
    	chooser.setTitle("Open Target file to export");
    	chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
    		new ExtensionFilter("All Files", "*.txt"));
    	Stage stage = new Stage();
    	File TargetFile = chooser.showSaveDialog(stage);
    	//

    }
    

    @FXML
    /**
     * first name text field to take input create/close/deposit/withdraw
     * @param event
     */
    void getFirst(ActionEvent event) 
    {
    	ManagerFirstName = inputFirstM.getText();    	
    	DepositFirstName = inputFirstD.getText();
    	
    	
    	//
    }

    @FXML
    /**
     * last name text field to take input create/close/deposit/withdraw
     * @param event
     */
    void getLast(ActionEvent event) 
    {
    	DepositLastName = inputLastD.getText();
    	ManagerLastName = inputLastM.getText();
    	//
    }
    
    @FXML
    /**
     * close account button 
     * @param event
     */
    void AccountClose(ActionEvent event) 
    {
    	if (checkLoyal.isSelected() && saving == true)
    	{
    		AccountText.setText("Closing Loyal Savings Account" + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);    		
    	}
    	else if (checkDD.isSelected() && checking == true)
    	{
    		AccountText.setText("Closing direct deposit checkinga account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else if (checking == true)
    	{
    		AccountText.setText("Closing checkinga account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else if (saving == true)
    	{
    		AccountText.setText("Closing saving account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else if (money == true)
    	{
    		AccountText.setText("Closing money market account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else
    		AccountText.setText("Please select an accoutn type");
    	//AccountText.setText("Closing Account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	//
    }

    @FXML
    void AccountCreation(ActionEvent event) 
    {
    	//System.out.println("Creating accoutn");
    	if (checkLoyal.isSelected() && saving == true)
    	{
    		AccountText.setText("New Loyal Savings Account" + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);    		
    	}
    	else if (checkDD.isSelected() && checking == true)
    	{
    		AccountText.setText("New direct deposit checkinga account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else if (checking == true)
    	{
    		AccountText.setText("New checkinga account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else if (saving == true)
    	{
    		AccountText.setText("New saving account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else if (money == true)
    	{
    		AccountText.setText("New money market account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	}
    	else
    		AccountText.setText("Please select an accoutn type");
    	//AccountText.setText("New Account " + ManagerFirstName + " " + ManagerLastName + " " + dayM + "/" + monthM + "/" + yearM);
    	//
    }
    
    @FXML
    /**
     * Deposit button
     * @param event
     */
    void Deposit(ActionEvent event) 
    {
    	
    	

    }

    @FXML
    /**
     * withdraw button
     * @param event
     */
    void Withdraw(ActionEvent event) 
    {
    	
    	
    }

    @FXML
    /**
     * Amount textfield for deposit/withdraw
     * @param event
     */
    void SelectAmount(ActionEvent event) 
    {
    	
    }

    @FXML
    /**
     * radio button for checking account create/close
     * @param event
     */
    void SelectChecking(ActionEvent event) 
    {
    	checkLoyal.setDisable(true);
    	checkLoyal.setSelected(false);
    	checkDD.setDisable(false);
    	checking = true;
    	saving = false;
    	money = false;
    	
    	
    }
   
    @FXML
    /**
     * radio button for money market account create/close
     * @param event
     */
    void SelectMoneyMarket(ActionEvent event) 
    {
    	checkDD.setDisable(true);
    	checkDD.setSelected(false);
    	checkLoyal.setDisable(true);
    	checkLoyal.setSelected(false);
    	checking = false;
    	saving = false;
    	money = true;
    	
    	
    	
    }

    @FXML
    /**
     * radio button for savings account create/close
     * @param event
     */
    void SelectSavings(ActionEvent event) 
    {    	
    	checkLoyal.setDisable(false);
    	checkDD.setDisable(true);
    	checkDD.setSelected(false);
    	checking = false;
    	saving = true;
    	money = false;
    	
  
    	//checkLoayal.setDisable(true);
    	
    	
    }
   
    
    @FXML
    /**
     * checkbox for Direct Deposit in create
     * @param event
     */
    void checkDD(ActionEvent event) 
    {
    	
    	
    }

    @FXML
    /**
     * checkbox for loyalty in create
     * @param event
     */
    void checkLoyal(ActionEvent event) 
    {
    	
    	
    }
 
//////////////////////////////////Printing radio buttons methods
    @FXML
    /**
     * Print button
     * @param event
     */
    void clickPrint(ActionEvent event) 
    {
    	if(Sprint == true)
    	{
    		//printAccounts(data);
    		PrintText.setText("PRINTING NORAML ACCOUTN LSIT");
    	}
    	else if(Dprint == true)
    	{
    		//printByDateOpen(data);
    		PrintText.setText("PRINGTING DATE ORDERED LIST");
    	}
    	else if(Lprint == true)
    	{
    		//printByLastName(data);
    		PrintText.setText("PRINTING LASST NAME ORDRED ACCOUTN LSIT");
    	}
    	else
    	{
    		//printAccounts(data);
    		PrintText.setText("PRINTING NORAML ACCOUTN LSIT");
    	}
    	
    }

    @FXML
    /**
     * Standard print radio button
     * @param event
     */
    void selectPrint(ActionEvent event) 
    {
    	Sprint = true;
    	Dprint = false;
    	Lprint = false;
    	
    	
    }

    @FXML
    /**
     * Printing by date created radio button
     * @param event
     */
    void selectPrintDate(ActionEvent event) 
    {
    	Dprint = true;
    	Sprint = false;
    	Lprint = false;
    	
    	
    }

    @FXML
    /**
     * printing by last name radio button
     * @param event
     */
    void selectPrintLast(ActionEvent event) 
    {
    	Lprint = true;
    	Dprint = false;
    	Sprint = false;
    	//
    }
///////////////////////////////////////////////////////////    
    
    
    
    @FXML
    /**
     * date text field
     * @param event
     */
    void inputDay(ActionEvent event) 
    {
    	dayM = DayM.getText();
    	dayD = DayD.getText();
    }

    @FXML
    /**
     * month text field
     * @param event
     */
    void inputMonth(ActionEvent event) 
    {
    	monthM = MonthM.getText();
    	monthD = MonthD.getText();

    }

    @FXML
    /**
     * year text field
     * @param event
     */
    void inputYear(ActionEvent event) 
    {
    	yearM = YearM.getText();
    	yearD = YearD.getText();

    }
    ////////////////////////////////////////////////////////////////////////////////////////

   


    
 

    @FXML
    /**
     * This method is called by the FXMLLoader when initialization is complete 
     */
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




  
    

