import java.util.*;

public class Main {

    public static void main (String[] args) {

        Controller controller = new Controller();
        Action accion_sumar = new AddAction();
        controller.registerAction("sumar",accion_sumar);
        System.out.println(controller.getInvokerList());
        int result = controller.invokeFunction("sumar", Map.of("x", 1, "y", 2));
        // System.out.println(result);
    }
}
