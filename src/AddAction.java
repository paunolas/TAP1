import java.util.*;

public class AddAction implements Action <Map<String,Integer>, Integer> {

    public Integer run (Map<String,Integer> args) {
        return args.get("x") + args.get("y");
    }
}
