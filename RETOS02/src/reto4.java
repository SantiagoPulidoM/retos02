import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {

       Scanner Registro=new Scanner(System.in);
              
       //creacion de la matriz 
       String[][] cara=new String[4][4];
        //creacion del blucle f= filas c=columnas 
       for(int f=1;f<4;f++){
            for(int c=1;c<4;c++){
                System.out.println("Ingrese el emoji que desea ");
                cara[f][c]=Registro.next();

            }
       }
       for(int f=1;f<4;f++) {
        for (int c =1;c<4;c++) {
            System.out.print(cara[f][c] + " | ");
        }
        System.out.println();
    }

        Registro.close();
    }
    }