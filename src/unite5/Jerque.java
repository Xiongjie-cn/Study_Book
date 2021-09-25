package unite5;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class Jerque {
    public static void main(String[] args) {
        //创建String对象
        String str = "";
        //计算循环操作耗时
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        //输出耗时
        System.out.println("String消耗时间：" + time);
        //创建StringBuilder对象
        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder = builder.append(i);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("StringBuilder消耗时间：" + time);
    }
}
