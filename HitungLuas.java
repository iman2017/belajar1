/**
 * @author IMAN-IT
 */

public class HitungLuas {
    public static void main(String[] args) {
        int panjang = 7;
        int lebar = 6;
	int setengah = 1/2;
	int alas = 5;
	int tinggi = 8;
        int phi = 22/7;
        int jari2 = 5;
        int Luaspersegi = LuasPersegiPanjang(panjang, lebar);
        int Luassegitiga = LuasSegitiga(setengah, alas, tinggi);
        int Luaslingkaran = cariLuasLingkaran(phi, jari2);
        System.out.println("Panjangnya adalah "+panjang);
        System.out.println("Lebarnya adalah   "+lebar);
        System.out.println("Luasnya Persegi Panjang adalah "+ Luaspersegi);
	System.out.println("");
	System.out.println("Panjang Alas adalah "+ alas);
	System.out.println("Tinggi adalah       "+ tinggi);
	System.out.println("Luasnya Segitiga adalah "+ Luassegitiga);
        System.out.println("Phi adalah "+phi);
        System.out.println("Jari - jari adalah "+jari2);
        System.out.println("Luasnya Lingkaran adalah "+Luaslingkaran);
    }
public static int LuasPersegiPanjang(int panjang, int lebar) {
        int luas;
        luas = panjang*lebar;
        return luas;
    } 
public static int LuasSegitiga(int setengah, int alas, int tinggi)   {
	int luas;
	luas = alas*tinggi/2;
	return luas;
    }
public static int cariLuasLingkaran(int phi, int jari2) {
        int luas;
        luas = phi*(jari2*jari2);
        return luas;
    }
}
