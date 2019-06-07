/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cont;
      MascotaDao mascotadao= new MascotaDao();
      Session session=HibernateUtil.getSessionFactory().openSession();
      cont=mascotadao.Cantidad(session);
        System.out.println("cantida de registro :"+cont);
              
    }
    
}
