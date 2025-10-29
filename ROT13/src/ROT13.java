public class ROT13 {
    public static String encrypt(String text) {
        return transform(text);
    }

    public static String decrypt(String text) {
        return transform(text);
    }

    private static String transform(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char shifted = (char) (((c - 'a' + 13) % 26) + 'a');
                result.append(shifted);
            } else if (c >= 'A' && c <= 'Z') {
                char shifted = (char) (((c - 'A' + 13) % 26) + 'A');
                result.append(shifted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
