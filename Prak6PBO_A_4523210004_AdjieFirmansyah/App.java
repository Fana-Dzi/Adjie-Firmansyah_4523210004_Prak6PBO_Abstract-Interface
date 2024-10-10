
public class App {
    public static void main(String[] args) throws Exception {
        Jagoan pitung = new Jagoan("Si Pitung");
        Jubah jubahSilatPutih = new Jubah("Jubah Putih", 7, 50);
        Senjata golok = new Senjata("Golok", 25);

        pitung.setJubah(jubahSilatPutih);
        pitung.setSenjata(golok);

        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahSilatHitam = new Jubah("Jubah Hitam", 8, 52);
        Senjata toya = new Senjata("Toya", 24);

        jakaSembung.setJubah(jubahSilatHitam);
        jakaSembung.setSenjata(toya);

        pitung.info();
        jakaSembung.info();

        jakaSembung.menyerang(pitung);
        jakaSembung.menyerang(pitung);

        pitung.menyerang(jakaSembung);

        jakaSembung.menyerang(pitung);

        pitung.menyerang(jakaSembung);

        }
    
}
