///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import Model.HoatDong;
//import Model.Quy;
//import Model.ThanhVien;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutput;
//import java.io.ObjectOutputStream;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
// * @author Administrator
// */
//public class ControllerImp implements Controller {
//    
//    public <T> void writeToFile(List<T> list, String fileName) {
//        File file = new File(fileName);
//        try {
//            file.createNewFile();
//            FileOutputStream fos = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(list);
//            oos.close();
//            fos.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    @Override
//    public <T> List<T> readDataFromFile(String fileName) {
//        List<T> list = new ArrayList<>();
//        File file = new File(fileName);
//        if (file.length() > 0) {
//            try {
//                file.createNewFile();
//                FileInputStream fos = new FileInputStream(file);
//                ObjectInputStream oos = new ObjectInputStream(fos);
//                Object o = oos.readObject();
//                list = (List<T>) o;
//                oos.close();
//                fos.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            } catch (ClassNotFoundException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return list;
//    }
//}
