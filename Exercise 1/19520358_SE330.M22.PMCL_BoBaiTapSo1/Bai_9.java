import java.util.Scanner;

public class Bai_9 {
    public static void main (String[] args){
        Scanner ip = new Scanner(System.in); // Khai báo ip trong lớp Scanner
        // Khai báo biến
        String x, y;
        int length = 0;

        // Nhập dữ liệu
        x = ip.nextLine();
        y = ip.nextLine();

        ip.close(); // Đóng ip
    // Câu a: Tổng chiều dàu của chuỗi x và y
        length = x.length() + y.length(); // Tính tổng chiều dài chuỗi của x và y
        System.out.println("Tong chieu dai cua chuoi x va y la: " + length + "\n");
    // Câu b: 3 ký tự đầu tiên của x
        System.out.println("3 ky tu dau cua chuoi x la: " + x.substring(0, 3) + "\n");
    // Câu c: 3 ký tự cuối của chuỗi y
        System.out.println("3 ky tu cuoi cua chuoi y la: " + y.substring(y.length() - 2) + "\n");
    // Câu d: Ký tự thứ 6 của chuỗi x
        char c = x.charAt(7); // Lấy ký tự thứ 6 trong chuỗi
        System.out.println("Ky tu thu 6 cua chuoi x la: " + c);
    // Câu e: Tạo chuỗi mới gồm 3 kí tự đầu tiên của chuỗi x và 3 kí tự cuối của chuỗi y
        String s1 = x.substring(0, 3) + y.substring(y.length() - 2);
        System.out.println("Chuoi moi duoc tao ra la: " + s1 + "\n");
    // Câu f: Kiểm tra 2 chuỗi x, y có bằng nhau hay không?
        if (x.equals(y)){
            System.out.println("Hai chuoi bang nhau." + "\n");
        }
        else System.out.println("Hai chuoi khong bang nhau." + "\n");
    // Câu g: Kiểm tra 2 chuỗi x, y có bằng nhau hay không? (không phân biệt chữ hoa, thường)
        if (x.equalsIgnoreCase(y)){
            System.out.println("Hai chuoi bang nhau." + "\n");
        }
        else System.out.println("Hai chuoi khong bang nhau." + "\n");
    // Câu h: Cho biết y có xuất hiện trong x hay không? Nếu có, tại vị trí nào?
        int index = x.indexOf(y);
        if (index == -1){
            System.out.println("Y khong xuat hien trong x." + "\n");
        }
        else System.out.println("Y co xuat hien trong x va tai vi tri " + index + "\n");
    // Câu i: Cho biết tất cả các vị trí xuất hiện của y trong x?
        for (int i = 0; i < x.length(); i++){
            int index1 = x.indexOf(y);
            if (index1 == -1){
                System.out.println("Y khong xuat hien trong x." + "\n");
            }
            else System.out.println("Y co xuat hien trong x va tai vi tri " + index1 + "\n");
        }
    }
}
