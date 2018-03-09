import java.util.List;

public abstract class Action<T> {

    private ActionResponse<T> response;

    List<ActionStep> actionSteps;

    public ActionResponse<T> execute() {
        for(ActionStep<T> step : actionSteps) {
            T stepReturn = step.run();
            response = new ActionResponse<>(stepReturn);
        }

        return response;
    }

    class ActionResponse<T> {
        final T value;

        ActionResponse(T value) {
            this.value = value;
        }
    }
}
