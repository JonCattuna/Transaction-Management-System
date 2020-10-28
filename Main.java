/**
 * 
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * @author Jon Cattuna, George Job
 *
 */
public class Main extends Application
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Application.launch(args);
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage stage) 
	{
		try {			
			TabPane root = (TabPane)FXMLLoader.load(getClass().getResource("TransactionController.fxml"));
			Scene scene = new Scene(root, 650, 400);
			stage.setTitle("Transaction Management System");
			stage.setScene(scene);
			stage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
					
		// TODO Auto-generated method stub
		
	}
	

}
