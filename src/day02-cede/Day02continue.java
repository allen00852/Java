/*
   Day02continue
   continue 关键字，一旦执行，立刻跳过当前循环神域内容，马上开始下一次循环。
 */
public class Day02continue {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 需求:把第四层跳过
            if (i == 4) {
                continue; // 跳过之后立马执行下一次循环
            }
            System.out.println(i + "层到了!");
        }
    }
}