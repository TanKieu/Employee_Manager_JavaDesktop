/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeManagementDAO;

import employeeManagementDTO.EmployeeManagementDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

/**
 *
 * @author winnh
 */
public class EmployeeManagementDAO implements Serializable{
    static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url="jdbc:sqlserver://SE141107\\SQLEXPRESSION:1433; databaseName=EmployeeManagement;user=sa;password=123";
    public static Connection openConnection()throws Exception{
        Class.forName(driver);
        return (Connection) DriverManager.getConnection(url);
    }
    public static ArrayList<EmployeeManagementDTO> getAllEmp()throws Exception{
        ArrayList<EmployeeManagementDTO> list=new ArrayList<>();
        try (Connection c= openConnection(); Statement sm=c.createStatement();){
            ResultSet rs= sm.executeQuery("Select EmpID, Fullname,Phone,Email,Address,DateOfBirth, isDelete from Emp");
            while(rs.next()){
                String code=rs.getString("EmpID");
                String fullname= rs.getString("Fullname");
                String phone=rs.getString("Phone");
                String email=rs.getString("Email");
                String add= rs.getString("Address");
                Date DOB= Date.valueOf(rs.getString("DateOfBirth"));
                boolean isDel=rs.getBoolean("isDelete");
                EmployeeManagementDTO emp=new EmployeeManagementDTO(code, fullname, phone, email,add , DOB, isDel);
                list.add(emp);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static int insert(EmployeeManagementDTO emp)throws Exception{
        String sql="Insert into Emp values(?,?,?,?,?,?,?)";
        try(Connection c= openConnection(); PreparedStatement ps= c.prepareStatement(sql)){
            ps.setString(1, emp.getEmpID());
            ps.setString(2, emp.getFullname());
            ps.setString(3, emp.getPhone());
            ps.setString(4, emp.getEmail());
            ps.setString(5, emp.getAddress());
            ps.setDate(6, emp.getDateOfBirth());
            ps.setString(7, String.valueOf(emp.isIsDelete()));
            return ps.executeUpdate();
        }
    }
    public static int update(EmployeeManagementDTO emp)throws Exception{
        String sql="Update Emp set Fullname=?, Phone=?, Email=?, Address=?, DateOfBirth=? "
                +"Where EmpID=?";
        try(Connection c= openConnection(); PreparedStatement ps= c.prepareStatement(sql)){
            ps.setString(1, emp.getFullname());
            ps.setString(2, emp.getPhone());
            ps.setString(3, emp.getEmail());
            ps.setString(4, emp.getAddress());
            ps.setDate(5, emp.getDateOfBirth());
            ps.setString(6, emp.getEmpID());
            return ps.executeUpdate();
        }
    }
    public static int remove(String Id)throws Exception{
        String sql="Delete From Emp where EmpID=?";
        try(Connection c= openConnection(); PreparedStatement ps= c.prepareStatement(sql)){
            ps.setString(1, Id);
            return ps.executeUpdate();
        }
    }
    public static EmployeeManagementDTO findByID(String id)throws Exception{
        ArrayList<EmployeeManagementDTO> list= getAllEmp();
        for(EmployeeManagementDTO emp: list){
            if(id.equals(emp.getEmpID().trim()))
                return emp;
        }
        return null;
    }
}
