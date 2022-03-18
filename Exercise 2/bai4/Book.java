package bai4;

import java.util.Scanner;

public class Book {
    private String bookID, bookTitle, publisher;
    private int bookYear, bookUnit, pages, bookAmount, status;
    protected Float bookTotal;
    Scanner scanner = new Scanner(System.in);
     
    public Book() {
        super();
    }
 
    public Book(String bookID, String bookTitle, String publisher, int status, int bookYear, int bookUnit, 
        int pages, int bookAmount, Float bookTotal) {
        super();
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.status = status;
        this.bookYear = bookYear;
        this.bookUnit = bookUnit;
        this.pages = pages;
        this.bookAmount = bookAmount;
        this.bookTotal = bookTotal;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookID() {
        return this.bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public int getBookUnit() {
        return this.bookUnit;
    }

    public void setBookUnit(int bookUnit) {
        this.bookUnit = bookUnit;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getBookAmount() {
        return this.bookAmount;
    }

    public void setBookAmount(int bookAmount) {
        this.bookAmount = bookAmount;
    }

    public Float getBookTotal() {
        return this.bookTotal;
    }

    public void setBookTotal(Float bookTotal) {
        this.bookTotal = bookTotal;
    }

    public void Input() {
        System.out.print("Nhap ma sach: ");
        bookID = scanner.nextLine();
        System.out.print("Nhap tieu de sach: ");
        bookTitle = scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        publisher = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        bookYear = scanner.nextInt();
        System.out.print("Nhap don gia sach: ");
        bookUnit = scanner.nextInt();
        System.out.print("Nhap so trang sach: ");
        pages = scanner.nextInt();
        System.out.print("Nhap so luong sach: ");
        bookAmount = scanner.nextInt();
        System.out.print("Nhap tinh trang sach: \n1. Moi \n2. Tray xuoc\n");
        status = scanner.nextInt();
        if (status == 1 || status == 2) return;
        else {
            System.out.print("Vui long nhap lai tinh trang sach! \n1. Moi \n2. Tray xuoc\n");
            status = scanner.nextInt();
        }
    }
     
    public Float BookTotal() {
        if (status == 1) bookTotal = (float) (bookAmount * bookUnit);
        else bookTotal = (float) (bookAmount * bookUnit * 0.3);
        return bookTotal;
    }
 
    public String toString() {
        String a;
        if (this.status == 1) a = "Moi";
        else a = "Tray xuoc";
        return super.toString() + "\nMa sach: " + this.bookID + "\nTieu de sach: " + bookTitle + "\nNha xuat ban: " + publisher + "\nNam xuat ban: " + this.bookYear 
        + "\nDon gia: " + this.bookUnit + "\nSo trang: " + this.pages + "\nSo luong: " + this.bookAmount + "\nTinh trang sach: " + a + "\nThanh tien: " + this.BookTotal();
    }
}