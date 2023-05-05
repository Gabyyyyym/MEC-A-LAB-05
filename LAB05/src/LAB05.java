import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LAB05 {
    public static void main(String[] args) {
        File archivo = new File("NACIMIENTOS1.csv"); 

        try {
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }
}
