package bai4;

import java.util.Scanner;

public class Sale extends Staff{
    private int numberOfSoldProduct, kpi;
    @Override
    public float getSalary() {
        return (float) (tempSalary() + bonusOnKpi());
    }
    private float tempSalary() {
        if (contract == 1) return (float) (1.0 * baseSalary);
        else return (float) (0.7 * baseSalary + 100);
    }

    private float bonusOnKpi() {
        final float tempSalary = tempSalary();
        final float soldProductOnKpi = numberOfSoldProduct / kpi;
        float result = 0;

        if (soldProductOnKpi == 0) {
            result = tempSalary;
        } else if (soldProductOnKpi > 0 && soldProductOnKpi <= 0.5) {
            result = tempSalary + 150;
        } else if (soldProductOnKpi > 0.5 && soldProductOnKpi <= 0.8) {
            result = tempSalary + 300;
        } else if (0.8 < numberOfSoldProduct && numberOfSoldProduct <= 0.9) {
            result = tempSalary + 450;
        } else {
            result = tempSalary + 550;
        }
        return result;
    }
    @Override
    public Staff Input() {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap id cua nguoi ban: ");
        this.id = ip.nextLine();
        System.out.print("Nhap ten cua nguoi ban: ");
        this.name = ip.nextLine();
        System.out.print("Nhap loai hop dong cua nguoi ban(chinh thuc: 1, thu viec: 0): ");
        this.contract = ip.nextInt();
        System.out.print("Nhap so luong san pham ban duoc: ");
        this.numberOfSoldProduct = ip.nextInt();
        System.out.print("Nhap kpi: ");
        this.kpi = ip.nextInt();

        this.baseSalary = 1000;
        return this;
    }

    @Override
    public String toString() {
        return "Nguoi ban hang => "
                + ", id = " + this.id
                + ", ten = " + this.name
                + ", loai hop dong = " + (this.contract == 1 ? "Chinh Thuc" : "Thu Viec")
                + ", thu nhap = " + this.getSalary()
                + ", kpi = " + this.kpi
                + ", so luong san pham ban duoc = " + this.numberOfSoldProduct;
    }
}
