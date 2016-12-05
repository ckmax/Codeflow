package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.TableEntry;
import model.UserEntry;

/**
 * 
 * @author Capki Kim
 *
 * The admin page will have a dashboard of all the instantiated users that have access to the workflow system. 
 * This interface will consist of three buttons that will either add, remove, or edit a user. 
 * This dashboard will later be upgraded as time permits to allow additional functionalities 
 * such as a profile page when you double click on a user.
 *
 */

public class AdminController implements Initializable {
	
	public static Stage editUserStage;
	public static Stage addUserStage;
	
	@FXML private TableView adminTV;
	
	public static ObservableList<UserEntry> userList;
	
	/**
	 * Initializes editUserController
	 */
	public void editUserBtn(){
		
		try{
			
			FXMLLoader loader = new FXMLLoader();
			
			loader.setLocation(getClass().getResource("/view/EditUser.fxml"));
			
			AnchorPane root = (AnchorPane)loader.load();
			
			Stage stage = new Stage();
			
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Codeflow");
			
			editUserStage = stage;
			
			stage.show(); // Pop-up admin stage
			
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

	/**
	 * 	Initializes addUserController
	 */
	public void addUserBtn(){
		
		try{
			FXMLLoader loader = new FXMLLoader();
			
			loader.setLocation(getClass().getResource("/view/Adduser.fxml"));
			
			AnchorPane root = (AnchorPane)loader.load();
			
			Stage stage = new Stage();
			
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Codeflow");
			
			addUserStage = stage;
			
			stage.show(); // Pop-up admin stage
						
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

	/**
	 * Removes selected user from the user list
	 */
	public void removeUserBtn(){
		
	}
	
	/**
	 * Exit to the login page
	 */
	public void logoutBtn(){
		try{
			FXMLLoader loader = new FXMLLoader();
			
			loader.setLocation(getClass().getResource("/view/Login.fxml"));
			
			AnchorPane root = (AnchorPane)loader.load();
			
			Stage stage = new Stage();
			
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Codeflow");
						
			stage.show(); // Pop-up login stage
			
			LoginController.adminStage.close(); // Close admin stage
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// Create column entries from the start 
		TableColumn userName = new TableColumn("Name");
		
		userName.setCellValueFactory(
                new PropertyValueFactory<UserEntry, String>("name"));
		
		TableColumn role = new TableColumn("Role");
		
	   role.setCellValueFactory(
                new PropertyValueFactory<UserEntry, String>("Role"));
	  
	   	userList = FXCollections.observableArrayList();
	   
	   	adminTV.setItems(userList);
		adminTV.getColumns().addAll(userName,role);
		
	}

}
