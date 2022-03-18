import java.util.Calendar;
import java.util.Scanner;

public class VehicleManager {
    final int n;
    Vehicle[] vehicles;
    static double bikePrice, bicyclePrice, carPrice, truckPrice;
    static double bikeMileage, carMileage, truckMileage;  
    static int x = 0, y = 0, z = 0;

    // 1. Nhap cac xe
    public VehicleManager() {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap so luong xe: ");
        this.n = ip.nextInt();
        vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin xe thu " + (i + 1));
            System.out.print("\nNhap loai xe:\n1. Bicycle\n2. Bike\n3. Car\n4. Truck\n ");            
            int choose; 
            do {
                System.out.println("Bam so đe chon (1/2/3/4): ");
                choose = ip.nextInt();
            } while ((choose < 1) || (choose > 4));
            
            final VehicleType vehicleType;
            switch (choose) {
                case 1:
                    vehicleType = VehicleType.Bicycle;            
                    vehicles[i] = Vehicle.createVehicle(vehicleType);
                    bicyclePrice += vehicles[i].getPrice();
                    break;
                case 2:
                    vehicleType = VehicleType.Bike;            
                    vehicles[i] = Vehicle.createVehicle(vehicleType);
                    bikePrice += vehicles[i].getPrice();
                    bikeMileage +=vehicles[i].getMileage();
                    x++;
                    break;
                case 3:
                    vehicleType = VehicleType.Car;            
                    vehicles[i] = Vehicle.createVehicle(vehicleType);
                    carPrice += vehicles[i].getPrice();
                    carMileage +=vehicles[i].getMileage();
                    y++;
                    break;
                case 4:
                    vehicleType = VehicleType.Truck;            
                    vehicles[i] = Vehicle.createVehicle(vehicleType);
                    truckPrice += vehicles[i].getPrice();
                    truckMileage +=vehicles[i].getMileage();
                    z++;
                    break;
            }
        }
        ip.close();
    }

    // 2. Xuat cac xe
    void displayVehicle() {
        System.out.println("\n-------------- THONG TIN TUNG XE --------------");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nThong tin xe thu " + (i + 1));
            System.out.println(vehicles[i]);
        }
    }

    // 3. Xuat ra cac xe moi san xuat: nam sx <= nam ht - 3
    void NewCar(){
        Calendar instance = Calendar.getInstance();
        int recent = instance.get(Calendar.YEAR);
        recent = recent - 3;        
        System.out.println("\n-----------------Danh sach cac xe moi san xuat-----------------\n");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].year <= recent)
            System.out.println("\n" + vehicles[i].toString());
        }
    }
}
