package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/21
 */
public class Wordbook {
    public static void main(String[] args) {
        String str = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        //将str与str2比较的结果输出
        System.out.println(str + "compareTo" + str2 + ":" + str.compareTo(str2));
        //将str与str3比较的结果输出
        System.out.println(str + "compareTo" + str3 + ":" + str.compareTo(str3));
    }
}
