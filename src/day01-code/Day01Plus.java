/*
 字符串链接
 String类型与任何类型相加都会变成String类型。
 ()优先于一切，会先计算小括号里面的再与其他计算。
 */
public class Day01Plus {

    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1); // hello
        String str2 = "world";
        System.out.println(str1 + str2); // helloworld
        System.out.println(str2 + 20); // world20
        // 优先级
        // str1 + 20 + 30
        // String + int + int
        // String + int = String + int
        // String
        System.out.println(str1 + 20 + 30); // hello2030
        System.out.println(str1 + (20 + 30)); // hello50
    }
}