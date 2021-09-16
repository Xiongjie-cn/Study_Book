package unite4;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/4
 */
public class Circulate {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("2到100之间的所有偶数之和为：" + sum);
    }
}
