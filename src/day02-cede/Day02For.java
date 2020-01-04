/*
 * Day02For
 * 
 * 1. 初始化语句：在循环开始最初执行，而且之做唯一一次。
 * 2. 条件判断：如果成立，则循环继续，如果不成立，则循环推出。
 * 3. 循环体：重复要做的事情内容，若干行语句。
 * 4. 步行语句：每次循环之后都要进行的扫尾工做，每次循环结束后都要执行一次。
 */
public class Day02For {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("wo!" + i);
        }
        System.out.println("程序停止");
    }
}