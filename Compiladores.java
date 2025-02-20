
package compiladores;
import java.io.File; 

public class Compiladores {

    public static void main(String[] args) {   
        
        String nombreDirectorio = "Compiladores1"; 
        File directorio = new File("C:\\Users\\alons\\Documents\\COMPILADORES\\"+nombreDirectorio);  

        if (directorio.mkdir()) {  
            System.out.println("Directorio '" + nombreDirectorio + "' creado con éxito");  
        } else {  
            
            if (directorio.exists()) {  
                System.out.println("El directorio '" + nombreDirectorio + "' ya existe");  
            } else {  
                System.out.println("No se pudo crear el directorio");  
            }  
        }  
    }  
}  
    

