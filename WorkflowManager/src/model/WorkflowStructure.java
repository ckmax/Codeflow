package model;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

public class WorkflowStructure {
	
	//Key value is name of state
    //Second value is state associated with that name
    HashMap<String, State> States;
    //String is connection name key and Connection is actual connection
    HashMap<String, Connection> Connections;
    //A list of specific start states
    State StartState;

    public WorkflowStructure(List<State> states, List<model.Connection> connections, List<Form> forms, List<SelectionState> selectionStates, List<BranchingState>) {

    }

    public State getStartState() {
        return StartState;
    }
}
