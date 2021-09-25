package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class General {
    public static void main(String[] args) {
        String str = String.format("%d", 400 / 2);
        String str2 = String.format("%b", 3 > 5);
        String str3 = String.format("%x", 200);
        //输出信息
        System.out.println("400 的一半是：" + str);
        System.out.println("3>5 正确吗：" + str2);
        System.out.println("200 的十六进制数是：" + str3);
    }
}
