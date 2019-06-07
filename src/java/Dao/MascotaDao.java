/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.IMascota;
import Prueba.HibernateUtil;
import entidades.Mascota;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author USUARIO
 */
public class MascotaDao implements IMascota {

    @Override
    public boolean guardarMascota(Mascota mascota) {
        boolean respuesta=true;
        //construir una nueva session y una nueva transaccion
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        //registrar en la base de dabtos la mascota
        try {
            session.save(mascota);
            transaction.commit();
        } catch (Exception e) {
        }

        session.close();
        return respuesta;
    }

    @Override
    public ArrayList<Mascota> listarMascotas(Session session) {
        ArrayList<Mascota> milista = new ArrayList<>();
        Query query = session.createQuery("FROM Mascota");

        milista = (ArrayList<Mascota>) query.list();

        return milista;
    }

    @Override
    public void actualizarMascota(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.update(mascota);

    }

    @Override
    public ArrayList<Mascota> listarRaza(Session session) {
        String hql = " from Mascota where raza='Pastor Aleman'";
        Query query = session.createQuery(hql);
        List< Mascota> lista = (List< Mascota>) query.list();
        return (ArrayList<Mascota>) lista;
    }

    @Override
    public ArrayList<Mascota> listarNombre(Session session) {
        String hql = " from Mascota where nombreMascota='Sandor'";
        Query query = session.createQuery(hql);
        List< Mascota> lista = (List< Mascota>) query.list();
        return (ArrayList<Mascota>) lista;
    }

    @Override
    public Integer Cantidad(Session session) {
        String hql = "select count(*) from Mascota";
        Query query = session.createQuery(hql);
        Long FilasTab = (Long) query.uniqueResult();
        Integer cont = FilasTab.intValue();
        return cont;
    }

}
