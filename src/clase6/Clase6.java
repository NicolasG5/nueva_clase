
package clase6;

import java.util.Scanner;


public class Clase6 {

   
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int opcion = 0;
        do {
        System.out.println("-- Menu principal --");
        System.out.println("1) Ingresar persona");
        System.out.println("2) Listar persona");
        System.out.println("3) Eliminar persona");
        System.out.println("4) Salir");
        System.out.println("Ingrese opcion (1-4):");
        opcion= teclado.nextInt();
        switch (opcion) {
            case 1:
                ingresarPersona();
                break;
            case 2:
                listarPersona();
                break;
            case 3:
                eliminarPersona();
                break;
            case 4:
                System.out.println("adiosss");
                break;
            default:
                System.out.println("solo deben ingresar numeros entre 1 y 4");
        }
            
        } while (opcion!=4);
        
        
    }
    public static void ingresarPersona(){
        System.out.println("Ingrese una nueva persona");
        Scanner teclado =new Scanner(System.in);
        String nombre= teclado.next();
        System.out.println("largo del nombre:"+nombre.length());
        System.out.println("recupera caracter por 2 :"+nombre.charAt(2));
        if (nombre.equals("hola")) {
            System.out.println("escribio hola");
        }
        if (nombre.equalsIgnoreCase("HOLA")) {
            System.out.println("escribio hola sin importar mayuscula minuscula");
        }
        if (nombre.startsWith("ho")) {
            System.out.println("inicia con ho");
        }
        if (nombre.startsWith("la")) {
            System.out.println("finaliza con la");
        }
        System.out.println("mayuscula:"+nombre.toUpperCase());
        System.out.println("minuscula:"+nombre.toLowerCase());
        System.out.println("trozo de texto:"+nombre.substring(1, 4));
    }
    public static void listarPersona(){
        System.out.println("listar una nueva persona");
    }
    public static void eliminarPersona(){
        System.out.println("eliminar una persona");
    }
    
}
