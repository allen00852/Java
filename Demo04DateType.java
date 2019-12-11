/*
    强制类型转换(显式)
        1. 特点：代码需要进行特殊格式处理，不能自动完成。
        2. 格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据；
    注意事项：
        1. 强制类型转换一般不推荐是使用，因为有可能发生精度损失、数据溢出。
        2. byte/short/char这三种类型可以发生数学运算，例如加法"+"。
        3. byte/short/char这三种类型在运算时，都会被提升为int类型，然后再计算。
        4. 布尔类型不能发生数据类型转换
 */
public class Demo04DateType {

    public static void main(String[] args) {
        // 左边是int类型，右边是long类型，不一样。
        // long ---> int，不是从小到大，不能发生自动转换。
        // 格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据；
        int num = (int) 100L;
        System.out.println(num); // 100

        // 数据溢出
        // long类型强制转换int类型，在不超过int类型的数据范围下转换可以显示正常，但如果超出int数据类型强制转换会导致。
        int num1 = (int) 6000000000L;
        System.out.println(num1); // 1705032704

        // 精度损失
        // double类型强制转换为int类型，会舍去小数点后面的数字。
        int num2 = (int) 1.99;
        System.out.println(num2); // 1

        byte num3 = 30;
        byte num4 = 40;
        // byte = byte ---> int + int,接受值必须为int类型
        int res1 = num3 + num4;
        System.out.println(res1); // 70

        char num5 = 'S';
        System.out.println(num5 + 1); // 84 大写字母S被当做83处理

        char num6 = '沙';
        System.out.println(num6 + 1); // 27802

        short num7 = 90;
        // 让接受的值是shirt类型，进行强制转换
        // 格式：shoet 接收变量名 = （类型）<--（进行运算）
        short res2 = (short) (num7 + num4);
        System.err.println(res2); // 130

    }
}