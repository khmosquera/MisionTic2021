/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * * @author lenovo
 */
public class DataModelDB {
    
    public ArrayList<DataDB>getOwners(int idOwner) {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList listOwner = new ArrayList();
        try {
            String sql = "SELECT id, owner FROM `tb_pet_owners` WHERE 1";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB 1");
                while (rs.next()) {
                    datosDB = new DataDB();
                    datosDB.setIdOwner(rs.getInt("id"));
                    datosDB.setOwner(rs.getString("owner"));
                    listOwner.add(datosDB);
                }
            }else {
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listOwner;

    }
    
    public ArrayList<DataDB>getBreed() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList listBreed = new ArrayList();
        try {
            String sql = "SELECT id, name FROM tb_breeds tb";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB 2");
                while (rs.next()) {
                    datosDB = new DataDB();
                    datosDB.setIdBreed(rs.getInt("id"));
                    datosDB.setBreedName(rs.getString("name"));
                    listBreed.add(datosDB);
                }
            }else {
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listBreed;

    }
    
    public ArrayList<DataDB>getHospital() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList listHospital = new ArrayList();
        try {
            String sql ="SELECT th.id id_hospital, th.name hospital_name FROM tb_hospital th";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB 5");
                while (rs.next()) {
                    datosDB = new DataDB();
                    datosDB.setidHospital(rs.getInt("id_hospital"));
                    datosDB.setHospitalName(rs.getString("hospital_name"));
                    listHospital.add(datosDB);
//                    System.out.println(datosDB.getHospitalName());
                }
            }else {
                System.out.println("Error 3");
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error 4");
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listHospital;

    }
    
    public LinkedList<ReportPetByGender>ListPetByGender() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        LinkedList<ReportPetByGender>report = new LinkedList<>();
        
        try {
            String sql = "SELECT tp.gender pet_gender, COUNT(gender) FROM tb_pet tp GROUP BY gender ";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB 3");
                while (rs.next()) {
                    ReportPetByGender record = new ReportPetByGender();
                    String pet_gender = rs.getString(1);
                    int amont_pet_gender = rs.getInt(2);
                    record.setPet_gender(pet_gender);
                    record.setAmount_pet_gender(amont_pet_gender);
                    report.add(record);
                }
            }else {
                System.out.println("Error 1");
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error 2");
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    
    return report;
    
    }
    
        public LinkedList<ReportPetByBreed>ListPetByBreed() {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        LinkedList<ReportPetByBreed>report = new LinkedList<>();
        
        try {
            String sql = "SELECT tb.pet_type, COUNT(tb.pet_type) FROM tb_pet tp INNER JOIN tb_pet_owners tpo ON tp.id_pet_owner = tpo.id INNER JOIN tb_breeds tb ON tp.id_pet_breed = tb.id GROUP BY tb.pet_type";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB 4");
                while (rs.next()) {
                    ReportPetByBreed record = new ReportPetByBreed();
                    String pet_breed = rs.getString(1);
                    int amont_pet_breed = rs.getInt(2);
                    record.setPet_breed(pet_breed);
                    record.setAmount_pet_breed(amont_pet_breed);
                    report.add(record);
                }
            }else {
                System.out.println("Error 1");
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error 2");
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    
    return report;
    
    }

    
}
