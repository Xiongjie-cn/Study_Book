package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/7
 */
public class Text {
    public static void main(String[] args) {
        String str = "We are students";
        int size = str.lastIndexOf("");
        System.out.println("空字符在字符串str中的索引位置是：" + size);
        System.out.println("字符串str的长度是：" + str.length());
    }
}
