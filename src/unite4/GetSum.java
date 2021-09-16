package unite4;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/4
 */
public class GetSum {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            sum = sum + x;
            x++;
        }
        System.out.println(sum);
    }
}
