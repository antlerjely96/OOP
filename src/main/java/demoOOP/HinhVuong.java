package demoOOP;

import java.util.Scanner;

public class HinhVuong extends HinhHoc2D{
    public double canh;

    public void nhap(Scanner scanner) {
        System.out.print("Nhap canh: ");
        this.canh = scanner.nextDouble();
        this.tinhChuVi();
        this.tinhDienTich();
    }

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        this.setChuVi(this.canh * 4);
        return this.canh * 4;
    }

    @Override
    public double tinhDienTich() {
        this.setDienTich(Math.pow(this.canh, 2));
        return Math.pow(this.canh, 2);
    }

    public void hienThi(){
        System.out.println("C: " + this.canh);
        System.out.println("CV: " + this.getChuVi());
        System.out.println("DT: " + this.getDienTich());
    }
}
