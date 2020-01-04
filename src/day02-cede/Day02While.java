/*
 * Day02While
 * 
 * 标准格式
 * while (条件判断) {
 *   循环体;
 * }
 * 
 * 扩展格式
 * while (条件判断) {
 *   循环体;
 *   步进语句;
 * }
 */
public class Day02While {

    public static void main(String[] args) {
        // for循环
        for (int i = 1; i <= 10; i++) {
            System.out.println("for循环" + i);
        }

        System.out.println("-----------");

        // while循环
        int y = 1;
        while (y <= 10) {
            System.out.println("while循环" + y);
            y++;
        }

    }
}