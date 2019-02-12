public class Gaji {
    private int hasil;

    public void hitungGaji(int Tarif){
        this.hasil = 30*Tarif;
        System.out.println("Selamat Anda menerima gaji sebesar" + hasil);
    }
}
