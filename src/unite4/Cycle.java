package unite4;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/4
 */
public class Cycle {
    public static void main(String[] args) {
        int a = 100;
        while (a == 60) {
            System.out.println("ok1");
            a--;
        }
        int b = 61;
        do {
            System.out.println("ok2");
            b--;
        } while (b == 60);
    }
}
