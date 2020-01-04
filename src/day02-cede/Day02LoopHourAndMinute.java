/**
 * Day02LoopHourAndMinute
 */
public class Day02LoopHourAndMinute {

    public static void main(String[] args) {
        // 需求:循环一天24小时 有多少分钟 多少秒
        // 一天24小时
        // 一小时60分钟
        // 一分钟60秒

        for (int i = 0; i < 24; i++) {

            for (int j = 0; j < 60; j++) {
                System.out.println(i + "时" + j + "分");

            }

        }
    }
}