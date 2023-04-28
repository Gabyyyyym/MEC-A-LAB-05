package gestionship;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LAB05 {
    public static void main(String[] args) { 
        String archivo = "NACIMIENTOS1.csv";
        
        try{
            BufferedReader lector= new BufferedReader(new FileReader(archivo));
            String linea;
            
            int n=100;
               while ((linea=lector.readLine())!= null && --n>0){
                   System.out.println(linea);
        }
        lector.close();
    }catch (IOException e){
    System.out.println("Error al abrir el archivo: "+e.getMessage());
            }
}
}