/*
  Day02CycleDifference

  三种循环的差异
    1. 如果条件为满足,那么for跟while循环将会执行0次,但是do-while至少会执行一次.
    2. for循环的变量在小括号当中定义,只有在for循环内部使用.while循环跟do-while循环初始化语句本来就在外面,所以出来循环之后还可以继续使用.
 */
public class Day02CycleDifference {

    public static void main(String[] args) {
        for (int i = 1; i < 0; i++) {
            System.out.println("h");
        }
        System.out.println("----------");
        int i = 1;
        do {
            System.out.println("y");
        } while (i < 0);
    }
}