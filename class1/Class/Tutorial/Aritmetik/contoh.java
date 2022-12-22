import java.util.Scanner;
public class contoh 
{
    public static void main( String[] args) 
    {
        System.out.println("ATURCARA MENGIRA KALENDAR CINA");

        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Tahun :");

        int tahunmasihi = input.nextInt();
        int tahuncina = tahunmasihi % 12;

        input.close();

        switch (tahuncina)
        {
            case 0 :
            System.out.println("Tahun " +tahunmasihi+ " adalah " +"Tahun Monyet");
            break;

            case 1 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Ayam");
            break;

            case 2 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Anjing");
            break;

            case 3 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Babi");
            break;

            case 4 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Tikus");
            break;

            case 5 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Lembu");
            break;

            case 6 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Harimau");
            break;

            case 7 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Arnab");
            break;

            case 8 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Naga");
            break;

            case 9 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Ular");
            break;

            case 10 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Kuda");
            break;

            case 11 :
            System.out.println("Tahun "  +tahunmasihi+ " adalah " + "Tahun Kambing");
            break;
        }
    }
}