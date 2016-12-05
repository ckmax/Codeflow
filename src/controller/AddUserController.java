package controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import model.UserEntry;

public class AddUserController {
	
	@FXML private TextField usernameTF;
	@FXML private TextField passwordTF;
	@FXML private TextField nameTF;
	@FXML private MenuButton usertypeMB;
	
	/**
	 * 	Calls createUser() from workflowManager and updates the dashboard
	 */
	public void addUserBtn(){
		
		// TODO: ERROR CHECK
		
		UserEntry user = new UserEntry(nameTF.getText(), "Type1");
		
		// Create a UserEntry and add it to the observable list
		AdminController.userList.add(user);		
		
	    //AdminController.adminTV.setItems(AdminController.userList);
		
		//Close current stage
		AdminController.addUserStage.close();
		
	}
	
	
	public void cancelBtn(){
		
	}

}
