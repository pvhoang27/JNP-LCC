/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP.DATASTREAM;


import java.util.*;
/**
 *
 * @author hoang
 */
public class xucXac {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20) + 10;
        System.out.println(n);
        String tung = "";
        for(int i = 0 ;i < n; i++){
            int mat = rand.nextInt(6) + 1;
            tung += mat +" ";
        }
        System.out.println(tung);
        String [] mat = tung.trim().split(" ");
        int [] cnt = new int[256];
        for(String a : mat){
            int b = Integer.parseInt(a);
            cnt[b] ++;
        }
        String kq= "";
        for (int i = 1; i <= 6; i++) {
            float xs = (float) cnt[i] / n;
            
            kq += "P(" + i + ")=" + xs + ", ";
            
        }
//        for(String a : mat){
//            int b = Integer.parseInt(a);
//            if(cnt[b] > 0){
//                float xs = (float ) cnt[b] / n;
//                kq += "P(" + b + ")=" + xs + ", "; 
//                cnt[b] =0;
//            }
//        }
        System.out.println(kq);
        
    }
}
//Xử lý:
//
//Đếm số lần xuất hiện của các mặt từ 1 đến 6.
//
//Tính xác suất xuất hiện của từng mặt: P(i) = (Số lần xuất hiện mặt i) / n.
//
//Ví dụ:
//
//Nhận n = 21.
//
//Các giá trị nhận được: 1,6,4,4,4,3,2,6,3,4,5,4,5,2,4,5,4,6,1,5,5.
//
//Mặt 1 xuất hiện 2 lần -> P(1) = 2/21 ≈ 0.0952381.
//
//Mặt 4 xuất hiện 7 lần -> P(4) = 7/21 ≈ 0.33333334
