/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunil.DAO;

import com.mysql.jdbc.Connection;
import com.sunil.DB.DBConnection;
import com.sunil.DTO.Register;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class RegisterData {
     public boolean insert(Register ins)
     {
         int up=0;
         Connection con;
         try {
             con = DBConnection.getConnection();
             PreparedStatement psreg=con.prepareStatement("insert into register values(?,?,?)");
         PreparedStatement pslg=con.prepareStatement("insert into login values(?,?)");
        String nm1=ins.getName();
        String add1=ins.getAddress();
        String ph1=ins.getPhone();
        String unm1=ins.getUsernm();
        String psw1=ins.getPaaswd();
        psreg.setString(1, nm1);
        psreg.setString(2, add1);
        psreg.setString(3, ph1);
         pslg.setString(1, unm1);
         pslg.setString(2, psw1);
         psreg.executeUpdate();
         up=pslg.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(RegisterData.class.getName()).log(Level.SEVERE, null, ex);
         }
         if(up!=0)return true;
         else return false;
     }
}
