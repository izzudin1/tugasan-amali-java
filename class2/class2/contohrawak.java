public class contohrawak {
    public static void main(String[] args) {

        StringBuilder cetak = new StringBuilder();
        //jana tiga aksara
        for (int i = 0; i < 3; i++){
            char aksara = (char)(Math.random()*26 + 'A');
            cetak.append(aksara);

        }
        //jana empat digit nombor 
        for (int i = 0; i < 4; i++){

            char nombor = (char)(Math.random() *10 + '0');
            cetak.append(nombor);
        }
        //cetak output
        System.out.println("Jana Nombor Pendaftaran Pelajar");
        System.out.println("Nombor Pendaftaran Pelajar : " + cetak);
    }
    
}
