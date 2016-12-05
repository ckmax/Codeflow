package model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class State {
	
    private List<Form> forms;



















	String name_id;
    //A hashmap of all connections coming off this state. String key is connection name_id
	HashMap<String, Connection>ConnectionsLeaving;
	//A hashmap of all connections coming into this state. String key is connection name_id    
	HashMap<String, Connection> connectionHashMap;
	//All tokens within this state
    ArrayList<Token> Tokens;
    //Check to see if token can be moved from one state to another
    boolean checkIfCanMoveToken() {
        return false;
    }


    public List<State> nextStates() {
        return null;
    }

    public List<Form> getForms() {
        return forms;
    }
}
