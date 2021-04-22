package quiz1.pkg2;

/**
 *
 * @author acer
 */
 
    class MahlukHidup{
    String nafas;
    String berkembang_biak;
    String jenis_makanan;
}

class manusia extends MahlukHidup{
    String Nafas = "paru-paru";
    String Berkembangbiak = "melahirkan";
    String Jenismakanan;

    manusia() {
        this.Jenismakanan = "omivora";
    }
    
    void manusia(){
        System.out.println("manusia adalah mahluk hidup yang paling sempurna");
    }
}    

class ayam extends MahlukHidup{
    String Nafas = "paru-paru";
    String Berkembangbiak = "bertelur";
    String Jenismakanan = "omivora";
    
    void ayam(){
        System.out.println("ayaam mempunyai suara kukuruyuuu....");
    }
}

class singa extends MahlukHidup{
    String Nafas = "paru-paru";
    String Berkembangbiak = "melahirkan";
    String Jenismakanan = "karnivora";
    
    void singa(){
        System.out.println("singa merupakan raja hutan");
    }
}

public class soal2 {
    public static void main(String[] args) {
        manusia samsul = new manusia();
        System.out.println("mahluk hidup ini bernafas dengan " + samsul.Nafas);
        System.out.println("mahluk hidup berkembang biak dengan " + samsul.Berkembangbiak);
        System.out.println("jenis makanan " + samsul.Jenismakanan);
        samsul.manusia();
        
        System.out.println("======================================");
        
        ayam jago = new ayam();
        System.out.println("mahluk hidup ini bernafas dengan " + jago.Nafas);
        System.out.println("mahluk hidup berkembang biak dengan " + jago.Berkembangbiak);
        System.out.println("jenis makanan " + jago.Jenismakanan);
        jago.ayam();
        
        System.out.println("======================================");
        
        singa king = new singa();
        System.out.println("mahluk hidup ini bernafas dengan " + king.Nafas);
        System.out.println("mahluk hidup berkembang biak dengan " + king.Berkembangbiak);
        System.out.println("jenis makanan " + king.Jenismakanan);
        king.singa();
    }
}
