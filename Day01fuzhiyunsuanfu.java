/*
赋值运算符
    基本运算符
        int a = 30;
    符合运算符
        +=  a += 2  相当于  a = a + 2
        -=  a -= 2  相当于  a = a - 2
        *=  a *= 2  相当于  a = a * 2
        /=  a /= 2  相当于  a = a / 2
        %=  a %= 2  相当于  a = a % 2
*/
public class Day01fuzhiyunsuanfu {

    public static void main(String[] args) {
        int a = 10;
        // 相当于 a = 10 + 6
        System.out.println(a += 6); // 16

        int b = 100;
        // 相当于 b = 100 % 33
        System.out.println(b %= 33); // 1

        byte c = 30;
        c += 3;
        // 这是语言帮我们自动做的强制转换
        // c = byte + int
        // c = int + int
        // c = int
        // c = （byte）int
        System.out.println(c);
    }
}