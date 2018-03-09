import static java.util.Collections.singletonList;

public class ActionA extends Action<String> {

    public ActionA(ActionStep actionStep) {
        super.actionSteps = singletonList(actionStep);
    }
}
