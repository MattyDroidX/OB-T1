package InterfacesTema5;

public class Main {
    static CocheCrudImpl coche;
    public static void main(String[] args) {
        coche.delete(new Coche());
        coche.save(new Coche());
        coche.findAll();
    }
}
