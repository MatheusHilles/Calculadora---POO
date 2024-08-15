
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        Interno calculadora = new Interno();
        calculadora.num1 = 15;
        calculadora.num2 = 5;
        
        System.out.println("A soma dos números é: " + calculadora.soma());
        System.out.println("A divisão dos números é: " + calculadora.dividir());
        System.out.println("A subtração dos números é: " + calculadora.sub());
        System.out.println("A divição dos números é: " + calculadora.mult());
        
    }
    
}
