import java.util.*;

public class Controller {

   // private List<String> invokerList = new LinkedList<String>();
   // private Map<String,Action> invokerList = new Map<String, Action>()
   private Map<String, Action> invokerList = new HashMap<String, Action>();

    public int invokeFunction(String input, Map mapa) {

        Action accio_rebuda = invokerList.get(input);
        return accio_rebuda.run(accio_rebuda);
    }

    public void registerAction(String nombre, Action accion_añadir) {
        invokerList.put(nombre,accion_añadir);
    }

    private String invocarEninvoker(Invoker invoker, String input) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

        return ("Resultat de la funció del invoker: "+invoker.getId());
    }

    public Map<String, Action> getInvokerList() {
        return invokerList;
    }

    public void setInvokerList(Map<String, Action> invokerList) {
        this.invokerList = invokerList;
    }
}


