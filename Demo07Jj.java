/* 
 自增运算符 ++
 自减运算符 --

 使用方式：
    1. 单独使用：不与其他任何操作混合，自己独立成为一个步骤。
    2. 混合使用：和其他操作混合。

 使用区别：
    A. 在单独使用的时候,前++和后++没有任何区别。
    B. 在混合使用的时候：
        a. 如果是【前++】，那么变量【立马+1】，然后拿到结果使用。   【先加后用】
        b. 如果是【后++】，那么首先使用变量本身，【再让其+1】。     【先用后加】
 */
public class Demo07Jj {

    public static void main(String[] args) {
        System.out.println("————单独使用————");
        int num = 10;
        System.out.println(num); // 10
        ++num; // 前++
        System.out.println(num); // 11
        num++; // 后++
        System.out.println(num); // 12
        System.out.println("————前++混合使用————");
        int num1 = 10;
        System.err.println(++num1); // 11
        System.out.println(num1); // 11
        System.out.println("————后++混合使用————");
        int num2 = 20;
        System.out.println(num2++); // 20
        System.out.println(num2); // 21
        System.out.println("————前--混合使用————");
        int num3 = 30;
        System.out.println(--num3); // 29
        System.err.println(num3); // 29
        System.out.println("————后--混合使用————");
        System.out.println(num3--); // 29
        System.out.println(num3); // 28

        System.out.println("————小例子————");
        int num4 = 20;
        int num5 = 30;
        System.out.println(++num4 + num5--); // 51
        System.out.println(num4); // 21
        System.out.println(num5); // 29

    }
}