package bai4;

import java.util.Scanner;

public class CD {
    private String cdID, cdTitle, recorder, singer;
    private int cdYear, cdUnit, cdAmount;
    protected Float cdTotal;
    Scanner scanner = new Scanner(System.in);
     
    public CD() {
        super();
    }

    public CD(String cdID, String cdTitle, String recorder, String singer, int cdYear, int cdUnit, int cdAmount, Float cdTotal) {
        this.cdID = cdID;
        this.cdTitle = cdTitle;
        this.recorder = recorder;
        this.singer = singer;
        this.cdYear = cdYear;
        this.cdUnit = cdUnit;
        this.cdAmount = cdAmount;
        this.cdTotal = cdTotal;
    }

    public String getCdID() {
        return this.cdID;
    }

    public void setCdID(String cdID) {
        this.cdID = cdID;
    }

    public String getCdTitle() {
        return this.cdTitle;
    }

    public void setCdTitle(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    public String getRecorder() {
        return this.recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public String getSinger() {
        return this.singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCdYear() {
        return this.cdYear;
    }

    public void setCdYear(int cdYear) {
        this.cdYear = cdYear;
    }

    public int getCdUnit() {
        return this.cdUnit;
    }

    public void setCdUnit(int cdUnit) {
        this.cdUnit = cdUnit;
    }

    public int getCdAmount() {
        return this.cdAmount;
    }

    public void setCdAmount(int cdAmount) {
        this.cdAmount = cdAmount;
    }

    public Float getCdTotal() {
        return this.cdTotal;
    }

    public void setCdTotal(Float cdTotal) {
        this.cdTotal = cdTotal;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Input() {
        System.out.print("Nhap ma CD: ");
        cdID = scanner.nextLine();
        System.out.print("Nhap ten CD: ");
        cdTitle = scanner.nextLine();
        System.out.print("Nhap hang thu am: ");
        recorder = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        cdYear = scanner.nextInt();
        System.out.print("Nhap don gia CD: ");
        cdUnit = scanner.nextInt();
        System.out.print("Nhap so luong CD: ");
        cdAmount = scanner.nextInt();
    }
     
    public Float CdTotal() {
        if (cdYear > 1990) cdTotal = (float) (cdAmount * cdUnit);
        else cdTotal = (float) (cdAmount * cdUnit * 0.1);
        return cdTotal;
    }
 
    public String toString() {
        return super.toString() + "\nMa CD: " + this.cdID + "\nTieu de CD: " + cdTitle + "\nHang thu am: " + recorder + "\nNam xuat ban: " + this.cdYear 
        + "\nDon gia: " + this.cdUnit + "\nSo luong: " + this.cdAmount + "\nThanh tien: " + this.CdTotal();
    }
}
