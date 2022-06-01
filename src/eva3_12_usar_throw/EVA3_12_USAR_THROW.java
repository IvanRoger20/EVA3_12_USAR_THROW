/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_usar_throw;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        try{
            System.out.println("Introduzca su edad(En numero entero y positivo): ");
            valor = sc.nextInt();
            if(valor < 0)
                throw new Exception("El valor: " + valor + " no es una edad válida");
            System.out.println("La edad capturada es: " + valor);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
