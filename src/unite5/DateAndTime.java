package unite5;

import java.util.Date;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class DateAndTime {
    public static void main(String[] args) {
        //创建Date对象date
        Date date = new Date();
        //将date格式化
        String time = String.format("%tc", date);
        String form = String.format("%tF", date);
        //输出信息
        System.out.println("全部的时间信息是：" + time);
        System.out.println("年-月-日格式:" + form);
    }
}
