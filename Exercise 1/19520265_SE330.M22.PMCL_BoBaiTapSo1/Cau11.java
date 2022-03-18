import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cau11 {
    public static int[] A, B, C;
    public static int n, m, k;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nhap so phan tu n = ");
        n = Integer.parseInt(br.readLine());
        A = new int[n];
        System.out.print("Nhap mang A: "); 
        String[] input = br.readLine().split(" ");     // Split chuoi doc duoc ra nhieu string ngan cach boi dau " "
        for(int i = 0; i < n; i++)
            A[i] = Integer.parseInt(input[i]);   

        System.out.print("Nhap so phan tu m = ");
        m = Integer.parseInt(br.readLine());
        B = new int [m];
        Cau_A();
        Cau_B();
        Cau_C();
        Cau_D();
        Cau_E();
        Cau_F();
    }

    // Cau a, Tao mang b voi cac gia tri ngau nhien.
    public static void Cau_A (){
        System.out.println("Cau A: Da tao mang B");
        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        for(int i = 0; i < m; i++) {
            int rand = (int)(Math.random() * range) + min;   // random 1 so ngau nhien co gia tri tu min -> max
            B[i] = rand;
        }
    }

    // Cau b, xuat toan bo phan tu b ra man hinh
    public static void Cau_B (){
        System.out.println("Cau B: Xuat mang B");
        System.out.println("B= " + Arrays.toString(B));
    }

    // Cau c, copy mang A thanh mang C.
    public static void Cau_C(){
        System.out.println("Cau C: Tao mang C tu mang A");
        C = Arrays.copyOf(A, A.length);
        System.out.println("C= " + Arrays.toString(C));
    }

    // Cau d, thay the 3 phan tu dau cua C thanh 3 phan tu cuoi cua mang B.
    public static void Cau_D(){
        System.out.println("Cau D: thay the 3 phan tu dau cua C thanh 3 phan tu cuoi cua B");
        System.arraycopy(B, B.length-3, C, 0, 3);   
        System.out.println("C= " + Arrays.toString(C));
    }

    // Cau e, sap xep mang C tang dan va xuat ra man hinh.
    public static void Cau_E(){
        System.out.println("Cau E: Sap xep mang C tang dan");
        Arrays.sort(C);
        System.out.println("C= " + Arrays.toString(C));
    }

    // Nhap vao so x, kiem tra x co nam trong mang C khong?
    public static void Cau_F() throws NumberFormatException, IOException {
        System.out.println("Cau F, nhap vao x, kiem tra x co nam trong C khong?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int index = Arrays.binarySearch(C, x);
        if(index == -1)
            System.out.println(Integer.toString(x) + " khong xuat hien trong mang C");
        else 
            System.out.println(Integer.toString(x) + " co xuat hien trong mang C");
    }
}