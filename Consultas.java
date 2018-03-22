/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel Gonzalez
 */
public class Consultas {

 /**
  * Permite registrar un empleado
  * @param persona
  */
 public void registrarCoche(Auto auto) 
 {
  DbConnection conex= new DbConnection();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO persona VALUES ('"+auto.getColor()+"', '"
     +false+"', '"+auto.getMarca()+"', '"
     +auto.getPlacas()+"', '"+auto.getPersonas()+"', '"+auto.getPrecio()+"')");
   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   estatuto.close();
   conex.desconectar();
    
  } catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro la persona");
  }
 }
    
/**
 * permite consultar la lista de empleados
 * @return
 */
public ArrayList< Auto> ListaDeAutos() {
  ArrayList< Auto> lista = new ArrayList< Auto>();
  DbConnection conex= new DbConnection();
     
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM autos");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    Auto coches= new Auto();
    coches.setColor(res.getString("ColorAuto"));
    coches.setMarca(res.getString("MarcaAuto"));
    coches.setPlacas(res.getString("PlacasAuto"));
    coches.setPersonas(Integer.parseInt(res.getString("NoPasajerosAuto")));
    coches.setPrecio(Float.parseFloat(res.getString("PrecioAuto")));
    lista.add(coches);
          }
          res.close();
          consulta.close();
          conex.desconectar();
    
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
  }
  return lista;
 }
 
}
    

