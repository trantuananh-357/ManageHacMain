/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.Dao;
import view.Login1;
import view.TrangChu;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class Home extends Dao{
    public static void main(String[] args) {
        Login1 lg = new Login1();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        new Dao();
    }
}
