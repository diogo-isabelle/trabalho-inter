import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainMenuController 
{
	/*@FXML //Annotation
	private Label labelStatus;
	*/
	@FXML 
	private Pane pnlContent;
	
	@FXML
	protected void btnCadastrarCategoriaOpen(ActionEvent event) 
	{
		try 
		{
			Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaCategoria.fxml"));
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
	
	@FXML
	protected void btnCadastrarQuestaoOpen(ActionEvent event) 
	{
		try 
		{
			Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaQuestoes.fxml"));
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
	
	@FXML
	protected void btnCadastrarQuestionarioOpen(ActionEvent event) 
	{
		try 
		{
			Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaQuestionario.fxml"));
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
	
	@FXML
	protected void btnCadastrarPacienteOpen(ActionEvent event) 
	{
		try 
		{
			Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaPaciente.fxml"));
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
	
	@FXML
	protected void btnRealizarTesteOpen(ActionEvent event) 
	{
		try 
		{
			//Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaTeste.fxml"));
			//Scene scene = new Scene(newLoadedPane);
			
			//Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			
			//window.setScene(scene);
			//window.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	protected void btnGerarGraficoOpen(ActionEvent event) 
	{
		try 
		{
			Parent newLoadedPane = FXMLLoader.load(getClass().getResource("FXML/TelaGrafico.fxml"));
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
