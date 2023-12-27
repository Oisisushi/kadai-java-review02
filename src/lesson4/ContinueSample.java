package lesson4;

public class ContinueSample {

    public static void main(String[] args) {
        int[] targetArray = { 37, 55, 64, 57, 98, 100, 47, 23, 71, 69 };
        //カウント用変数をfor文の外でも使う場合は先に宣言すること
        int count = 0;

        for(int value : targetArray) {
            if (value < 60) {
                continue;
            }
            count++;
        }
        System.out.println("60点以上の人は" + count + "人です");

    }

}
