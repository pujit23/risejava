import java.util.*;
public class Main {
    public static void main(String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word");
        String word = sc.nextLine().toUpperCase();

        System.out.print("Enter the Key");
        String key = sc.nextLine().toUpperCase();

        StringBuilder k = new StringBuilder(key);
        while (k.length()<word.length()){
            k.append(key);
        }
        key = k.toString();
        StringBuilder enc = new StringBuilder();
        StringBuilder dec = new StringBuilder();

        for (int i =0; i<word.length();i++){
            char t = word.charAt(i);
            if (t>='A'&& t<='Z'){
                int e = (t-'A'+(key.charAt(i)-'A'))%26;
                enc.append((char)(e+'A'));
            }
            else {
                enc.append(t);
            }
        }
        for (int i = 0 ; i<enc.length();i++){
            char c = enc.charAt(i);
            if (c>='A'&& c<='Z') {
                int p = (c - 'A' - (key.charAt(i) - 'A') + 26) % 26;
                dec.append((char) (p + 'A'));
            }else {
                dec.append(c);
            }
        }
        System.out.println(dec);
        System.out.print(enc);



    }
}