package demoOOP;

public class ConCho extends DongVatTrenCan implements DongVat{
    @Override
    public void keu() {
        System.out.println("Gau gau");
    }

    @Override
    public void Song(String noiSong) {
        System.out.println("Song trong nha");
    }

    //Constructor
    public ConCho(){

    }

    public ConCho(int soChan){
        this.setSoChan(soChan);
    }

    public ConCho(String thucAn){
        this.thucAn = thucAn;
    }

    public ConCho(int soChan, String thucAn){
        this.setSoChan(soChan);
        this.thucAn = thucAn;
    }
}
