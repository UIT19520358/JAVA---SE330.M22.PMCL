import java.util.Scanner;

public class Bicycle extends Vehicle {
    private double saddleSeatHeight;

    public double getSaddleSeatHeight() {
        return this.saddleSeatHeight;
    }

    public void setSaddleSeatHeight(double saddleSeatHeight) {
        this.saddleSeatHeight = saddleSeatHeight;
    }


    @Override
    public Vehicle Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("\nNhap kieu xe dap: ");
        model = ip.nextLine();
        System.out.println("\nNhap mau xe dap: ");
        color = ip.nextLine();
        do{
            System.out.println("\nNhap nam san xuat: (>1990)");
            year = ip.nextInt();} while(year<1990);
        System.out.println("\nNhap so banh xe: ");
        numWheels = ip.nextInt();
        do{
            System.out.println("\nNhap gia ban: ");
            price = ip.nextInt();} while(price<0);
        do{
            System.out.println("\nNhap so can nang: ");
            weight = ip.nextInt();} while(weight<0);

        System.out.println("\nNhap chieu cao yen xe: ");
        saddleSeatHeight = ip.nextInt();
        return this;
    }

    @Override
    public String turn() {
        return "Bicycle turns";
    }

    @Override
    public String toString() {
        return  "\n** Xe dap **" +
                "\nKieu xe dap: " + model +
                "\nMau xe dap: " + color +
                "\nNam san xuat: " + year +
                "\nSo banh xe: " + numWheels +
                "\nGia ban: " + price +
                "\nCan nang: " + weight +
                "\nChieu cao xe dap: " + saddleSeatHeight;
    }  
}
