package bai4;

public abstract class Staff {
    protected String id;
    protected String name;
    protected int baseSalary, contract;

    /**
     * Get the salary of employee depends on the position of each employee
     */
    public abstract float getSalary();

    public abstract Staff Input();

    public abstract String toString();

    // String staffID, name;
    // int contract, baseSalary;
    // float salary;
    // Scanner ip = new Scanner(System.in);

    // public Staff() {
    // }

    // public Staff(String staffID, String name, int contract, float salary, int baseSalary) {
    //     this.staffID = staffID;
    //     this.name = name;
    //     this.contract = contract;
    //     this.salary = salary;
    //     this.baseSalary = baseSalary;
    // }

    // public int getBaseSalary() {
    //     return this.baseSalary;
    // }

    // public void setBaseSalary(int baseSalary) {
    //     this.baseSalary = baseSalary;
    // }

    // public String getStaffID() {
    //     return this.staffID;
    // }

    // public void setStaffID(String staffID) {
    //     this.staffID = staffID;
    // }

    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getContract() {
    //     return this.contract;
    // }

    // public void setContract(int contract) {
    //     this.contract = contract;
    // }

    // public float getSalary() {
    //     return this.salary;
    // }

    // public void setSalary(float salary) {
    //     this.salary = salary;
    // }
    
    // public void Input() {
    //     System.out.print("Nhap ma nhan vien: ");
    //     staffID = ip.nextLine();
    //     System.out.print("Nhap ho ten: ");
    //     name = ip.nextLine();
    //     System.out.print("Nhap loai hop dong:\n1.Chinh thuc\n2.Thu viec\n");
    //     contract = ip.nextInt();
    //     if (contract == 1 || contract == 2) return;
    //     else {
    //         System.out.print("Vui long nhap lai hop dong nhan vien! \n1. Chinh thuc \n2. Thu viec\n");
    //         contract = ip.nextInt();
    //     }
    // }
    
    // public String toString() {
    //     String a;
    //     if (this.contract == 1) a = "Chinh thuc";
    //     else a = "Thu viec";
    //     return "Ma nhan vien: " + this.staffID + "\nHo ten nhan vien: " 
    //     + this.name + "\nLoai hop dong: " + a + "\nThu nhap: " + this.getSalary();
    // }
}