public class Pegawai {
    protected int Tarif;

    public static void main(String[]args){
        Supervisor supervisor = new Supervisor();
        Gaji gaji = new Gaji();
        Staff staff = new Staff();


        gaji.hitungGaji(supervisor.Tarif);
        gaji.hitungGaji(staff.Tarif);
    }
}
