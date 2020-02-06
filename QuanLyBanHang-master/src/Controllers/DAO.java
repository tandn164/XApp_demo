/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Staff;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author nguyenductan
 */
public class DAO {

    public Connection conn;
    private static String DB_URL = "jdbc:mysql://localhost:3306/QuanLiBanHang";
    private static String USER_NAME = "boss";
    private static String PASSWORD = "";

    public DAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
        }
    }

    public boolean addStaff(Staff s) {
        String sql = "INSERT INTO Staff VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId_Staff());
            ps.setString(2, s.getName());
            ps.setString(3, s.getAddr());
            ps.setDate(4, new Date(s.getDate().getTime()));
            ps.setString(5, s.getSex());
            ps.setString(6, s.getIdent());
            ps.setString(7, s.getPassword());
            ps.setDouble(8, s.getTotalTimeOfMonth());
            ps.setDouble(9, s.getSalary());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean removeStaff(String s) {
        String sql = "DELETE FROM Staff WHERE Staff_ID=" + s;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public boolean updateStaff(Staff s) {
        String sql = "UPDATE Staff SET Staff_Name=?,Staff_Addr=?,Staff_DoB=?,Staff_Sex=?,Staff_Ident=?,Staff_Salary=? WHERE Staff_ID=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getAddr());
            ps.setDate(3, new Date(s.getDate().getTime()));
            ps.setString(4, s.getSex());
            ps.setString(5, s.getIdent());
            ps.setDouble(6, s.getSalary());
            ps.setString(7, s.getId_Staff());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }

    public ArrayList<Staff> getSortedList2(int columnindex) {
        ArrayList<Staff> list = new ArrayList<>();
        String cl;
        String sql = "SELECT * FROM Staff ORDER BY ";
        switch (columnindex) {
            case 1:
                cl = "Staff_ID";
                break;
            case 2:
                cl = "Staff_Name";
                break;
            case 3:
                cl = "Staff_Ident";
                break;
            case 4:
                cl = "Staff_totalTimeOfMonth";
                break;
            case 5:
                cl = "Staff_salary";
                break;
            default:
                cl = "";
                break;
        }
        sql = sql + cl + " DESC";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Staff s = new Staff();
                s.setAddr(rs.getString("Staff_Addr"));
                s.setDate(rs.getDate("Staff_DoB"));
                s.setId_Staff(rs.getString("Staff_ID"));
                s.setIdent(rs.getString("Staff_Ident"));
                s.setName(rs.getString("Staff_Name"));
                s.setPassword(rs.getString("Staff_Password"));
                s.setSex(rs.getString("Staff_Sex"));
                s.setSalary(rs.getDouble("Staff_salary"));
                s.setTotalTimeOfMonth(rs.getDouble("Staff_totalTimeOfMonth"));
                list.add(s);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<Staff> getSortedList1(int columnindex) {
        ArrayList<Staff> list = new ArrayList<>();
        String cl;
        String sql = "SELECT * FROM Staff ORDER BY ";
        switch (columnindex) {
            case 1:
                cl = "Staff_ID";
                break;
            case 2:
                cl = "Staff_Name";
                break;
            case 3:
                cl = "Staff_Ident";
                break;
            case 4:
                cl = "Staff_totalTimeOfMonth";
                break;
            case 5:
                cl = "Staff_salary";
                break;
            default:
                cl = "";
                break;
        }
        sql = sql + cl + " ASC";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Staff s = new Staff();
                s.setAddr(rs.getString("Staff_Addr"));
                s.setDate(rs.getDate("Staff_DoB"));
                s.setId_Staff(rs.getString("Staff_ID"));
                s.setIdent(rs.getString("Staff_Ident"));
                s.setName(rs.getString("Staff_Name"));
                s.setPassword(rs.getString("Staff_Password"));
                s.setSex(rs.getString("Staff_Sex"));
                s.setSalary(rs.getDouble("Staff_salary"));
                s.setTotalTimeOfMonth(rs.getDouble("Staff_totalTimeOfMonth"));
                list.add(s);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<Staff> getStaffList() {
        ArrayList<Staff> list = new ArrayList<>();
        String sql = "SELECT * FROM Staff";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Staff s = new Staff();
                s.setAddr(rs.getString("Staff_Addr"));
                s.setDate(rs.getDate("Staff_DoB"));
                s.setId_Staff(rs.getString("Staff_ID"));
                s.setIdent(rs.getString("Staff_Ident"));
                s.setName(rs.getString("Staff_Name"));
                s.setPassword(rs.getString("Staff_Password"));
                s.setSex(rs.getString("Staff_Sex"));
                s.setSalary(rs.getDouble("Staff_salary"));
                s.setTotalTimeOfMonth(rs.getDouble("Staff_totalTimeOfMonth"));
                list.add(s);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String args[]) {
        new DAO();
    }
}
