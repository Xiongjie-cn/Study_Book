package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/16
 */
public class StartOrEnd {
    public static void main(String[] args) {
        String num1 = "22045612";
        String num2 = "21304578";
        //判断字符串num1是否以“22”开头
        boolean b = num1.startsWith("22");
        //判断字符串num2是否以“78”结尾
        boolean b2 = num2.endsWith("78");
        System.out.println("字符串num1是以‘22’开始的吗？" + b);
        System.out.println("字符串num2是以‘78’结束的吗？" + b2);
    }
}
