/**
 * 变量的基本使用
 */
public class Day01bianliang {

    public static void main(String[] args) {
        // 整数类型
        int num1;
        num1 = 10;
        System.out.println(num1); // 10
        // 重新赋值
        num1 = 20;
        System.out.println(num1); // 20

        // 字节型 取值范围:-128~127 超出取值范围报错
        byte num2 = 30;
        System.out.println(num2); // 30

        // 短整型 取值范围:-32768~32767
        short num3 = 35;
        System.out.println(num3); // 35

        // 长整型 取值范围: -30e~30e
        long num4 = -30000000000000000L;
        System.out.println(num4); // 30000000000000000

        // 单精度浮点数 取值范围:1.4013E-45~3.4028E+38
        float num5 = 1.131492036478414253225481123F;
        System.out.println(num5); // 1.131492

        // 双精度浮点数 取值范围:4.9E-324~1.7977E+308
        double num6 = 5.13215456465784321;
        System.out.println(num6); // 5.132154564657843

        // 字符型 取值范围:0~60000 必须加上'值'
        char num7 = '1';
        char num75 = '中';
        System.out.println(num7); // 1
        System.out.println(num75); // 中

        // 布尔型 取值范围true~false
        boolean num8 = true;
        System.out.println(num8); // true
        num8 = false;
        System.out.println(num8); // false
 
        boolean var1 = num8;
        System.out.println(var1); // false
    }
}