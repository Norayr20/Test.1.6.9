public class Palindrome {
    public static void main(String[] args) {
        String text = "Was it a cat I saw?";
        System.out.println(isPalindrome(text));

        text = "A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "");
        cleanedText = cleanedText.toLowerCase();
        int length = cleanedText.length();
        for (int a = 0; a < length / 2; a++) {
            if (cleanedText.charAt(a) != cleanedText.charAt(length - a - 1)) {
                return false;
            }
        }
        return true;
    }
}
