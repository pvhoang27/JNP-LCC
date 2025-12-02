//Xử lý:
//
//Tìm giá trị lớn thứ hai trong chuỗi.
//
//Tìm vị trí xuất hiện (index) của nó trong chuỗi ban đầu.
//
//Gửi lên server chuỗi gồm: "giá trị lớn thứ hai, vị trí".
//
//Ví dụ: Trong dãy 1,3,9,19,33,20:
//
//Số lớn nhất là 33.
//
//Số lớn thứ hai là 20.
//
//Vị trí của 20 trong mảng gốc là 5 (tính từ 0: 1[0], 3[1], 9[2], 19[3], 33[4], 20[5]).
//
//Kết quả gửi đi: "20,5".
package TCP.DATASTREAM;

/**
 *
 * @author hoang
 */
public class soLonThu2 {
    public static void main(String[] args) {
        String a = "1,28,9,19,33,20";
        String[] parts = a.split(",");
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int idxSe = -1;
                
        for(int i = 0 ; i < parts.length; i++){
            int c = Integer.parseInt(parts[i]);
            if(c > max ) {
                max = c;  
            } 
        }
        System.out.println(max);
        for(int i = 0 ; i < parts.length; i++){
            int c = Integer.parseInt(parts[i]);
            if(c > secondMax && c < max ) {
                secondMax = c;  
                idxSe = i;
            } 
        }
        System.out.println(secondMax + " " + idxSe);
        
    }
}
