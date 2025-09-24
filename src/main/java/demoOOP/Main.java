package demoOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhap(scanner);
        hinhChuNhat.hienThi();
    }
}
