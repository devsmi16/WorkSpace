import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome");

        String islemler = """
                İşlemler
                1. yazılımcı işleri
                2. yönetici işlemleri
                çıkış için q'ya basın
                """;
        System.out.println(islemler);
        label:
        while (true){
            System.out.println("işlemi seçin...");
            String islem = input.nextLine();

            switch (islem) {
                case "q":
                    System.out.println("çıkış yapılıyo");
                    break label;
                case "1":
                    Yazılımcı yazilimci = new Yazılımcı("sami", "gündoğan", 1453, "java");
                    String yazilimciIslem =
                            """
                            1. Format At
                            2. Bilgileri Göster
                            çıkış g'ya basın
                            """;

                    System.out.println(yazilimciIslem);

                    label1:
                    while (true) {
                        System.out.println("işlemi seçin");
                        String yzlmciIslem = input.nextLine();

                        switch (yzlmciIslem) {
                            case "q":
                                System.out.println("çıkış yapılıyo");
                                break label1;
                            case "1":
                                System.out.println("İşletim sistemi: ");
                                String isletimSistemi = input.nextLine();
                                yazilimci.formatAt(isletimSistemi);
                                break;
                            case "2":
                                yazilimci.bilgileriGoster();
                                break;
                            default:
                                System.out.println("geçersiz yazılımcı işlemi");

                                break;
                        }
                    }
                    break;
                case "2":
                    Management management = new Management("x", "kişisi", 1071, 3);
                    String managementIslem =
                            """
                            1. Zam Yap
                            2. Bilgileri Göster
                            çıkış için q'ya basın
                            """;

                    System.out.println(managementIslem);

                    label1:
                    while (true) {
                        System.out.println("İşlem seçin");
                        String mngmntIslem = input.nextLine();

                        switch (mngmntIslem) {
                            case "q":
                                System.out.println("yönetici işleminden çıkış yapılıyo");
                                break label1;
                            case "1":
                                System.out.println("ne kadar zam yapılsın: ");
                                int zamMiktari = input.nextInt();
                                input.nextLine();
                                management.zamYap(zamMiktari);
                                break;
                            case "2":
                                management.bilgileriGoster();
                                break;
                            default:
                                System.out.println("geçersiz yönetici işlemi");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("geçersiz işlem kanka");
                    break;
            }
        }
    }
}