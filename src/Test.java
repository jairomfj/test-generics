import java.util.List;

public class Test {

    public static void main(String[] args) {
        ActionStep<String> actionStep1 = new ActionStepA();
        Action<String> action1 = new ActionA(actionStep1);
        Action.ActionResponse response1 = action1.execute();

        ActionStep<List<String>> actionStep2 = new ActionStepB();
        Action<String> action2 = new ActionA(actionStep2);
        Action.ActionResponse response2 = action2.execute();

        assert(response1 != null);
        assert(response2 != null);
    }
}
