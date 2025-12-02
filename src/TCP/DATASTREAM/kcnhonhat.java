/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP.DATASTREAM;

import java.util.*;
public class kcnhonhat {
    public static void main(String[] args) {
        String a = "1,3,9,19,33,20";
        String [] num = a.split(",");
        List<Integer> list = new ArrayList<>();
        for (String s : num) {
            list.add(Integer.parseInt(s.trim()));
        }
        Collections.sort(list);
        int minDis =Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            // Tính khoảng cách giữa 2 số liền kề
            int h = Math.abs(list.get(i+1) - list.get(i));
            
            
            if (h <= minDis) {
                minDis = h;
                num1 = list.get(i);
                num2 = list.get(i+1);
            }
        }
        String result = minDis + "," + num1 + "," + num2;
        System.out.println(result);
        
    }
}
