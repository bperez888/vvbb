/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author bren
 */
public class trabajador {
    //atributes
    public String id;

    /**
     *
     */
    public String sexo;
    public int edad;
    private double salario;
    public Integer edad2;
    public Empresa empresa;
   
    
    public double calcularSalario(){
        double resultado =0.09;
        resultado = this.salario - this.salario * 0.09;
        return resultado;
        
        
        
    }
    
    public void imprimaDatosPersonales (){
        System.out.println("el sexo del trabajador es" + sexo );
        
    }
            
    private void cambiarSexo (string sexo) {
        this.sexo=sexo;
        
    }

    private static class Empresa {

        public Empresa() {
        }
    }
    
    
    
}
