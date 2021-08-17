import javax.swing.text.AttributeSet;
import java.util.Locale;
import java.util.Scanner;

public class BTbuoi7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Chuỗi có các chữ hoa là: " + uppercase(str));

        System.out.println("Số chữ của chuỗi là: " + nonNumber(str));

        System.out.println("Số lượng ký tự của chuỗi: " + countChar(str));

        countvoweAndconsonant(str);

        System.out.println("nhập ký tự muốn thay đổi trong chuỗi: ");
        String oldstring = sc.nextLine();
        System.out.println("nhập ký tự thay đổi trong chuỗi: ");
        String newstring = sc.nextLine();
        replaceString(str, oldstring,newstring);

    }

    //in ra ký tự hoa
    public static String uppercase(String s) {
        String str = "";
        for (int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                str = str + s.charAt(i);
            }
        }
        return str;
    }

    //in ra ký tự không phải số
    public static String nonNumber(String s) {
        String str = "";
        for (int i = 0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                continue;
            }
            str = str + s.charAt(i);
        }
        return str;
    }

    //đếm từ trong chuỗi
    public static int countChar(String s) {
        String[] str = s.split("\\s++");
        return str.length;
    }

    //thay thế chuỗi con trong 1 chuỗi đã cho
    public static void replaceString(String s, String oldchars, String newchars) {

                System.out.println("thay thế " + oldchars + "thành " + newchars + " : " + s.replace(oldchars, newchars));
    }

    //đếm số lượng nguyên / phụ âm
    public static void countvoweAndconsonant(String s) {
        int vowel = 0;
        int consonant = 0;
        s = s.toLowerCase();
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i') {
                vowel++;
            }
            else if (c >= 'a' && c <= 'z'){
                consonant++;
            }
        }
        System.out.println("vowel: " + String.valueOf(vowel));
        System.out.println("consonant: " + String.valueOf(consonant));
    }


}
