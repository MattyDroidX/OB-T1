package InterfacesTema5;

public class Coche {
    String marca;
    String modelo;
    String yearOfFabrication;
    int cantidadDePuertas;
    boolean IsSport;

    public Coche(String marca, String modelo, String yearOfFabrication, int cantidadDePuertas, boolean isSport) {
        this.marca = marca;
        this.modelo = modelo;
        this.yearOfFabrication = yearOfFabrication;
        this.cantidadDePuertas = cantidadDePuertas;
        IsSport = isSport;
    }

    public Coche() {
    }
}
