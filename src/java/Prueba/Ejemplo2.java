/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session session = HibernateUtil.getSessionFactory().openSession();
        lista = mascotadao.listarMascotas(session);

        for (Mascota mascota : lista) {
        //JOptionPane.showMessageDialog(null, mascota.getNombreMascota());
            System.out.println(mascota.getNombreMascota());
        }

    }

}
