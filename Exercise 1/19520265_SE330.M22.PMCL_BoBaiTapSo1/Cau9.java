import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
123aaa3aaa123aaa123aaa123123aaa
123aaa
*/

public class Cau9 {
    public static void main(String[] args) throws Exception {
        String x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap chuoi x: ");
        x = br.readLine();
        System.out.print("Nhap chuoi y: ");
        y = br.readLine();
        Cau_A(x,y);
        Cau_B(x,y);
        Cau_C(x,y);
        Cau_D(x,y);
        Cau_E(x,y);
        Cau_F(x,y);
        Cau_G(x,y);
        Cau_H(x,y);
        Cau_I(x,y);
    }

    // Tong do dai 2 xau x va y.
    public static void Cau_A(String x, String y){
        System.out.println("Cau a: ");
        System.out.println("Tong do dai x + y: " + Integer.toString(x.length() + y.length()));
    }

    // 3 ky tu dau tien cua x
    public static void Cau_B(String x, String y){
        System.out.println("Cau b: ");
        System.out.print("3 ky tu dau tien cua x: ");
        System.out.print(x.substring(0,3));
        System.out.println("");
    }

    // 3 ky tu dau tien cua x
    public static void Cau_C(String x, String y){
        System.out.println("Cau c: ");
        System.out.print("3 ky tu dau tien cua y: ");
        for(int i = 0; i<=2; i++){
            System.out.print(y.charAt(i));
        }
        System.out.println("");
    }

    // Ky tu thu 6 cua x
    public static void Cau_D(String x, String y){
        System.out.println("Cau d: ");
        System.out.print("Ky tu thu 6 cua x: " + x.charAt(5));
        System.out.println("");
    }

    // Tao chuoi moi co 3 ky tu dau cua x va 3 ky tu cuoi cua y
    public static String Cau_E(String x, String y){
        System.out.println("Cau e: ");
        String z = x.substring(0,3) + y.substring(y.length()-3, y.length());
        System.out.println("Chuoi moi, 3 ky tu dau cua x va 3 ky tu cuoi cua y: " + z);
        return z;
    }

    // Kiem tra 2 chuoi x,y co bang nhau khong, khong phan biet hoa tuong.
    public static void Cau_F(String x, String y){
        System.out.println("Cau f: ");
        boolean equal = x.equals(y);
        if (equal) 
            System.out.print("Xau x, y bang nhau");
        else 
            System.out.print("Xau x, y khac nhau");
        System.out.println("");    
    }

    // Kiem tra 2 chuoi x,y co bang nhau khong, phan biet hoa thuong.
    public static void Cau_G(String x, String y){
        System.out.println("Cau g: ");
        boolean equal = x.equalsIgnoreCase(y);
        if (equal) 
            System.out.print("Xau x, y bang nhau");
        else 
            System.out.print("Xau x, y khac nhau");
        System.out.println("");   
    }

    // Kiem tra y co xuat hien trong x khong, xuat vi tri.
    public static void Cau_H(String x, String y){
        System.out.println("Cau h: ");
        int index = x.indexOf(y);
        boolean equal = index != -1;
        if (!equal) 
            System.out.print("Chuoi y khong xuat hien trong x");
        else 
            System.out.print("Chuoi y xuat hien trong x tai vi tri: " + Integer.toString(index));
        System.out.println(""); 
    }

    // Kiem tra y co xuat hien trong x khong, xuat tat ca vi tri.
    public static void Cau_I(String x, String y){
        System.out.println("Cau i: ");
        int[] idA = new int[100]; // Mang luu vi tri xuat hien.
        int index = -1, cnt = 0;  // index: vi tri xuat hien. cnt: so luong vi tri xuat hien.
        do {
            index = x.indexOf(y, index + 1); 
            if(index != -1) {
                idA[cnt++] = index;     // Luu vi tri tim duoc vao mang.
                index += y.length()-1;  // Vi tri moi, tranh trung lap.
                if(index > x.length() - 1) break;
            }
            else break;
        }while(true);
        if(cnt != 0){
            System.out.print("Chuoi y xuat hien trong x, tai cac vi tri: ");
            for(int i = 0; i <= cnt - 1; i++)
                System.out.print(Integer.toString(idA[i]) + " ");
        }else
            System.out.print("Chuoi y khong xuat hien trong x");
    }
}
