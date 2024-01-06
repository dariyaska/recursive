public class NumberPrinter {

    public static void printNumbers(int a, int b) {
        if (a < b) {
            printAscending(a, b);
        } else {
            printDescending(a, b);
        }
    }

    private static void printAscending(int current, int target) {
        if (current <= target) {
            System.out.print(current + " ");
            printAscending(current + 1, target);
        }
    }

    private static void printDescending(int current, int target) {
        if (current >= target) {
            System.out.print(current + " ");
            printDescending(current - 1, target);
        }
    }
}
