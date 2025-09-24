package demoOOP;

import java.util.Scanner;

public class HinhTron extends HinhHoc2D{
    public double banKinh;

    public void nhap(Scanner scanner) {
        System.out.print("Ban kinh: ");
        this.banKinh = scanner.nextDouble();
        this.tinhChuVi();
        this.tinhDienTich();
    }


    @Override
    public double tinhChuVi() {
        this.setChuVi(this.banKinh * 2 * Math.PI);
        return this.banKinh * 2 * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        this.setDienTich(Math.pow(this.banKinh, 2) * Math.PI);
        return Math.pow(this.banKinh, 2) * Math.PI;
    }

    public void hienThi(){
        System.out.println("BK: " + this.banKinh);
        System.out.println("CV: " + this.getChuVi());
        System.out.println("DT: " + this.getDienTich());
    }
}
