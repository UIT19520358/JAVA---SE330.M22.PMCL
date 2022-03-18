import java.util.Arrays;
import java.util.Scanner;

public class Bai_11 {
    public static void main (String[] args){
    // Nhập mảng số nguyên A kích thước n
        int n, m, x;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang A: ");
            n = scanner.nextInt();
        } while (n < 0);

        do {
            System.out.println("Nhap vao so phan tu cua mang B: ");
            m = scanner.nextInt();
        } while (m < 0);         
    // khởi tạo và cấp phát bộ nhớ cho mảng
        int A[] = new int[n];
        int B [] = new int[m];
        int C [];
         
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            A[i] = scanner.nextInt();
        }
    // Câu a: Mảng B giá trị ngẫu nhiên từ 1-1000
        int max = 1000;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < m; i++) {
            int rand = (int)(Math.random() * range) + min;
            B[i] = rand;
        }
    // Câu b: Xuất B
        System.out.println("Mang B la: ");
        System.out.println("B= " + Arrays.toString(B) + "\n");
    // Câu c: Copy mảng C từ mảng A
        System.out.println("Mang C duoc tao tu mang A la: ");
        C = Arrays.copyOf(A, A.length);
        System.out.println("C= " + Arrays.toString(C) +"\n");
    // Câu d: Thay 3 phần tử đầu của C thành 3 phần tử cuối cùa B
        System.out.println("Mang C sau khi thay the la: ");
        System.arraycopy(B, B.length-3, C, 0, 3);   
        System.out.println("C= " + Arrays.toString(C) + "\n");
    // Câu e: Sắp xếp mảng C tăng dần
        System.out.println("Mang C tang dan la: ");
        Arrays.sort(C);
        System.out.println("C= " + Arrays.toString(C) + "\n");
    // Câu f: Nhập vào x, kiểm tra x trong C
        System.out.println("Nhap vao x, kiem tra x co nam trong C khong?");
        x = scanner.nextInt();
        scanner.close();
        int index = Arrays.binarySearch(C, x);
        if(index == -1)
            System.out.println(x + " khong xuat hien trong mang C");
        else 
            System.out.println(x + " co xuat hien trong mang C");
    }
}
