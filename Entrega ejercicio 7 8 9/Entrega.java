package Ejercicio789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

/*
*
* Dada la función:

 public static String reverse(String texto) { }








* Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

* Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

* Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

* Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
*
* */
public class Entrega {

// Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

    public static class CadenaReves {

        public static void main(String[] args) {

            System.out.println("-------------------- \n Cadena al Revés\n--------------------");

            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();

            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();

            System.out.println(texto);
        }
    }

    // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static class UniDimensional {

        public static void main(String[] args) {
            System.out.println("-------------------- \n Array Unidimensional \n--------------------");

            String textos[] = {"Inicio", "siguiente", "Siguiente", "Final"};

            for (String texto : textos) {
                System.out.println(texto);
            }

        }
    }

    // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static class BidiDimensional {

        public static void main(String[] args) {
            System.out.println("-------------------- \n Array Bidimensional\n--------------------");


            int numeros[][] = {
                    {1, 2, 3,},
                    {4, 5, 6,}
            };

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    System.out.println("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
                            "\nEl valor es: " + numeros[i][j] + "\n");
                }
            }


        }


    }

// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2do y 3er elemento y muestra el resultado final.

    public static class EjercicioVector {

        public static void main(String[] args) {
            System.out.println("-------------------- \n Vector \n--------------------");

            Vector vector = new Vector();

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);

            System.out.println("Vector antes de eliminar: " + vector);

            vector.remove(2);
            vector.remove(1);

            System.out.println("Vector de eliminar: " + vector);

            // Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

            System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                    " el limite establecido la dimension del vector se duplica.");
        }

    }

 /*
    Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
    Recorre ambos mostrando únicamente el valor de cada elemento.
  */

    public static class ArrayListEj {
        public static void main(String[] args) {
            System.out.println("-------------------- \n ArrayList \n--------------------");

            ArrayList<String> lista = new ArrayList<String>();
            lista.add("Hola");
            lista.add("Chau");
            lista.add("Adios");
            lista.add("Bienvenido");

            LinkedList<String> linkedlista = new LinkedList<String>();

            for (int i = 0; i < lista.size(); i++) {
                linkedlista.add(lista.get(i));
            }

            System.out.println("Elementos del Array:");
            for (String elementos : lista) {
                System.out.print(elementos + " ");
            }

            System.out.println("\n\nElementos de la LinkedList:");
            for (String elementos : linkedlista) {
                System.out.print(elementos + " ");
            }

        }
    }

/*
       Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
       A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo
       y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
       el primer "for" de relleno.
*/
    public static class Arrayint {
        public static void main(String[] args) {
            System.out.println("-------------------- \n ArrayList INT\n--------------------");

            ArrayList<Integer> numeros = new ArrayList<Integer>();

            for (int i = 0; i < 10; i++) {
                numeros.add(i+1);
                for (int j=0; j < numeros.size(); j++) {
                    if(numeros.get(j)%2==0){
                        numeros.remove(j);
                    }
                }
            }
            System.out.println("ArrayList luego de completar y eliminar números pares: " + numeros);

        }
    }



    /*
            Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
            ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
            mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        */
    public static class DividePorCero {

            private static int Dividir(int a, int b) throws ArithmeticException{
                return a/b;
            }


            public static void main(String[] args) {

                System.out.println("-------------------- \n DividePorCero\n--------------------");
            Scanner scanner = new Scanner(System.in);
                System.out.println("Indique los números que quiere dividir: ");
                System.out.println("número 1:");
                int a = scanner.nextInt();
                System.out.println("número 2:");
                int b = scanner.nextInt();

                try {
                    System.out.println("Resultado: "+ Dividir(a,b));
                }catch (ArithmeticException e) {
                    System.out.println("Esto no puede hacerse");
                } finally {
                    System.out.println("Demo");
                }


            }




        }


 /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        dado en "fileOut".
    */


    public static class CopiarFicheros{

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce el fichero de origen: ");
            String fileIn = scan.nextLine();
            System.out.println("Introduce el fichero de destino: ");
            String fileOut = scan.nextLine();
            copiar(fileIn, fileOut);

        }

        public static void copiar(String fileIn, String fileOut){
            try {
                InputStream in = new FileInputStream(fileIn);
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();
            }catch (Exception e ){
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    }

