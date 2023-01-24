package Tema4;

public class SmartDevice {
    String marca;
    String modelo;
    int yearOfFabrication;

    int horasDeBateria;

    public SmartDevice(String marca, String modelo, int yearOfFabrication, int horasDeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.yearOfFabrication = yearOfFabrication;
        this.horasDeBateria = horasDeBateria;
    }

    public SmartDevice(){}

    public SmartDevice(String modelo) {
        this.modelo = modelo;
    }
}
