import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edadMin = 18;
        int edadMax = 65;
        int pesoMin = 50;

        System.out.println("-----------------------------------------------------------");
        System.out.println("=== BIENVENIDO AL PROGRAMA DE DONACION DE SANGRE ===");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ingrese la edad del donador: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el peso del donador: ");
        int peso = scanner.nextInt();

        donacion(edad, peso, edadMin, edadMax, pesoMin);
    }
    public static void donacion(int edad, int peso, int edadMin, int edadMax, int pesoMAx){
        if(edad >= edadMin  && edad <= edadMax && peso >= pesoMAx){
            System.out.println("El donador es compatible "+"edad "+edad+" peso "+peso);
        }
        else {
            System.out.println("donador no compatible");
            if (edad < 18) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("** DONADOR NO COMPATIBLE **");
                System.out.println("-----------------------------------------------------------");
                System.out.println("--> El donante debe tener almenos "+edadMin+" años de edad. EDAD ACTUAL: " +edad);
                System.out.println("-----------------------------------------------------------");
            }
            if (edad > 65) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("** DONADOR NO COMPATIBLE **");
                System.out.println("-----------------------------------------------------------");
                System.out.println("--> El donador debe ser menor de "+edadMax+" años de edad. EDAD ACTUAL: " + edad);
                System.out.println("-----------------------------------------------------------");
            }
            if (peso < 50) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("** DONADOR NO COMPATIBLE **");
                System.out.println("-----------------------------------------------------------");
                System.out.println("--> El dondador debe tener un peso minimo de "+pesoMAx+ " Kg. PESO ACTUAL: " + peso+" Kg");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}
