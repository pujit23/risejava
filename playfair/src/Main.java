import java.util.*;

public class PlayfairCipher {

    static char[][] matrix = new char[5][5];

    // Remove duplicate characters and prepare key string
    public static String formatKey(String key) {
        key = key.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder formatted = new StringBuilder();
        for(char c : key.toCharArray()) {
            if(formatted.indexOf(String.valueOf(c)) == -1)
                formatted.append(c);
        }
        return formatted.toString();
    }

    // Create 5x5 matrix
    public static void generateMatrix(String key) {
        key = formatKey(key);
        String alpha = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        StringBuilder s = new StringBuilder(key);

        for(char c : alpha.toCharArray()) {
            if(s.indexOf(String.valueOf(c)) == -1)
                s.append(c);
        }

        int k = 0;
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                matrix[i][j] = s.charAt(k++);
    }

    // Prepare plaintext
    public static String formatText(String text){
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder sb = new StringBuilder(text);

        for(int i = 0; i < sb.length(); i += 2) {
            if(i == sb.length() - 1)
                sb.append("X");
            else if(sb.charAt(i) == sb.charAt(i+1))
                sb.insert(i+1, "X");
        }
        return sb.toString();
    }

    // Find character position in matrix
    public static int[] findPos(char c) {
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                if(matrix[i][j] == c)
                    return new int[]{i, j};
        return null;
    }

    // Encrypt
    public static String encrypt(String text) {
        text = formatText(text);
        StringBuilder cipher = new StringBuilder();

        for(int i=0;i<text.length();i+=2) {
            char a=text.charAt(i), b=text.charAt(i+1);
            int[] p1 = findPos(a);
            int[] p2 = findPos(b);

            if(p1[0]==p2[0]) { // same row
                cipher.append(matrix[p1[0]][(p1[1]+1)%5]);
                cipher.append(matrix[p2[0]][(p2[1]+1)%5]);
            }
            else if(p1[1]==p2[1]) { // same column
                cipher.append(matrix[(p1[0]+1)%5][p1[1]]);
                cipher.append(matrix[(p2[0]+1)%5][p2[1]]);
            }
            else { // rectangle rule
                cipher.append(matrix[p1[0]][p2[1]]);
                cipher.append(matrix[p2[0]][p1[1]]);
            }
        }
        return cipher.toString();
    }

    // Decrypt
    public static String decrypt(String text) {
        StringBuilder plain = new StringBuilder();

        for(int i=0;i<text.length();i+=2) {
            char a=text.charAt(i), b=text.charAt(i+1);
            int[] p1=findPos(a);
            int[] p2=findPos(b);

            if(p1[0]==p2[0]) {
                plain.append(matrix[p1[0]][(p1[1]+4)%5]);
                plain.append(matrix[p2[0]][(p2[1]+4)%5]);
            }
            else if(p1[1]==p2[1]) {
                plain.append(matrix[(p1[0]+4)%5][p1[1]]);
                plain.append(matrix[(p2[0]+4)%5][p2[1]]);
            }
            else {
                plain.append(matrix[p1[0]][p2[1]]);
                plain.append(matrix[p2[0]][p1[1]]);
            }
        }
        return plain.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        System.out.print("Enter plaintext: ");
        String text = sc.nextLine();

        generateMatrix(key);

        String enc = encrypt(text);
        System.out.println("Encrypted: " + enc);

        String dec = decrypt(enc);
        System.out.println("Decrypted: " + dec);

        sc.close();
    }
}
