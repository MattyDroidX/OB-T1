package Tema4;

public class SmartWatch extends SmartDevice{

    boolean accesoriosWatch;

    boolean resistenteAlAgua;


    public SmartWatch(String marca, String modelo, int yearOfFabrication, int horasDeBateria, boolean accesoriosWatch, boolean resistenteAlAgua) {
        super(marca, modelo, yearOfFabrication, horasDeBateria);
        this.accesoriosWatch = accesoriosWatch;
        this.resistenteAlAgua = resistenteAlAgua;
    }

    public SmartWatch(){}

    public SmartWatch(String modelo){
        super(modelo);
    }
}
