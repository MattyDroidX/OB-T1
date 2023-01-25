package InterfacesTema5;

public class CocheCrudImpl implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        System.out.println("Metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo findAll");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Metodo delete");
    }
}
