public class Invoker {
    protected String id;
    private int memoria_disponible;
    private boolean disponible;

    public Invoker(String id, int memoria_disponible) {
        this. id = id;
        this.disponible = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMemoria_disponible() {
        return memoria_disponible;
    }

    public void setMemoria_disponible(int memoria_disponible) {
        this.memoria_disponible = memoria_disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
