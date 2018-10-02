import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GraficoController 
{
	/*@FXML //Annotation
	private Label labelStatus;
	*/
	@FXML 
	private Pane pnlContent;
	
	@FXML
	protected void btnVoltarClick(ActionEvent event) 
	{
		try 
		{
			Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaMenuPrincipal.fxml"));
			Scene scene = new Scene(newLoadedPane);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			window.setScene(scene);
			window.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
