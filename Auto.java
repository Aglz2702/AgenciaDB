
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel Gonzalez
 */
public class Auto {
    
    private String color;
    private boolean status;
    private String marca;
    private String placas;
    private int personas;
    private float precio;
    
    
    public void encender(boolean a)
    {
        this.status=a;
    }
    
    public String getColor()
    {
        System.out.println("Color:"+color);
        return color;
    }
    
    public void setColor(String ncolor)
    {
        this.color=ncolor;
    }
    public boolean getPrender()
    {
        if(status)
        {
            System.out.println("Prendido");
        }
        else
        {
            System.out.println("Apagado");
        }
        return status;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String Marca)
    {
        this.marca=Marca;
    }
    public String getPlacas()
    {
        System.out.println("Numero de placa:"+placas);
        return placas;
    }
     public void setPlacas(String nplacas)
    {
        this.placas=nplacas;
    }
    public int getPersonas()
    {
        System.out.println("Hay:"+" "+personas+" "+"personas");
        return personas;
    }
     public void setPersonas(int npersonas)
    {
        this.personas=npersonas;
    }
public float getPrecio()
{
    return precio;
}

public void setPrecio(float precio)
{
    this.precio=precio;
}
}
