package exercitiul2;
import java.io.*;
import static java.lang.Integer.parseInt;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String nume_fis = "in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        int s = 0, i = 0, max = 0, min = 100;
        float ma;
        for(String linie; (linie = flux_in.readLine())!=null;) {
            s = s + parseInt(linie);
            i++;
            if(parseInt(linie) > max)
                max = parseInt(linie);
            if(parseInt(linie) < min)
                min = parseInt(linie);
        }
        ma = (float) s/i;
        System.out.println("Suma = " +s);
        System.out.println("Media aritmetica = " +ma);
        System.out.println("Minim = " +min);
        System.out.println("Maxim = " +max);

        PrintStream flux_out = new PrintStream("out.txt");
        flux_out.println(s);
        flux_out.println(ma);
        flux_out.println(min);
        flux_out.println(max);
    }
}
