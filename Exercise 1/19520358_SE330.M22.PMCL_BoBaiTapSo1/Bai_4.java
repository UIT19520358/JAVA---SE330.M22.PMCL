import java.util.Scanner;
//Tính tổng dãy số S(n)+1+...+n
public class Bai_4{
    public static void main (String[] args){
        Scanner ip = new Scanner(System.in); // Khai báo ip thuộc lớp Scanner
        int n, sum=0; // Khai báo biến
        System.out.println("Nhap so phan tu: " + "\n");
        n = ip.nextInt(); // Nhập số nguyên
        ip.close(); // Đóng ip

        if (n<0) {
            System.out.println("So phan tu khong hop le! Vui long nhap lai: " + "\n");
        } // Kiểm tra điều kiện n nguyên không âm

        for (int i = 0; i<=n; i++){
            sum+=i;
        } // Tính tổng

        // In kết quả của sum
        System.out.println("Tong day so da cho la: " + sum + "\n");
    }
}