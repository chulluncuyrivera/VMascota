/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MascotaBean {

    
    private Mascota mascota;

    public MascotaBean() {
    this.mascota=new Mascota();
    }

    public void guardarMascota() {
        
        try {
            MascotaDao mascotadao = new MascotaDao();
            mascotadao.guardarMascota(mascota);
        } catch (Exception e) {
            System.out.println("error"+e);  
        }

    }

    public boolean actualizarMascota(Mascota mascota) {
        
        boolean respuesta = true;
        try {
            MascotaDao mascotadao = new MascotaDao();
            mascotadao.actualizarMascota(mascota);
        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }

   /* public ArrayList<Mascota> listarMascotas() {
        
        boolean respuesta = true;
        try {
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        
        }catch(Exception e){
            respuesta=false;
        }
    
    }
*/
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
    
       

