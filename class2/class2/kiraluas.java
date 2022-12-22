public class kiraluas {
    static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main(String[] args) {
    //istihar pembolehubah
    double papar;
    //umpuk nilai dengan sub aturcara fungsi
    papar = kiraLuas();
    //panggil semula nilai untuk output
    System.out.println("isipadu bagi kuboid yang adalah "+papar+"padu");
    }

    //sub aturcara yang berbentuk fungsi 
    static double kiraLuas() {
        //istihar pembolehubah
        double panjang, lebar, tinggi, isipadu;

        System.out.println("panjang kuboid : ?");
            panjang=taip.nextDouble();
        System.out.println("panjang kuboid : ?");
            lebar=taip.nextDouble();
        System.out.println("panjang kuboid : ?");
            tinggi=taip.nextDouble();

        //lakukan operasi pengiraan 
        isipadu=panjang*lebar*tinggi;

        //hantar data setelah dilakukan pengiraan
        return Math.round(isipadu);
    }
}

