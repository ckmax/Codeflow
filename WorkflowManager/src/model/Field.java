package model;

/**
 * Created by Derek on 12/5/16.
 */
public class Field {
    private String name;
    private String value;
    private String type;

    public Field() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
