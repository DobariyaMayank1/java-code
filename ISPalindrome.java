public class ISPalindrome {

    public static boolean ISPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println(str + " is not palindrome. ");
                return false;
            }
        }
        System.out.println(str + " is palindrome. ");
        return true;
    }

    public static void main(String[] args) {
        String str = "mayank";
        ISPalindrome(str);
        // System.out.println();
    }
}
