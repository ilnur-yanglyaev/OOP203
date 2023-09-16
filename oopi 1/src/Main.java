import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isLat(String s)
    {
        boolean lat = true;
        for (int i = 0; i < s.length(); i++){
            if ( (int) s.charAt(i) < 65 || (int) s.charAt(i) > 122 || ((int) s.charAt(i) > 90 && (int) s.charAt(i) < 97) )
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "One two thr2ee раз два тkри one1 two2 123 ";
        int k = 0;
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {

                            if (!( (int) s[i].charAt(i) < 65 || (int) s[i].charAt(i) > 122 || ((int) s[i].charAt(i) > 90 && (int) s[i].charAt(i) < 97) ))
                            k++;
        }
        System.out.println(k);
    }
}