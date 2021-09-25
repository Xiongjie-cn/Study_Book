package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class Judge {
    public static void main(String[] args) {
        //定义要匹配的E-mail地址的正则表达式
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        //定义要验证的字符串
        String str1 = "aaa@";
        String str2 = "aaaaaa";
        String str3 = "824764845@qq.com";
        //判断字符串变量是否与正则表达式匹配
        String[] str = new String[]{str1, str2, str3};
        for (int i = 0; i < 3; i++) {
            if (str[i].matches(regex)) {
                System.out.println(str[i] + "是一个合法的E-mail地址格式");
            }
        }
    }
}
