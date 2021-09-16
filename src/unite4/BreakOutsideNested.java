package unite4;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/6
 */
public class BreakOutsideNested {
    public static void main(String[] args) {
        Loop:for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {

                if (j == 4) {
                    break Loop;
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
