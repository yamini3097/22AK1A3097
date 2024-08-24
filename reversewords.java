public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World! This is Java.";
        String reversedString = reverseWords(input);
        System.out.println(reversedString);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }

        return reversedString.toString().trim();
    }
}
