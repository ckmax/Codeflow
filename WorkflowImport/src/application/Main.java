package application;
	
import org.w3c.dom.Document;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 * 
 * @author Capki, David, Derek, Julius
 *
 * Import the workflow structure into the system from a file by workflow programmer
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * 
	 * @param filePath
	 * @return
	 */
	public Document upload(String filePath){
		return null;
	}
	
	
	/**
	 * 
	 * @param filePath
	 * @return
	 */
	public boolean save(String filePath){
		return false;
	}
}
