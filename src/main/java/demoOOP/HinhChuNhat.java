package demoOOP;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc2D {
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap (Scanner scanner){
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = scanner.nextDouble();
        this.tinhChuVi();
        this.tinhDienTich();
    }

    public void hienThi(){
        System.out.println("CD: " + this.chieuDai);
        System.out.println("CR: " + this.chieuRong);
        System.out.println("CV: " + this.getChuVi());
        System.out.println("DT: " + this.getDienTich());
    }

    @Override
    public double tinhChuVi() {
        this.setChuVi((this.chieuDai + this.chieuRong) * 2);
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        this.setDienTich(this.chieuDai * this.chieuRong);
        return this.chieuRong * this.chieuDai;
    }
}
