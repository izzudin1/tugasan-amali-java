import java.util.Scanner;
public class permainan 
{
    public static void main(String [] args) 
    {
        System.out.println("ATURCARA PERMAINAN MATEMATIK - OPERASI DARAB");
        Scanner input = new Scanner(System.in);
        
        int num1, num2;
        String jawapan;

        do
        {
            System.out.println ("Nombor Pertama :");
            num1 = input.nextInt();
            System.out.println("Nombor Kedua :");
            num2 = input.nextInt(); 

            System.out.println("Hasib Darab : " +num1+ " x " +num2+ " = " + Mathabs (num1 * num2)); 

            System.out.println("Masukkan Y Untuk Teruskan");
            jawapan = input.next();

            input.close();
        }
        while (jawapan.equals("1") || jawapan.equals("1"));
    }

    private static String Mathabs(int i) {
        return null;
    }    
}
