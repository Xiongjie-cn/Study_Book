package train4;

/**
 * Description:判断奇偶数
 *
 * @author Xiongjie
 * @data Created on 2021/9/6
 */
public class train4_1 {
    public static void main(String[] args) {
        int x = 102;
        int yu;
        yu = x % 2;
        if (yu == 0) {
            System.out.println("x为偶数");
        } else {
            System.out.println("x为奇数");
        }
    }
}
