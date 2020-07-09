/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunil.DAO;

import com.sunil.DB.DBConnection;
import com.sunil.DTO.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hp
 */
public class LoginData {
    

    public boolean giveAccess(Login ins) throws SQLException {
        Connection con1=DBConnection.getConnection();
        Statement st=con1.createStatement();
        ResultSet rs=st.executeQuery("select * from login where usernm='"+ins.getUsernm()+"'");
        if(rs.next())
        {
            if(ins.getUsernm().equals(rs.getString(1))&& ins.getPasswd().equals(rs.getString(2)))
                return true;
            
        }
        
     return false;
    }
    
}
