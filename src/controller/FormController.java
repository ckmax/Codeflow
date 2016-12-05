package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FormController implements Initializable {

	@FXML AnchorPane formAP;
	
	public void populateForm(){
				
		final VBox vbox = new VBox();
	    final HBox hbox = new HBox();
	    final TextField columns = new TextField();
	    Button newColumn = new Button("New Column");
	    Button done = new Button("Done");
	    hbox.setSpacing(5);
	    hbox.getChildren().addAll(columns, newColumn);
	    vbox.setSpacing(5);
	    vbox.setPadding(new Insets(20, 0, 0, 20));
	    vbox.getChildren().addAll(hbox);
		AnchorPane.setRightAnchor(vbox, 10.0);
		
		formAP.getChildren().add(vbox);
		
		//When you press submit, we can save the values of the form through this
		newColumn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        System.out.println(columns.getText());
		    }
		});

	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		populateForm();
		
	}
}
