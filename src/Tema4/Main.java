package Tema4;

public class Main {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone("14 PRO MAX");
        SmartWatch appleWatch = new SmartWatch("Series 7");
        SmartPhone samsungs10 = new SmartPhone("samsung", "S10", 2022, 180, true, true, false, true, "Tipo C");
        SmartWatch XiaomiWatch = new SmartWatch("Xiaomi", "MiBand4", 2020,360,true,true);


        System.out.println(iphone.modelo);
        System.out.println(appleWatch.modelo);
        System.out.println(samsungs10.modelo);
        System.out.println(samsungs10.cargaRapida);
        System.out.println(samsungs10.modoCarga);
        System.out.println(samsungs10.accsesorios);
        System.out.println(XiaomiWatch.modelo);
        System.out.println(XiaomiWatch.marca);
        System.out.println(XiaomiWatch.resistenteAlAgua);
        System.out.println(XiaomiWatch.horasDeBateria);
    }
}

