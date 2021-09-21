package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/21
 */
public class Division {
    public static void main(String[] args) {
        //创建字符串
        String str = "192.168.0.1";
        //按照“.”进行分割，使用转义字符“\\.”
        String[] firstArray = str.split("\\.");
        //按照“.”进行两次分割，使用转义字符“\\.”
        String[] secondArray = str.split("\\.", 2);
        //输出str原值
        System.out.println("str原值为：[" + str + "]");
        //输出全部分割的结果
        System.out.print("全部分割的结果：");
        for (String a : firstArray) {
            System.out.print("[" + a + "]");
        }
        System.out.println();//换行
        //输出两次分割的结果
        System.out.print("两次分割的结果：");
        for (String a : secondArray) {
            System.out.print("[" + a + "]");
        }
        System.out.println();
    }
}
