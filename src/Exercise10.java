/**
 * Created by noellemachin on 3/10/16.
 */
public class Exercise10 {
    public static void main (String[] args) throws Exception {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        if (isPalindrome(palindrome) && !isPalindrome(nonPalindrome)) {
            System.out.println("IT WORKS");
        }
        else {
            throw new Exception("Fail");
        }
    } // write method below to make this work
    public static boolean isPalindrome(String s) {
        //return s.equals(new StringBuilder(s).reverse().toString());    METHOD ONE

//        int i = 0;
//        while (true) {
//            if(i == s.length()/2) {
//                return true;
//            }
//            else if (s.charAt(i) == s.charAt(s.length()-i-1)) {        METHOD TWO
//                i++;
//            }
//            else {
//                return false;
//            }




//        int len = s.length();
//        for (int j = 0; j < len - 1; j++) {
//            if (s.charAt(j) != s.charAt(len-j-1)) {                   METHOD THREE
//                return false;
//            }
//        }
//        return true;
    }
}
