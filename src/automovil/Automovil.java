/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author longo
 */
public class Automovil {
    
    // Atributos
    
    private String placa;
    private double NivelCombustible;
    private double consumiendo;
    private String modelo;
    private int VelocidadInicial;
    private int VelocidadActual;
    private String marca;
    private int aceleracion;
    private int detencion;
    
    //constructores

    public Automovil() {
    }
    
    

    public Automovil(String placa, double NivelCombustible, double consumiendo, String modelo, int VelocidadInicial, int VelocidadActual, String marca, int aceleracion, int detencion) {
        this.placa = placa;
        this.NivelCombustible = NivelCombustible;
        this.consumiendo = consumiendo;
        this.modelo = modelo;
        this.VelocidadInicial = VelocidadInicial;
        this.VelocidadActual = VelocidadActual;
        this.marca = marca;
        this.aceleracion = aceleracion;
        this.detencion = detencion;
    }

    public Automovil(String placa, double NivelCombustible, String modelo, String marca) {
        this.placa = placa;
        this.NivelCombustible = NivelCombustible;
        this.modelo = modelo;
        this.marca = marca;
    }    
    
    // metodos y funciones set y get

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getNivelCombustible() {
        return NivelCombustible;
    }

    public void setNivelCombustible(double NivelCombustible) {
        this.NivelCombustible = NivelCombustible;
    }

    public int getDetencion() {
        return detencion;
    }

    public void setDetencion(int detencion) {
        this.detencion = detencion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadInicial() {
        return VelocidadInicial;
    }

    public void setVelocidadInicial(int VelocidadInicial) {
        this.VelocidadInicial = VelocidadInicial;
    }

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getFrenar() {
        return detencion;
    }

    public void setFrenar(int frenar) {
        this.detencion = frenar;
    }

    public double getConsumiendo() {
        return consumiendo;
    }

    public void setConsumiendo(double consumiendo) {
        this.consumiendo = consumiendo;
    }
    
    

    
    
    
    // metodos io funciones de clase
    
    public void acelerar () {
        
         if (aceleracion > 0){
             
            VelocidadActual =  VelocidadInicial +  aceleracion;   
            
            System.out.println("Acelerando: "+aceleracion +" Km/h");
            System.out.println("Velocidad actual: "+VelocidadActual +" Km/h");
            
         }
         
    }
    
    public void frenar () {
        
         if (detencion > 0){
             
            VelocidadActual =  aceleracion -  detencion;   
            
            System.out.println("\nFrenando: "+detencion +" Km/h");
            System.out.println("Velocidad actual: "+VelocidadActual +" Km/h");
            
         }
         
    }
    
    public void ConsumirCombustible () {
        
         if (NivelCombustible > 0){
             
            NivelCombustible =  NivelCombustible - consumiendo;   
            
            System.out.println("\nconsumiendo: "+consumiendo +" Litros");
            System.out.println("Combustible disponible: "+NivelCombustible +" Litros");
            
         }
         
         if (consumiendo > NivelCombustible){
             
             System.out.println("Error: Combustible insuficiente");
            
         }
         
 }
    
public void MostrarInformacion () {
    
    System.out.println("\nInformacion del vehiculo: " +"\n"+"\n" +"placa: "+placa +"\n" +"modelo: "+modelo+"\n" +"marca: "+marca+"\n" +"NivelCombustible: "+NivelCombustible +" Litros");
    
}
}


    
    

   
    
    

    
    
    

    
    

