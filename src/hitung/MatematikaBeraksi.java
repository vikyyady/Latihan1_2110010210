package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika viky = new Matematika(1,0);
        
        System.out.println("Hasil Penjumlahan: " + viky.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + viky.setPengurangan());
        System.out.println("Hasil Perkalian: " + viky.setPerkalian());
        System.out.println("Hasil Pembagian: " + viky.setPembagian());
    }
}
