import java.util.Scanner;

import models.Disco;
import models.Libro;

public class App {
    public static void main(String[] args) throws Exception {

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Publish a book or a disc (1. Book, 2. Disc)");
        int option = sc.nextInt();
        
        if(option == 1){
            String titulo = "";
            double precio = 0.0;
            int numeroPaginas = 0;
            int aniPublicacion = 0;
            

            sc.nextLine();
            System.out.println("Set Title: (Naruto)");
            titulo = sc.nextLine();
            System.out.println("Set Price:");
            precio = sc.nextDouble();
            System.out.println("Set Number of Pages:");
            numeroPaginas = sc.nextInt();
            System.out.println("Set Year of Publication:");
            aniPublicacion = sc.nextInt();
            sc.close();
            
            Libro libro = new Libro(titulo, precio, numeroPaginas, aniPublicacion);
            System.out.println(libro.toString());
            
        } else {
            String titulo = "";
            double precio = 0.0;
            int duracionMinutos = 0;
            
            sc.nextLine();
            System.out.println("Set Title: (Naruto)");
            titulo = sc.nextLine();
            System.out.println("Set Price:");
            precio = sc.nextDouble();
            System.out.println("Set Duration in Minutes:");
            duracionMinutos = sc.nextInt();

            sc.close();

            Disco disco = new Disco(titulo, precio, duracionMinutos);
            System.out.println(disco.toString());
        }

    }
}
