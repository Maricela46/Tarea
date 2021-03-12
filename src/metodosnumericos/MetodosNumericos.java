
package metodosnumericos;

import java.util.Scanner;

public class MetodosNumericos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
        double VR, VA;
           
        System.out.println("Ingrese el valor real");
        VR = teclado.nextDouble();
        System.out.println("Ingrese el valor aproximado");
        VA = teclado.nextDouble();
        
        errores errores2 = new errores(VR, VA);
        
        System.out.println("El error absoluto es: " + errores2.ErrorAbsoluto());
        System.out.println("El error relativo es: " + errores2.ErrorRelativo());
        System.out.println("El error relativo porcentual es: " + errores2.ErrorRelativoPorcentual());


    }
    
}
