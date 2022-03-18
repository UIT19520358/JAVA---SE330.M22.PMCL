import java.util.Scanner;

public class Main {
    private static Scanner ip = new Scanner(System.in);
    private static VehicleManager vehicleManager = null;
    public static void  main(String[] args) {                 
        Menu();
    }

    private static void Menu(){
        int choose;
        for (;;) {
            do {
                System.out.println("\n===========================================Menu chuc nang===========================================\n");
                System.out.println("\n1. Nhap cac xe");
                System.out.println("\n2. Xuat ra cac xe");
                System.out.println("\n3. Xuat ra cac xe moi san xuat");
                System.out.println("\n4. Tinh tong gia tri cac xe");
                System.out.println("\n5. Tinh gia tri trung binh so dam da di tren cac loai xe co thong so nay");
                System.out.println("\n6. Thoat chuong trinh");
                System.out.println("Bam so de chon (1/2/3/4/5/6): ");
                choose = ip.nextInt();
                Process(choose);
            } while ((choose < 1) || (choose > 6));
        }
    }

    private static void Process(int choose){
        switch (choose) {
            case 1:
                vehicleManager = new VehicleManager();
                break;
            case 2:
                if (vehicleManager == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else vehicleManager.displayVehicle();
                break;
            case 3:
                if (vehicleManager == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else
                vehicleManager.NewCar();
                break;
            case 4:
            // 4. Tong gia tri cac xe
                if (vehicleManager == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else
                System.out.println("\n-------------Tong gia tri cac xe-------------\n1. Xe dap: " + VehicleManager.bicyclePrice + "\n2. Xe may: " + VehicleManager.bikePrice 
                + "\n3. Xe hoi: " + VehicleManager.carPrice + "\n4. Xe tai: " + VehicleManager.truckPrice);
                break;
            case 5:
            // 5. Gia tri mile trung binh cac loai xe la
                if (vehicleManager == null) {
                    System.out.println("Chua nhap danh sach xe");
                } else
                System.out.println("\n-------------Gia tri mile trung binh cac loai xe-------------\n1. Xe may: " + VehicleManager.bikeMileage/VehicleManager.x 
                + "\n2. Xe hoi: " + VehicleManager.carMileage/VehicleManager.y + "\n3. Xe tai: " + VehicleManager.truckMileage/VehicleManager.z);
                break;
            case 6:
                System.out.println("Ban da ket thuc chuong trinh!");
                System.exit(0);
                break;
            default:
        }
    }
}
