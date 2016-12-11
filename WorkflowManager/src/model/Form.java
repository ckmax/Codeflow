
package model;

import java.util.List;

public class Form {
    private List<Field> fields;

    public Form(State state, List<Field> fields) {
        this.fields = fields;
    }

    public List<Field> getFields() {
        return this.fields;
    }
    
    public Form(List<Field> fields){
    	this.fields = fields;
    }
}
