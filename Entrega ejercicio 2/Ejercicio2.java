import java.util.Scanner;

public class Ejercicio2 {
    /*
    * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        double precio = scanner.nextDouble();

        double precioConIva = getPrice(precio);

        System.out.println("El precio sin IVA es : " + precio);
        System.out.println("El IVA es : " + precio*0.21);
        System.out.println("El precio con IVA es : " + precioConIva);

    }

    static double getPrice(double precio){
        return precio + (precio*0.21);
    }
}
