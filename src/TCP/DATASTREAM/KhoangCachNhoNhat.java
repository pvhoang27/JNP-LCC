/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP.DATASTREAM;

import java.util.*;
public class KhoangCachNhoNhat {
    public static void main(String[] args) {
        // Giả lập dữ liệu nhận được từ Server theo ví dụ đề bài
        String inputFromServer = "1,3,9,19,33,20"; 
        
        // Gọi hàm xử lý
        String result = solve(inputFromServer);
        
        // In kết quả (để kiểm tra)
        System.out.println("Input: " + inputFromServer);
        System.out.println("Output gửi lên server: " + result);
    }

    public static String solve(String strInput) {
        // 1. Chuyển chuỗi thành List số nguyên
        String[] parts = strInput.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            numbers.add(Integer.parseInt(part.trim()));
        }

        // 2. Sắp xếp tăng dần để dễ dàng tính khoảng cách giữa các số gần nhau
        Collections.sort(numbers);

        // 3. Tìm khoảng cách nhỏ nhất và cặp số tương ứng
        int minDistance = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;

        // Duyệt qua danh sách để so sánh các cặp liền kề
        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = Math.abs(numbers.get(i + 1) - numbers.get(i));

            // Nếu tìm thấy khoảng cách nhỏ hơn, cập nhật lại
            // Hoặc nếu khoảng cách BẰNG nhau, cũng cập nhật để lấy cặp số LỚN HƠN (do list đã sort tăng dần)
            if (diff <= minDistance) {
                minDistance = diff;
                num1 = numbers.get(i);
                num2 = numbers.get(i + 1);
            }
        }

        // 4. Tạo chuỗi kết quả theo định dạng đề bài: "khoảng cách,số nhỏ,số lớn"
        // Ví dụ đề bài: input "1,3,9,19,33,20" -> output "1,19,20"
        return minDistance + "," + num1 + "," + num2;
    }
}
//BÀI 1. KHOẢNG CÁCH NHỎ NHẤT
//
//Mã câu hỏi (qCode): TbzkNfL3 
//
//Giao thức: TCP
//
//
//Cổng (Port): 2206 
//
//
//Loại luồng: Byte stream (InputStream / OutputStream) 
//
//Yêu cầu thực hiện:
//
//Gửi yêu cầu:
//
//Gửi mã sinh viên và mã câu hỏi theo định dạng: "studentCode;qCode".
//
//Ví dụ: "B16DCCN999;FF49DC02".
//
//Nhận dữ liệu:
//
//Nhận dữ liệu từ server là một chuỗi các giá trị số nguyên được phân tách nhau bởi ký tự ",".
//
//Ví dụ: 1,3,9,19,33,20.
//
//Xử lý:
//
//Thực hiện tìm giá trị khoảng cách nhỏ nhất của các phần tử nằm trong chuỗi và hai giá trị lớn nhất tạo nên khoảng cách đó (Lưu ý: Theo ví dụ đề bài thì là tìm 2 số tạo ra khoảng cách đó, logic thông thường là tìm cặp số có hiệu trị tuyệt đối nhỏ nhất).
//
//Gửi lên server chuỗi gồm: "khoảng cách nhỏ nhất, số thứ nhất, số thứ hai".
//
//Ví dụ: Với chuỗi nhận được ở trên (1,3,9,19,33,20), khoảng cách nhỏ nhất là 1 (giữa 19 và 20). Kết quả gửi lên: "1,19,20".
//
//Kết thúc:
//
//Đóng kết nối và kết thúc chương trình.