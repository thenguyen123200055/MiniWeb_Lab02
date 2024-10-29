/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Loai;


public class LoaiDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<Loai> getAll() {
        ArrayList<Loai> ds = new ArrayList<>();
        String sql = "select * from Loai";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ds.add(new Loai(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return ds;
    }
    
    public static void main(String[] args) {
        LoaiDAO loaiDAO = new LoaiDAO();
        
        ArrayList<Loai> dsLoai = loaiDAO.getAll();  
        for(Loai l : dsLoai){
            System.out.println(l);
        }
    }
}
