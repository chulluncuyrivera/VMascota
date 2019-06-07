/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        MascotaDao mascotadao = new MascotaDao();
        Mascota mimascota = new Mascota(2, "fideito", "Merlin", "Pastor Aleman");
        mascotadao.actualizarMascota(mimascota);
        session.beginTransaction();
        session.saveOrUpdate(mimascota);
        session.getTransaction().commit();
        session.close();

    }

}
