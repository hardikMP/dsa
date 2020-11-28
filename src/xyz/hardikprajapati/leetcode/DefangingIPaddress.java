package xyz.hardikprajapati.leetcode;

/**
 * Created by hardikprajapati on 28/11/20
 */
public class DefangingIPaddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
//        String result = "";
//        for (int i = 0; i < address.length(); i++) {
//            char c = address.charAt(i);
//            result += c == '.' ? "[.]" : c;
//        }
//        return result;
        return address.replace(".", "[.]");
    }
}
