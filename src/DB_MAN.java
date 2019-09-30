/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author YeJi
 */
public class DB_MAN {
    String strDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String strURL = "jdbc:odbc:MACAMACA64";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException{
        try{
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL);
            DB_stmt = DB_con.createStatement();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException{
        try{
            DB_stmt.close();
            DB_con.close();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
        
    }
}
