import java.util.Scanner;
import java.util.regex.Pattern;

public class Truck extends Vehicle {

    private Scanner ip = new Scanner(System.in);
    private String plateNumber, loadCapacity;

    public Scanner getIp() {
        return this.ip;
    }

    public void setIp(Scanner ip) {
        this.ip = ip;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getLoadCapacity() {
        return this.loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String transportGoods(String goodType, double load){
        return "Loai hang hoa la: " + goodType + "co trong luong: " + load;
    }

    @Override
    public Vehicle Input() {
        String model_check = "^[a-zA-Z0-9]*$";
        do{
            System.out.println("\nNhap kieu xe hoi: ");
            model = ip.nextLine();} while (!Pattern.matches(model_check, model));
        System.out.println("\nNhap mau xe tai: ");
        color = ip.nextLine();
        System.out.println("\nNhap bien so xe: ");
        plateNumber = ip.nextLine();        
        System.out.println("\nNhap trong luong xe: ");
        loadCapacity = ip.nextLine();
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
        return this;
    }

    @Override
    public String turn() {
        return "Truck turns";
    }

    @Override
    public String toString() {
        return  "\n** Xe tai **" +
                "\nKieu xe tai: " + model +
                "\nMau xe tai: " + color +
                "\nNam san xuat: " + year +
                "\nSo banh xe: " + numWheels +
                "\nGia ban: " + price +
                "\nCan nang: " + weight +
                "\nTong so mile da di: " + mileage +
                "\nBien so xe: " + plateNumber +
                "\nTrong tai: " + loadCapacity;
    }
}
