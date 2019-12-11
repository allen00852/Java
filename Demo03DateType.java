/*
  自动类型转换(隐式)
    1. 特点：代码不需要进行特殊处理,自动完成.
    2. 规则: 数据范围从小到大.
 */
public class Demo03DateType {

    public static void main(String[] args) {
        System.out.println(1024); // 这是一个整数,默认 int 类型
        System.out.println(1.024); // 这是一个浮点数,默认 double 类型

        // 左边是long类型 ,右边是int类型,左右不一样.
        // 一个等号代表赋值,将有右边的int常量,赋值给左边的long常量进行储存.
        // int--->long ,符合数据范围从小到大的要求,发生了自动转换.
        long num = 100;
        System.out.println(num); // 100

        // 左边是double类型 ,右边是float类型,左右不一样.
        // float ---> double, 符合从小到大的规则,发生自动转换.
        double num1 = 2.5F;
        System.out.println(num1); // 2.5

        // 左边是float类型,右边是long类型,左右不一样.
        // long ---> float, 符合从小到大规则,发生自动转换.
        float num3 = 30L;
        System.out.println(num3); // 30.0
    }
}