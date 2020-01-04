/**
 * Day02IfElse
 */
public class Day02IfElse {

    public static void main(String[] args) {
        // 条件：买一个萝卜，金额在1块，如果超出就不买。
        int amount = 2;
        if (amount <= 1) {
            System.out.println("购买到了一根很好的胡萝卜价格为：" + amount);
        } else {
            System.out.println("买不到萝卜价格为：" + amount);
        }

        // 判断偶数奇数
        if (amount % 2 == 0) { // 如果除于2余数为0 则是偶数。
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}