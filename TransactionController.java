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

public class TransactionController {

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
 

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }
}
