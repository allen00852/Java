/*
  D02break

  break关键字常用的有两种
    1.可以在switch语句中，一旦执行，整个switch语句立刻执行。
    2.可以在循环语句中，一旦使用，整个循环语句，打断结束。

  循环的选择：
    凡是次数确定的场景多用for循环，否则用while循环。
 */
public class D02break {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 只需要输出到4
            if (i == 4) {
                break; // 打断
            }
            System.out.println(i);

        }
    }
}