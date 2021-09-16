package train4;

/**
 * Description:while条件下计算阶乘倒数的和
 *
 * @author Xiongjie
 * @data Created on 2021/9/6
 */
public class train4_3 {
    public static void main(String[] args) {
        //定义变量
        double sum = 0;
        int i = 1;
        int j;
        int k;
        double d;
        while (i <= 20) {
            j = 1;
            k = 1;
            while (j <= i) {
                k = k * j;
                j++;
            }
            d = 1.0 / k;
            sum += d;
            i++;
        }
        System.out.println(sum);
    }
}
