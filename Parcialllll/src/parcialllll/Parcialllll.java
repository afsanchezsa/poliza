/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialllll;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Parcialllll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco banco1=new Banco("banco1");
        Cuenta cuenta1=new Cuenta(1, 152, "26/09/2017","Andres");
        Cuenta cuenta2=new Cuenta(2,187,"26/09/2017","Felipe");
        Tipo consignacion=new Tipo("consignacion");
        Tipo retiro=new Tipo("retiro");
        banco1.addTipo(consignacion);
        banco1.addTipo(retiro);
        cuenta1.addMouvement("26/09/2017", 10,consignacion);
        cuenta1.addMouvement("26/09/2017", 35,retiro);
        cuenta2.addMouvement("26/09/2017", 74,consignacion);
        cuenta2.addMouvement("26/09/2017", 10,retiro);
        System.out.println("Extracto bancario");  
        banco1.addCuenta(cuenta1);
        banco1.addCuenta(cuenta2);
      /* ArrayList<Cuenta>cuentas=banco1.getComptes();
        
        for(Cuenta c:cuentas){
            System.out.println("Numero de cuenta: "+c.getNumeroCompte());
            System.out.println("saldo actual "+c.getSoldeCourant());
            System.out.println("Fecha de Creacion "+c.getDateCreation());
            System.out.println("Nombre del cliente: "+c.getNomClient());
            System.out.println("Movimientos: ");
            for(Movimiento m:c.getMouvements()){
                System.out.println("/////////////");
                System.out.println("Fecha: "+m.getDate());
                System.out.println("Saldo Anterior:"+m.getSoldePrecedent());
                System.out.println("Monto:"+m.getMontant());
                System.out.println("tipo de Movimiento:"+m.getType().getCode());
            }
        
        }
        */
      
      /*al indicar que se debe hacer un metodo para listar la informacion de todas las cuentas decidi ponerlo en la clase bancos que conoce toda la informacion necesaria, sin embargo no se si para
      este ejercicio aplique la logica del negocio apartada de el funcionamiento de las clases, se puede ver que el funcionamiento es el mismo que si yo aplico los extractos desde el main
      */
        banco1.Extracto();
        
    }
    
}
