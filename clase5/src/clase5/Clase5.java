/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author bren
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Trabajador esclavo1 = new Trabajador();
         Trabajador esclavo2 = new Trabajador();
         Trabajador JuanitoElCapatas = new Trabajador();
         
         esclavo1.edad = 20;
         esclavo1.sexo = "M";
         esclavo2.edad = 18;
         esclavo2.sexo = "f";
         JuanitoElCapatas.edad = 50;
         
         System.out.println("esclavo1.edad =" + esclavo1.edad);
         System.out.println("esclavo2.edad =" + esclavo2.edad);
         System.out.println("JuanitoElCapatas.edad =" + JuanitoElCapatas.edad);
         
         
         
         
         
    }

    private static class Trabajador {

        private int edad;
        private String sexo;

        public Trabajador() {
        }
    }
    
}
