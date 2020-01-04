/*
 * Day02Switch
 * 
 * 1. 多个case后面的数据不能重复
 * 2. switch后面小括号当中只能是以下数据类型:
 *      基本数据类型: byte/short/char/int
 *      引用数据类型: string字符串/enum枚举
 * 3. switch语句格式可以很灵活:前后顺序可以颠倒,而且break语句还可以省略.
 *      break语句不写则穿透到下个语句.
 */
public class Day02Switch {

    public static void main(String[] args) {
        // switch小案例,判定星期
        int num = 20;
        switch (num) {
        case 1:
            System.out.println("星期一");
            break;
        case 2:
            System.out.println("星期二");
            break;
        case 3:
            System.out.println("星期三");
            break;
        case 4:
            System.out.println("星期四");
            break;
        case 5:
            System.out.println("星期五");
            break;
        case 6:
            System.out.println("星期六");
            break;
        case 7:
            System.out.println("星期日");
            break;
        default:
            System.out.println("数据不存在");
            break;
        }

    }
}