import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Tính tổng từ 1 -> n.
    */

public class Cau4 {
    public static void main(String[] args) throws Exception {
        int n;
        do {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nhap n, tinh tong tu 1 den n: ");
            n = Integer.parseInt(br.readLine());    
            if(n < 0) {
                System.out.print("Hay nhap n > 0. ");
                continue;
            }
            System.out.println("Tong tu 1 den n la: " + Integer.toString(n*(n+1)/2));
        } while (n<0);
    }
}
