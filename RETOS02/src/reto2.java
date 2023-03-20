import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       

        String palabra;
        String palabraa="";

        System.out.println("Ingrese una palabra:");
        palabra = sc.nextLine();

       
        for (int i = palabra.length() - 1; i >= 0; i--) {
            
            palabraa += palabra.charAt(i);
        }
       
        if (palabra.equals(palabraa)) {
            System.out.println("La palabra se lee igual al derecho y al reves es un palindromo.");
          
        } else {
            System.out.println("La palabra no es palindromo.");
        }
        sc.close();
    }
}