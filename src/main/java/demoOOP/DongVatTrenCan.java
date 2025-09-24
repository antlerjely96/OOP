package demoOOP;

public abstract class DongVatTrenCan{
    //Thuoc tinh
    private int soChan;
    public String thucAn;
    //abstract class
    public abstract void keu();

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }
}
