package InterfacesTema5;

public class Main {
    static CocheCRUD cocheCrud = new CocheCrudImpl();
    public static void main(String[] args) {
        cocheCrud.delete(new Coche());
        cocheCrud.save(new Coche());
        cocheCrud.findAll();
    }
}
