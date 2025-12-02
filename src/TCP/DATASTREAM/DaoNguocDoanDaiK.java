
package TCP.DATASTREAM;
import java.util.*;
public class DaoNguocDoanDaiK {
    public static void main(String[] args) {
        int k = 3;
        String strInput = "1,2,3,4,5,6,7,8";
        String[] parts = strInput.split(",");
        List<Integer> list = new ArrayList<>();
        for (String s : parts) {
            list.add(Integer.parseInt(s.trim()));
        }
        int n = list.size();
        for (int i = 0; i < n; i += k) {
            // Xác định điểm đầu và điểm cuối của đoạn
            // Math.min để xử lý trường hợp đoạn cuối cùng có độ dài < k
            int end = Math.min(i + k, n);
            
            // Lấy đoạn con (subList view) và đảo ngược nó
            List<Integer> subList = list.subList(i, end);
            Collections.reverse(subList);
        }
        System.out.println(list);
        String kq = "\"";
        for(int x : list){
            kq += x +",";
        }
        kq = kq.substring(0,kq.length()-1) + "\"";
        System.out.println(kq);
        
    }
}
//BÀI 2. ĐẢO NGƯỢC ĐOẠN DÀI K
//
//Mã câu hỏi (qCode): dCNDHojG 
//
//
//Giao thức: TCP tại cổng 2207 
//
//
//Loại luồng: Data Stream (DataInputStream / DataOutputStream) 
//
//Yêu cầu thực hiện:
//
//Gửi yêu cầu:
//
//Gửi mã sinh viên và mã câu hỏi theo định dạng "studentCode;qCode".
//
//Ví dụ: "B10DCCN003;C6D7E8F9" 
//
//Nhận dữ liệu:
//
//Nhận lần lượt:
//
//Một số nguyên k (độ dài đoạn).
//
//Một chuỗi chứa mảng số nguyên, các phần tử phân tách bởi dấu phẩy ",".
//
//Ví dụ: Nhận k = 3 và chuỗi "1,2,3,4,5,6,7,8".
//
//Xử lý:
//
//Chia mảng thành các đoạn có độ dài k.
//
//Đảo ngược thứ tự các phần tử trong mỗi đoạn đó. (Lưu ý: Đoạn cuối cùng nếu không đủ k phần tử cũng vẫn đảo ngược).
//
//Gửi chuỗi kết quả đã xử lý lên server.
//
//Ví dụ:
//
//Input: k=3, mảng 1,2,3,4,5,6,7,8.
//
//Chia đoạn: [1,2,3], [4,5,6], [7,8] (đoạn cuối chỉ còn 2 phần tử).
//
//Đảo ngược từng đoạn: [3,2,1], [6,5,4], [8,7].
//
//Kết quả gửi đi: "3,2,1,6,5,4,8,7".
//
//Kết thúc:
//
//Đóng kết nối và kết thúc chương trình.
