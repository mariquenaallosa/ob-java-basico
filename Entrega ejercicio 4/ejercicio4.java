package poo.clases;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    String sistemaOperativo;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        sistemaOperativo = sistemaOperativo;
    }


    public static class SmartPhone extends SmartDevice {
        int ram;
        int almacenamiento;

        public SmartPhone(String marca, String modelo, String color, String sistemaOperativo) {
            super(marca, modelo, color, sistemaOperativo);
        }

        public SmartPhone(String marca, String modelo, String color, String sistemaOperativo, int ram, int almacenamiento) {
            super(marca, modelo, color, sistemaOperativo);
            this.ram = ram;
            this.almacenamiento = almacenamiento;
        }


        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", color=" + color +
                    ", sistema operativo=" + sistemaOperativo +
                    ", ram=" + ram +
                    ", almacenamiento=" + almacenamiento;
        }


    }


    public static class SmartWatch extends SmartDevice {
        double pulgadas;
        String conectividad;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String marca, String modelo, String color, String sistemaOperativo, double pulgadas, String conectividad) {
            super(marca, modelo, color, sistemaOperativo);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", color=" + color +
                    ", sistema operativo=" + sistemaOperativo +
                    ", pulgadas=" + pulgadas +
                    ", conectividad=" + conectividad;
        }
    }


    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Samsung", "S10", "Azul","Android", 8, 512);

        SmartWatch smartWatch = new SmartWatch("Xiaomi", "Mi Band 6", "Negro","MIUI", 3.5, "Bluetooth");

        System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);

    }
}
