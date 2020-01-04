/**
 * Day02HundrredSum
 */
public class Day02HundrredSum {

    public static void main(String[] args) {
        // 求1-100之间的偶数和
        int sum = 0;
        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // sum += i;
        // }
        // }
        // System.out.println(sum); // 2550
        System.out.println("-----------------------");
        int i = 1;
        // while (i <= 100) {
        // if (i % 2 == 0) {
        // sum += i;
        // }
        // i++;
        // }
        // System.out.println(sum); // 2550

        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);
        System.out.println(sum); // 2550

    }
}