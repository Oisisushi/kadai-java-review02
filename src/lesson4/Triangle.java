package lesson4;

public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        int c = 5;

        if(a == b && b == c) {
            System.out.println("正三角形");
        } else if(a == b || a == c || b == c) {
            System.out.println("二等辺三角形");
        } else {
            System.out.println("三角形");
        }

    }

}
