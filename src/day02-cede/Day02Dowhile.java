/*
 * Day02Dowhile
 * 
 * do-while 标准格式
 * do {
 *   循环体;
 * }while (条件判断);
 * 
 * do-while 扩展格式
 * 
 * 初始化表达式
 * do {
 *   循环体;
 *   步进语句;
 * }while (条件判断);
 */
public class Day02Dowhile {

    public static void main(String[] args) {
        // for循环例子
        for (int i = 1; i <= 10; i++) {
            System.out.println("for" + i);
        }
        System.out.println("-------------");
        // do-while
        int i = 1; // 初始化表达式
        do {
            System.out.println("for" + i); // 循环体
            i++; // 步进语句
        } while (i <= 10); // 条件判断
    }
}