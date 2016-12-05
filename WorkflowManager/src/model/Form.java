package model;

import java.util.HashMap;
import java.util.List;

public class Form {

    State belongsTo;

	//An actual form will just be a hashmap. This is just a wrapper class.
    //Key String is fieldname
    //Value related to key is the value user entered for that field
    List<Field> fields;
    //Method to get value given key. Will just use above. 
    String getValue(String Key);


    public List<Field> getFields() {
        return fields;
    }
}
