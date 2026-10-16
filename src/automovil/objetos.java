/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

/**
 *
 * @author longo
 */
public class objetos {
    
    public static void main(String[] args) {
        
        Automovil a1 = new Automovil();
        
        // String placa, double NivelCombustible, String modelo, String marca
        Automovil a2 = new Automovil("TKK-999",50.0,"Terreneitor 2026","Kia"); 
        
        // (String placa, double NivelCombustible, double consumiendo, int modelo, int VelocidadInicial, 
        //int VelocidadActual, String marca, int aceleracion, int detencion)
        Automovil A3 = new Automovil ("TJT-201", 50.0,5.0,"Terreneitor 2025",0,0,"Kia",40,15);
        
        A3.acelerar();
        
        A3.frenar();
        
        A3.ConsumirCombustible();
        
        A3.MostrarInformacion();
        
        
        
        
        
    }
      
}
