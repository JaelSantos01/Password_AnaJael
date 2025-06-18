package com.mycompany.validarcontra;
import java.util.Scanner;
public class ValidarContra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        
        System.out.println("Ingrese la contraseña");
        String contra = leer.nextLine();
        
        if(contra.matches(regex)) {
            System.out.println("Contraseña válida.");
            
        } else {
            System.out.println("Contraseña inválida. Debe contener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
            
        }
    }
}
