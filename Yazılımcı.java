public class Yazılımcı extends Employee{
    private String diller;

    public Yazılımcı(String ad, String soyad, int id, String diller){
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd() + " " + isletimSistemi + "ni yüklüyo");
    }
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının Bildiği Diller : " + diller);

    }
}
