/**
 * Day02method
 */
public class Day02method {

    public static void main(String[] args) {
        // 调用吃的方法
        kehu();
        // 调用厨师
        chushi();
        // 调用服务员
        fuwuyuan();
    }

    // 厨师的方法
    public static void chushi() {
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }

    // 服务员的方法
    public static void fuwuyuan() {
        System.out.println("上菜");
    }

    // 客户的方法
    public static void kehu() {
        System.out.println("吃");
    }
}