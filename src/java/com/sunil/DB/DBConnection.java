/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunil.DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class DBConnection implements DBProperties {
    static Connection con1;
    
    public static Connection getConnection() throws SQLException
    {
        try {
            Class.forName(Driver);
            con1=(Connection) DriverManager.getConnection(URL,unm,pwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con1;
    }
}
