/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_herencia_constructores;

/**
 *
 * @author invitado
 */
public class Eva2_6_Herencia_Constructores {

   
    public static void main(String[] args) {
        System.out.println("Clase animal");
    Animal animal = new Animal();
    animal.comer();
    animal.respirar();
        System.out.println("Clase mamifero");
    Mamifero Mamifero = new Mamifero();
            Mamifero.comer();
            Mamifero.respirar();
            Mamifero.tenerPelo();
            
            }
    
}
