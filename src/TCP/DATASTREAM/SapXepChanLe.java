/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP.DATASTREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hoang
 */
public class SapXepChanLe {
    public static void main(String[] args) {
        String strInput = "2,15,4,3,6,8,10,7,1";
        String[] parts = strInput.split(",");
        List<Integer> listChan = new ArrayList<>();
        List<Integer> listLe = new ArrayList<>();
        for(String s : parts){
            int a = Integer.parseInt(s.trim());
            if(a % 2 == 0){
                listChan.add(a);
            } else {
                listLe.add(a);
            }
        }
        Collections.sort(listChan); // 
        Collections.sort(listLe);
        String kq = listChan.toString() + ";" + listLe.toString();
        System.out.println(kq);
    }
}
