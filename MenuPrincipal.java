


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel Gonzalez
 */
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
         int var1= 0;
        int var2 = 0;
        boolean flag=true;
        boolean flag2=false;
        
         

        
        do{
         try{
             System.out.println("***** MENU PRINCIPAL *****");
        System.out.println("1.- Mostrar vehiculos disponibles");
        System.out.println("2.- Modificar vehiculo");
        System.out.println("3.- Salir");
        System.out.println("->");
        int des=Entrada.nextInt();
        
        
        switch(des){
            case 1:
                
                         flag2 = true;

            break;
                
            case 2:
                System.out.println("\n");
                System.out.println("INGRESA EL NUMERO DE VEHICULO A MOFIDICAR");
                int j=1;
                for(Auto temp:Almacen)
                    {
                        System.out.println(j+".- "+temp.getMarca());
                        j=j+1;
                    }
                System.out.println("->");
                int vehiculo=Entrada.nextInt();
                
                    switch(vehiculo)
                        {
                        case 1:
                            System.out.println(camioneta+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolor=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplaca=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int nperson=Entrada.nextInt();
                            camioneta.setColor(ncolor);
                            camioneta.setPlacas(nplaca);
                            camioneta.setPersonas(nperson);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                            
                         case 2:
                             System.out.println(coche+"\n");
                             System.out.println("Cual sera el nuevo color?");
                            String ncolorc=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacac=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonc=Entrada.nextInt();
                            coche.setColor(ncolorc);
                            coche.setPlacas(nplacac);
                            coche.setPersonas(npersonc);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                             
                        case 3:
                            System.out.println(camioneta2+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorca2=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacaca2=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonca2=Entrada.nextInt();
                            camioneta2.setColor(ncolorca2);
                            camioneta2.setPlacas(nplacaca2);
                            camioneta2.setPersonas(npersonca2);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                            
                        case 4:
                            System.out.println(coche2+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorco2=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacaco2=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersonco2=Entrada.nextInt();
                            coche2.setColor(ncolorco2);
                            coche2.setPlacas(nplacaco2);
                            coche2.setPersonas(npersonco2);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                            
                        case 5:
                            System.out.println(camion+"\n");
                            System.out.println("Cual sera el nuevo color?");
                            String ncolorcam=Entrada.next();
                            System.out.println("Cuale sera la nueva placa?");
                            String nplacacam=Entrada.next();
                            System.out.println("Cuntas personas hay arriba?");
                            int npersoncam=Entrada.nextInt();
                            camion.setColor(ncolorcam);
                            camion.setPlacas(nplacacam);
                            camion.setPersonas(npersoncam);
                            System.out.println("\n");
                            flag2 = true;
                        break;
                        }//end of switch
                    if(vehiculo>5 || vehiculo<1){
                         System.out.println("Vehiculo no existe\n");
                         flag2 = true;
                    }
            break;   
                
            case 3:
                    flag2 = false;
                    flag = false;
            break;
        }//end of switch
         if(des>4 || des<1){
                         System.out.println("OPCION INCORRECTA!");
                         flag2 = true;
                    }
                } catch (Exception ex) {
                    System.err.println("Valor no concuerda");
                    flag2 = true;
                }
            } while (flag2);
        
        
        
        
        
    }
 private void registrarVehiculo() {
     Consultas regis = new Consultas();
  Auto cochesito=new Auto();
   
  String mensajeIngreso="Ingresa\n\n";
   
  String datos[] = {"Color : ","Marca : ",
          "Placas: ","No Pasajeros: ","Precio: "};
  String datosVehiculo[] = new String[6];
  for (int i = 0; i < datos.length; i++) {
   //solicita el ingreso del dato y se almacena en el arreglo de datosPersona
   datosVehiculo[i]=JOptionPane.showInputDialog(null, mensajeIngreso+
      datos[i],"Datos Generales",JOptionPane.INFORMATION_MESSAGE);
    
   System.out.println(datos[i]+datosVehiculo[i]);
  }
   
  
  cochesito.setColor(datosVehiculo[1]);
  cochesito.setMarca(datosVehiculo[2]);
  cochesito.setPlacas(datosVehiculo[3]);
  cochesito.setPersonas(Integer.parseInt(datosVehiculo[4]));
  cochesito.setPrecio(Float.parseFloat(datosVehiculo[5]));
   
  regis.registrarCoche(cochesito);
   
 }
 
 /**
  * Permite obtener la lista de personas almacenada en la tabla persona
  * si la lista se encuentra vacia quiere decir que no hay personas registradas
  * acto seguido se presenta un mensaje en pantalla, sino se imprime la lista de 
  * todas las personas registradas en la BD
  */
 private void obtenerVehiculos() {
  Consultas regis = new Consultas();
  Auto cochesito=new Auto();
   
  //Se obtiene la lista de personas
  ArrayList< Auto> vehiculos = regis.ListaDeAutos();
  //se valida si se obtubo o no informacion
  if (vehiculos.size()>0) {
   int numero=0;
   //se recorre la lista de personas asignandose cada posicion en un objeto persona
   for (int i = 0; i < vehiculos.size(); i++) {
    numero++;
    cochesito=vehiculos.get(i);
  
    System.out.println("Color: "+cochesito.getColor());
    System.out.println("Estado: "+false);
    System.out.println("Marca: "+cochesito.getMarca());
    System.out.println("Placas Auto: "+cochesito.getPlacas());
    System.out.println("Numero Pasajeros: "+cochesito.getPersonas());
    System.out.println("Precio: "+cochesito.getPrecio());
    System.out.println("*************************************************\n");
   }
  }else{
   JOptionPane.showMessageDialog(null,"No hay vehiculos","INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);
  }
   
 }
    
    
}
