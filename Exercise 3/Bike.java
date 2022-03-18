import java.util.Scanner;

public class Bike extends Vehicle {

    private String plateNumber;
    private int numSeats;

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getNumSeats() {
        return this.numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public Vehicle Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("\nNhap kieu xe may: ");
        model = ip.nextLine();
        System.out.println("\nNhap mau xe may: ");
        color = ip.nextLine();
        System.out.println("\nNhap bien so xe: ");
        plateNumber = ip.nextLine();
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

        System.out.println("\nNhap tong so mile da di: ");
        mileage = ip.nextInt();
        do{
            System.out.println("\nNhap so cho ngoi: ");
            numSeats = ip.nextInt();} while (numSeats<0);
        return this;
    }

    @Override
    public String turn() {
        return "Bike turns";
    }

    @Override
    public String toString() {
        return  "\n** Xe may **" +
                "\nKieu xe may: " + model +
                "\nMau xe may: " + color +
                "\nNam san xuat: " + year +
                "\nSo banh xe: " + numWheels +
                "\nGia ban: " + price +
                "\nCan nang: " + weight +
                "\nTong so mile da di: " + mileage +
                "\nBien so xe: " + plateNumber +
                "\nSo cho ngoi: " + numSeats;
    }
}
