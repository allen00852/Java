/**
 * Day02IfExercise
 */
public class Day02IfExercise {

    public static void main(String[] args) {
        // 指定考试成绩,判断成绩的等级
        // 90-100 优秀
        // 80-89 好
        // 70-79 良
        // 60-69 及格
        // 60以下 不及格
        int score = 200;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("良");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}