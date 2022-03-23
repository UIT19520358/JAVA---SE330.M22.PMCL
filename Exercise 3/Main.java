import java.util.Calendar;
import java.util.Scanner;

public class Main {
    private static  Scanner ip = new Scanner(System.in);
    private static int n;
    static Vehicle[] vehicles = null;
    private static double bikePrice, bicyclePrice, carPrice, truckPrice;
    private static double bikeMileage, carMileage, truckMileage;  
    private static int x = 0, y = 0, z = 0;
    public static void  main(String[] args) {                 
        int choose;
        do{
            System.out.println("\n===========================================Menu chuc nang===========================================\n");
            System.out.println("\n1. Nhap cac xe");
            System.out.println("\n2. Xuat ra cac xe");
            System.out.println("\n3. Xuat ra cac xe moi san xuat");
            System.out.println("\n4. Tinh tong gia tri cac xe");
            System.out.println("\n5. Tinh gia tri trung binh so dam da di tren cac loai xe co thong so nay");
            System.out.println("\n6. Thoat chuong trinh");
            System.out.println("Bam so de chon (1/2/3/4/5/6): ");
            
            choose = ip.nextInt();
            ip.nextLine();
            System.out.println();
            Process(choose);
        } while ((choose != 6));
    }

    private static void Process(int choose){
        switch (choose) {
            case 1:
            System.out.print("Nhap so luong xe: ");
            n = ip.nextInt();
            vehicles = new Vehicle[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nNhap thong tin xe thu " + (i + 1));
                System.out.print("\nNhap loai xe:\n1. Bicycle\n2. Bike\n3. Car\n4. Truck\n ");            
                int option; 
                do {
                    System.out.println("Bam so đe chon (1/2/3/4): ");
                    option = ip.nextInt();
                } while ((option < 1) || (option > 4));
            
                final VehicleType vehicleType;
                switch (option) {
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
            break;
            case 2:
                if (vehicles == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else displayVehicle();
            break;
            case 3:
                if (vehicles == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else NewCar();
            break;
            case 4:
            // 4. Tong gia tri cac xe
                if (vehicles == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else
                System.out.println("\n-------------Tong gia tri cac xe-------------\n1. Xe dap: " + bicyclePrice + "\n2. Xe may: " + bikePrice 
                + "\n3. Xe hoi: " + carPrice + "\n4. Xe tai: " + truckPrice);
            break;
            case 5:
            // 5. Gia tri mile trung binh cac loai xe la
                if (vehicles == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else
                System.out.println("\n-------------Gia tri mile trung binh cac loai xe-------------\n1. Xe may: " + bikeMileage/x 
                + "\n2. Xe hoi: " + carMileage/y + "\n3. Xe tai: " + truckMileage/z);
            break;
            case 6:
                System.out.println("Ban da ket thuc chuong trinh!");
                System.exit(0);
            break;
            default:
        }
    }

    static void displayVehicle() {
        System.out.println("\n-------------- THONG TIN TUNG XE --------------");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nThong tin xe thu " + (i + 1));
            System.out.println(vehicles[i]);
        }
    }

    // 3. Xuat ra cac xe moi san xuat: nam sx <= nam ht - 3
    static void NewCar(){
        Calendar instance = Calendar.getInstance();
        int recent = instance.get(Calendar.YEAR);  
        System.out.println("\n-----------------Danh sach cac xe moi san xuat-----------------\n");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nThong tin xe thu " + (i + 1));
            if (vehicles[i].year >= recent - 3) // 2019 >= 2022 - 3; 2020 >= 2022 - 3
            System.out.println("\n" + vehicles[i]);
        }
    }
}