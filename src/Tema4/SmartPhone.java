package Tema4;

public class SmartPhone extends SmartDevice{
    boolean esTactil;
    boolean accsesorios;
    boolean tieneTeclado;
    boolean cargaRapida;
    String modoCarga;



    public SmartPhone(){}

    public SmartPhone(String marca, String modelo, int yearOfFabrication, int horasDeBateria, boolean esTactil, boolean accsesorios, boolean tieneTeclado, boolean cargaRapida, String modoCarga) {
        super(marca, modelo, yearOfFabrication, horasDeBateria);
        this.esTactil = esTactil;
        this.accsesorios = accsesorios;
        this.tieneTeclado = tieneTeclado;
        this.cargaRapida = cargaRapida;
        this.modoCarga = modoCarga;
    }
    public SmartPhone(String modelo){
        super(modelo);
    }

}
