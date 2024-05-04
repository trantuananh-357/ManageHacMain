/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.CoSoVC;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class sortByCountInCSVC implements Comparator<CoSoVC>{
    
    public int compare(CoSoVC o1, CoSoVC o2){
        if(o1.getSoLuong() > o2.getSoLuong()){
            return 1;
        }
        else if(o1.getSoLuong() ==  o2.getSoLuong()){
            return 0;
        }
        else return -1;
    }
}
