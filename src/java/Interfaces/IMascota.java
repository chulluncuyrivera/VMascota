/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public interface IMascota {
  public abstract boolean guardarMascota(Mascota mascota);  
  public abstract ArrayList<Mascota> listarMascotas(Session session);
  public abstract void actualizarMascota(Mascota mascota);
  public abstract ArrayList<Mascota> listarRaza(Session session);
 public abstract ArrayList<Mascota> listarNombre(Session session);
 public abstract Integer Cantidad(Session session);
  
   
}
