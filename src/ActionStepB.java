import java.util.List;

import static java.util.Collections.singletonList;

public class ActionStepB extends ActionStep<List<String>> {

    @Override
    public List<String> run() {
        return singletonList("Oi");
    }
}
