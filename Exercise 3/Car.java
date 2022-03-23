import java.util.Scanner;
import java.util.regex.Pattern;

public class Car extends Vehicle {

    private String plateNumber;
    private int numSeats, numDoors;

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

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public Vehicle Input() {
        Scanner ip = new Scanner(System.in);
        String model_check = "^[a-zA-Z0-9]*$";
        do{
            System.out.println("\nNhap kieu xe hoi: ");
            model = ip.nextLine();} while (!Pattern.matches(model_check, model));
        System.out.println("\nNhap mau xe hoi: ");
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
        System.out.println("\nNhap so cua xe: ");
        numDoors = ip.nextInt();
        return this;
    }

    @Override
    public String turn() {
        return "Car turns";
    }

    @Override
    public String toString() {
        return  "\n** Xe hoi **" +
                "\nKieu xe hoi: " + model +
                "\nMau xe hoi: " + color +
                "\nNam san xuat: " + year +
                "\nSo banh xe: " + numWheels +
                "\nGia ban: " + price +
                "\nCan nang: " + weight +
                "\nTong so mile da di: " + mileage +
                "\nBien so xe: " + plateNumber +
                "\nSo cho ngoi: " + numSeats +
                "\nSo cua xe: " + numDoors;
    }
}
