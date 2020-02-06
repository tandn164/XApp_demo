/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;



/**
 *
 * @author admin
 */
public class Staff {
    String id_Staff, Name, Addr, Ident ,Password,Sex;
    double totalTimeOfMonth, Salary;
    Date DoB;
    public Staff(){
    };
    public Staff(String id_Staff,String Name, String Addr,Date DoB, String Sex, String Ident,String Password , double totalTimeOfMonth, double Salary) {
        this.id_Staff = id_Staff;
        this.Name = Name;
        this.Addr = Addr;
        this.Ident  = Ident;
        this.totalTimeOfMonth = totalTimeOfMonth;
        this.Salary = Salary;
        this.DoB=DoB;
        this.Password=Password;
    }
    public Date getDate()
    {
        return DoB;
    }
    public void setDate(Date DoB)
    {
        this.DoB=DoB;
    }
    public String getSex()
    {
        return Sex;
    }
    public void setSex(String Sex)
    {
        this.Sex=Sex;
    }
    public String getPassword()
    {
        return Password;
    }
    public void setPassword(String password)
    {
        this.Password=password;
    }
    
    public String getId_Staff() {
        return id_Staff;
    }

    public void setId_Staff(String id_Staff) {
        this.id_Staff = id_Staff;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        this.Addr = addr;
    }

    public String getIdent() {
        return Ident;
    }

    public void setIdent(String Ident) {
        this.Ident = Ident;
    }

    public double getTotalTimeOfMonth() {
        return totalTimeOfMonth;
    }

    public void setTotalTimeOfMonth(double totalTimeOfMonth) {
        this.totalTimeOfMonth = totalTimeOfMonth;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }
}
