/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora2;

/**
 *
 * @author mathillesheim
 */
public class calculadora02 {
    public static void main(String[] args) {
        
       
        interno2 calculadora = new interno2();
        calculadora.num1 = 15;
        calculadora.num2 = 5;
        
        System.out.println("A soma dos números é: " + calculadora.soma());
        System.out.println("A divisão dos números é: " + calculadora.dividir());
        System.out.println("A subtração dos números é: " + calculadora.sub());
        System.out.println("A divição dos números é: " + calculadora.mult());
        
    }
  


}
