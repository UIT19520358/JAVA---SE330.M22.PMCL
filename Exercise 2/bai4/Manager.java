package bai4;

import java.util.Scanner;

public class Manager extends Staff {
    @Override
    public float getSalary() {
        if (contract == 1) return (float) (1.5 * baseSalary);
        else return (float) (1.2 * baseSalary + 100);
    }

    @Override
    public Staff Input() {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap id cua quan ly: ");
        this.id = ip.nextLine();
        System.out.print("Nhap ten cua quan ly: ");
        this.name = ip.nextLine();
        System.out.print("Nhap loai hop dong cua quan ly(chinh thuc: 1, thu viec: 0): ");
        this.contract = ip.nextInt();
        this.baseSalary = 1500;
        return this;
    }

    @Override
    public String toString() {
        return "Nguoi quan ly => "
                + ", id = " + this.id
                + ", ten = " + this.name
                + ", loai hop dong = " + (this.contract == 1 ? "Chinh Thuc" : "Thu Viec")
                + ", thu nhap = " + this.getSalary();
    }
}
