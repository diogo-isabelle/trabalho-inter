

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginMenu extends Application
{
	static Stage stageLoader;
	@Override
	public void start(Stage stage) 
	{
		LoginMenu.stageLoader = stage;
		//AnchorPane root;
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("FXML/TelaLogin.fxml"));
	        stage.setTitle("Menu");
	        
			Scene scene = new Scene(root, 900, 700);
			
			
			stage.setScene(scene);
			stage.show();
		
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)  
	{	
		Application.launch(LoginMenu.class, args);
	}
}
