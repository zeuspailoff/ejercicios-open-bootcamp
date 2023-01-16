import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;



public class Main {
    /* escribimos una cadena de texto al reves*/

    public static class TextoReves{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();

            StringBuilder reve = new StringBuilder(texto);
            texto = reve.reverse().toString();

            System.out.println(texto);

        }
    }
    /* recorremos un  array mostrando sus valores*/
    public static class ArrayUni{
        public static void main(String[] args) {

            String[] Nombres ={"Katie", "Abraham", "Jhon", "Sam"};

            for(String nombres : Nombres){
                System.out.println(nombres);
            }

        }
    }
    /* recorremos array bidimensional*/

    public static class ArraybI{
        public static void main(String[] args) {
            int[][] Enteros = {
                {5,6,8,9},
                {25,45,30,69}
            };
            for(int i=0; i<Enteros.length; i++){
                for (int y=0; y<Enteros.length; y++){
                    System.out.println(" Fila: " + (i + 1) + " Columna: " + (y + 1) +
                            " El valor es: " + Enteros[i][y] + "\n");
                }
            }
        }
    }
    /* operamos con vectores */
    public static class OperVector{
        public static void main(String[] args){
            Vector<String> vector = new Vector<String>();

            vector.add("katie");
            vector.add("Abraham");
            vector.add("Sam");
            vector.add("John");
            vector.add("Nana");

            System.out.println(vector);
                /* eliminamos los elementos solicitatos en el ejercicio*/
            vector.remove("Abraham");
            vector.remove("Sam");

            System.out.println(vector);
            /*
                Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
                1000 elementos para ser añadidos al mismo.

                el problema seria que el aalmacenamiento por defecto es de 10, al sobrepasarlo este aumentaria de
                forma automatica creando otro vector mayor, pero al hacer eso se duplicaria para copiar los datos
                en el nuevo es decir tirariamos muchisimo de memoria y gastariamos muchos recursos del sistema,
                por eso lo mejor es estimar bien cuanta capacidad necesitaremos de almacenamiento.
            */




        }
    }
    /* operamos con arraylist y pasamos los datos a linkedlist*/
    public static class ArrayDemo{
        public static void main(String[] args) {

            ArrayList<String> Info = new ArrayList<String>();
            Info.add("Katie");
            Info.add("Abraham");
            Info.add("Tracey");
            Info.add("Hanabel");

            LinkedList<String> List = new LinkedList<String>();

            for (int i = 0; i < Info.size(); i++) {
                List.add(i, Info.get(i));
            }

            System.out.println("Elementos del Array:");
            for (String elementos : Info) {
                System.out.print(elementos + " ");
            }

            System.out.println("\n\nElementos de la LinkedList:");
            for (String elementos : List) {
                System.out.print(elementos + " ");
            }

        }
        /* eliminamos los pares de un arraylist despues de rellenarlo con un bucle */
        public static class ArrayDemoint{
            public static <integer> void main(String[] args) {

                ArrayList<Integer> Numeros = new ArrayList<>();

                for (int i = 1; i < 11; i++) {
                    Numeros.add(i);

                }
                System.out.println("el array normal es: " + Numeros);

                for(int Date =0; Date<Numeros.size(); Date++){
                    if (Numeros.get(Date) % 2 ==0){
                        Numeros.remove(Date);
                    }
                } System.out.println("el array sin pares es: " + Numeros);
            }
        }
        /* crea un exepcion arimetica al dividir por 0 y arreglamos con el metodo try catch*/
        public static class DividePorCero{
            public static int Dividir(int a, int b) throws ArithmeticException{
                return  a / b ;
            }
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("¿que numeros deseas dividir?");
                System.out.print("numero a: ");
                int a = scanner.nextInt();
                System.out.print("numero b: ");
                int b = scanner.nextInt();

                try {
                    System.out.println("resultado: " + Dividir(a,b));
                }catch (ArithmeticException e){
                    System.out.println("esto no puede hacerse");
                }finally {
                    System.out.println("Demo de codigo");
                }


            }
        }
        public static class CopiaTxt{
            public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);
                System.out.println("inserta el fichero que quieres copiar: ");
                String File1 = scanner.nextLine();
                System.out.println("inserta el fichero donde pegaremos los datos: ");
                String File2 = scanner.nextLine();
                copy(File1, File2);
            }
            public static void copy (String File1, String File2){
                try {
                    InputStream in = new FileInputStream(File1);
                    byte[] Info = in.readAllBytes();
                    in.close();

                    PrintStream out = new PrintStream(File2);
                    out.write(Info);
                    out.close();
                }catch (Exception e){
                    System.out.println("Exception: " + e.getMessage());
                }

            }
        }

    }



}