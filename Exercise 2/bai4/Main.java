package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner ip = new Scanner(System.in)) {
            // Chuc nang a: Nhap/Xuat tung loai sach ban ra
                float productTotal=0;
                int productAmount=0;
                System.out.print("Nhap so sach hien co: ");
                int x = ip.nextInt();
                Book[] book = new Book[x];
                for (int i = 0; i < x; i++) {
                    System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
                    book[i] = new Book();
                    book[i].Input();
                    // Chuc nang c: Tinh thanh tien cho tung loai sach khac nhau
                    productTotal+=book[i].BookTotal();
                    productAmount+=book[i].getBookAmount();
                }
                System.out.println("--------------------------------Thong tin cac loai sach ban ra la--------------------------------\n");
                for (int i = 0; i < x; i++) {
                    System.out.println(book[i].toString() + "\n-------------------------\n");
                }
            // Chuc nang b: Nhap/Xuat tung loai CD ban ra
                System.out.print("Nhap so CD hien co: ");
                int y = ip.nextInt();
                CD[] cd = new CD[y];            
                for (int i = 0; i < y; i++) {
                    System.out.println("Nhap thong tin CD thu " + (i + 1) + ":");
                    cd[i] = new CD();
                    cd[i].Input();
                    // Chuc nang d: Tinh thanh tien cho tung loai CD khac nhau
                    productTotal+=cd[i].CdTotal();
                    productAmount+=cd[i].getCdAmount();
                }
                System.out.println("--------------------------------Thong tin cac loai CD ban ra la--------------------------------\n");
                for (int i = 0; i < y; i++) {
                    System.out.println(cd[i].toString() + "\n-------------------------\n");
                }
                // Chuc nang e:
                System.out.println("** Tong thanh tien la: "+productTotal+" **\n");
                System.out.println("** Tong so luong ban ra la: "+productAmount+" **\n");
            // Chuc nang f: Nhap/xuat thong tin nhan vien
                System.out.print("Nhap so nhan vien: ");
                int z = ip.nextInt();
                Staff[] staff = new Staff[z];
                for (int i = 0; i < z; i++){
                    System.out.println("\nNhap thong tin nhan vien thu " + (i + 1) + ":");
                    System.out.println("\n1. Sale\n2.Manager\n");
                    int choose = ip.nextInt();
                    if (choose == 1) {
                        staff[i] = new Sale();
                    } else if (choose == 2){
                        staff[i] = new Manager();
                    }
                    staff[i].Input();
                }
                System.out.println("Thông tin của các nhân viên trong công ty: ");
                for (int i = 0; i < z; i++) {
                System.out.println(staff[i].toString());
            }
        }
    }
}