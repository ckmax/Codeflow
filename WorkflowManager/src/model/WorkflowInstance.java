package model;

import java.util.ArrayList;
import java.util.List;

public class WorkflowInstance {

    private List<State> currentStates;
    private int workflowID;
    private List<Form> forms;
    private WorkflowStructure structure;

    public WorkflowInstance(WorkflowStructure structure, int workflowID) {
        this.structure = structure;
        this.currentStates.add(this.structure.StartState);
        forms = new ArrayList<>();
        currentStates.forEach(state -> forms.addAll(state.getForms()));
        this.workflowID = workflowID;
    }

    public void move(State src, State dst) {
        currentStates.remove(src);
        currentStates.add(dst);
        forms.addAll(dst.getForms());
    }

    public List<State> getCurrentStates() {
        return currentStates;
    }
}
