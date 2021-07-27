public class LastDigitChecker {
    public static boolean isValid(int num) {
        return (num >= 10) && (num <= 1000);
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid (a) && isValid (b) && isValid (c )) {
            return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
        }
        return false;
    }
}