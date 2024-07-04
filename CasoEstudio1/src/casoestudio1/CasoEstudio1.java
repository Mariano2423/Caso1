/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class CasoEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        // Datos sobre la persona 
        
     // nombre del vendedor
     String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
     // cedula del vendedor
     String _cedula = JOptionPane.showInputDialog("Ingrese su cedula: ");
     double cedula = Double.parseDouble(_cedula);
     
     //codigo del vendedor   
     String _codigo = JOptionPane.showInputDialog("Ingrese su codigo: ");
     double codigo = Double.parseDouble(_codigo);
     
     // sucursal del vendedor
     String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal: ");
     
    // carrio propio del vendedor
     String carro = JOptionPane.showInputDialog("Tiene vehiculo propio (si o no): ");
    */ 
    // cantidad de facturas
     String _cantidadFacturas = JOptionPane.showInputDialog("Cantidad de facturas: ");
     int cantidadFacturas = Integer.parseInt(_cantidadFacturas);
    
    // verificar cuantas facturas se van a realizar
   while (cantidadFacturas > 0){
        cantidadFacturas = cantidadFacturas - 1;
        
        
    // Datos sobre la factura
    
    // nombre del cliente
    String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
    
    // cedula del cliente
    String _cedulaCliente = JOptionPane.showInputDialog("Ingrese la cedula del cliente: ");
    double cedulaCliente = Double.parseDouble(_cedulaCliente);
    
    // codigo de la factura
    String _codigoFactura = JOptionPane.showInputDialog("Ingrese el codigo de la factura : ");
    double codigoFactura = Double.parseDouble(_codigoFactura);
    
    // el monto de la factura
    String _monto = JOptionPane.showInputDialog("Ingrese el monto: ");
    double monto = Double.parseDouble(_monto);
    monto = monto + monto;
    
    JOptionPane.showConfirmDialog(null, monto);
    /*
    
    // Numero de mes 
    String _numeroMes = JOptionPane.showInputDialog("Ingrese el numero de mes: ");
    int numeroMes = Integer.parseInt(_numeroMes);
    
    // cambiar el numero por el nombre del mes
        String mes;
        switch(_numeroMes) {
            case "1":
                mes = "Enero";
                break;
            case "2":
                mes = "febrero";
                break;
            case "3":
                mes = "marzo";
                break;
            case "4":
                mes = "abril";
                break;
            case "5":
                mes = "mayo";
                break;
            case "6":
                mes = "junio";
                break;
            case "7":
                mes = "Julio";
                break;
            case "8":
                mes = "Agosto";
                break;
            case "9":
                mes = "Setiembre";
                break;
            case "10":
                mes = "Octubre";
                break;
            case "11":
                mes = "Noviembre";
                break;
            case "12":
                mes = "Diciembre";
                break;
                
        }
    
        
    // Calificacion del vendedor
    int calificacion = 0;
    
    // comisiones del vendedor
    double comisiones = 0;
    
    // Verificar si contiene productos electricos 
    String productosElec = JOptionPane.showInputDialog("Contiene productos electricos: "); 
   if(productosElec.equals("si")){
       String _cantidadElec = JOptionPane.showInputDialog("Cantidad de productos: ");
       int cantidadElec = Integer.parseInt(_cantidadElec);
    
       // se agregan los bonos
       if (cantidadElec >= 3){
           double bono4 = monto * 0.04;
           comisiones = comisiones + bono4;   
       }
       else{
           double bono2 = monto *0.02;
           comisiones = comisiones + bono2;
       }
       calificacion = calificacion + 1;
   } 
   else {      
   }
    
   // Verificar si tiene productos automotrices
    String productosAuto = JOptionPane.showInputDialog("Contiene productos Automotrices: ");
    if(productosAuto.equals("si")){
       String _cantidadAuto = JOptionPane.showInputDialog("Cantidad de productos: ");
       int cantidadAuto = Integer.parseInt(_cantidadAuto);
       
       // se agregan los bonos
       if (cantidadAuto > 4){
           double bono4 = monto * 0.04;
           comisiones = comisiones + bono4;
       }
       else{
           double bono2 = monto *0.02;
           comisiones = comisiones + bono2;
       }
       calificacion = calificacion + 1;
   } 
   else {      
   }
    
    // se verifica si tiene productos de construccion y si contiene se agrega el bono
    String productosCost = JOptionPane.showInputDialog("Contiene productos de construccion: ");
     if(productosCost.equals("si")){
       String _cantidadCost = JOptionPane.showInputDialog("Cantidad de productos: ");
       int cantidadCost = Integer.parseInt(_cantidadCost);
       double bono8 = monto * 0.08;
       comisiones = comisiones + bono8;
       calificacion = calificacion + 2;
   } 
     
   else {
   }
   if(productosElec.equals("si") + productosAuto.equals("si"));
*/
    }
}
