package train5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class Train1 {
    public static void main(String[] args) {
        //定义Scanner对象sc
        Scanner sc = new Scanner(System.in);
        //显示交互信息
        System.out.print("请输入要进行大小写转换的字符串：");
        //定义String对象str
        String str = sc.next();
        //输出信息
        System.out.println("小写化处理后的结果为：" + str.toLowerCase(Locale.ROOT));
        System.out.println("大写化处理后的结果为：" + str.toUpperCase(Locale.ROOT));
    }
}
