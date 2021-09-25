package unite5;

import java.util.Date;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class GetDate {
    public static void main(String[] args) {
        //创建Date对象
        Date date = new Date();
        //将date进行格式化
        String hour = String.format("%tH", date);
        String minute = String.format("%tM", date);
        String second = String.format("%tS", date);
        //输出信息
        System.out.println("现在是：" + hour + "时" + minute + "分" + second + "秒");
    }
}
