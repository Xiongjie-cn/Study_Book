package unite5;

import java.util.Locale;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/21
 */
public class UpAndLower {
    public static void main(String[] args) {
        String str = new String("abc DEF");
        //转换大小写字母
        String newstr = str.toLowerCase(Locale.ROOT);
        String newstr2 = str.toUpperCase(Locale.ROOT);
        System.out.println(newstr);
        System.out.println(newstr2);
    }
}
