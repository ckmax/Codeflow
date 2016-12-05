package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Derek on 12/5/16.
 */
public class SelectionState extends State {

    @Override
    public List<State> nextStates() {
        return new ArrayList<>();
    }
}
