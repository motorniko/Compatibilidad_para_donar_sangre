import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------");
        System.out.println("=== BIENVENIDO AL PROGRAMA DE DONACION DE SANGRE ===");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ingrese la edad del donador: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el peso del donador: ");
        int peso = scanner.nextInt();

        donacion(edad, peso);
    }
    public static void donacion(int edad, int peso){
        if(edad >= 18 && edad <= 65 && peso >= 50){
            System.out.println("El donador es compatible "+"edad "+edad+" peso "+peso);
        }
        else if (edad < 18) {
            System.out.println("** DONADOR NO COMPATIBLE **");
            System.out.println("-----------------------------------------------------------");
            System.out.println("El donante debe tener almenos 18 años de edad. EDAD ACTUAL: " +edad);
            System.out.println("-----------------------------------------------------------");
        }
        else if (edad > 65) {
            System.out.println("** DONADOR NO COMPATIBLE **");
            System.out.println("-----------------------------------------------------------");
            System.out.println("El donador debe ser menor de 65 años de edad. EDAD ACTUAL: " + edad);
            System.out.println("-----------------------------------------------------------");
        }
        else{
            System.out.println("** DONADOR NO COMPATIBLE **");
            System.out.println("-----------------------------------------------------------");
            System.out.println("El dondador debe tener un peso minimo de 50 Kg. PESO ACTUAL: " + peso);
            System.out.println("-----------------------------------------------------------");
        }
    }
}
