package model;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;

public class Token {
	
	//Current state token is in
    State CurrentState;
    //All forms associated with token at the moment
    List<Form> Forms;
    //Workflow instance that this token is in
    WorkflowInstance workflowinstance;
    //A boolean to test whether this token is active and can be moved to the next state
















    Boolean active;
    //Submit forms for this token
    void SubmitForms(ArrayList<Form> Forms);
    void ClearForms();


}
