package train4;

/**
 * Description:打印菱形
 *
 * @author Xiongjie
 * @data Created on 2021/9/6
 */
public class train4_2 {
    public static void main(String[] args) {
        //定义变量
        int size = 3;
        //打印上半部分
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" " );
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印下半部分
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
