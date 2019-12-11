/*
四则运算 ：
    加：+
    减：-
    乘：*
    除：/

    取模：%

 */
public class Demo05Operator {
    public static void main(String[] args) {
        // 加法
        System.out.println(123 + 10); // 133
        // 减法
        int a = 10;
        System.out.println(a - 11); // -1
        // 乘法
        int b = 50;
        System.out.println(b * a); // 500
        // 除法
        // 被除数 / 除数 = 商 ... 余数
        System.out.println(a / 3); // 3
        // 取模
        System.out.println(a % 3); // 1

        // int + double ——> double + double ——> double 如果数据类型不一样，会自动变成一样再进行运算
        double result1 = b + 3.5;
        System.out.println(result1); // 53.5
    }
}