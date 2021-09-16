package unite4;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/6
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
