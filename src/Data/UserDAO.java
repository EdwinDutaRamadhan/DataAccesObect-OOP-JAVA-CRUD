/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Data;

import Connection.UserConnection;
import Interface.UserInterface;
import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class UserDAO implements UserInterface{
    UserModel mhs;
    
    private Connection koneksi = null;
    public UserDAO() {
        this.koneksi = UserConnection.getConnection();
    }

        
    
    @Override
    public List<UserModel> getAllMahasiswa() {
        List<UserModel> ls = new ArrayList<>();
        
        try {
            PreparedStatement ps = koneksi.prepareStatement("SELECT * FROM tbl_kst");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                mhs = new UserModel();
                mhs.setKode(rs.getString(2));
                mhs.setMatkul(rs.getString(3));
                mhs.setSksp(rs.getString(4));
                mhs.setSkstm(rs.getString(5));
                ls.add(mhs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ls;
    }

    @Override
    public boolean simpanDataMahasiswa(UserModel mhs) {
        boolean valid = false;
            
        try {
            PreparedStatement ps = koneksi.prepareStatement("INSERT INTO tbl_kst VALUES(?,?,?,?,?)");
            ps.setString(1, null);
            ps.setString(2, mhs.getKode());
            ps.setString(3, mhs.getMatkul());
            ps.setString(4, mhs.getSksp());
            ps.setString(5, mhs.getSkstm());
            ps.executeUpdate();
            valid = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return valid;
    }

    @Override
    public boolean deleteDataMahasiswa(UserModel mhs) {
        boolean valid = false;
        
        try {
            PreparedStatement ps = koneksi.prepareStatement("DELETE FROM tbl_kst WHERE kode=?");
            ps.setString(1, mhs.getKode());
            ps.executeUpdate();
            valid = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return valid;
    }

    @Override
    public boolean updateDataMahasiswa(UserModel mhs) {
        boolean valid = false;
        
        try {
            PreparedStatement ps = koneksi.prepareStatement("UPDATE tbl_kst SET matkul=?, sksp=?, skstm=? WHERE kode=?");
            ps.setString(4, mhs.getKode());
            ps.setString(1, mhs.getMatkul());
            ps.setString(2, mhs.getSksp());
            ps.setString(3, mhs.getSkstm());
            ps.executeUpdate();
            valid = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return valid;
    }
    
}
