package demoOOP;

public abstract class HinhHoc2D {
    private double chuVi;
    private double dienTich;

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
}
