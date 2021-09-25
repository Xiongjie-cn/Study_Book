package unite5;

import java.util.Date;

/**
 * Description:
 *
 * @author Xiongjie
 * @data Created on 2021/9/25
 */
public class Eval {
    public static void main(String[] args) {
        //创建Date对象date
        Date date = new Date();
        //将date进行格式化
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        //输出信息
        System.out.println("今年是：" + year + "年");
        System.out.println("现在是：" + month);
        System.out.println("今天是：" + day + "号");
    }
}
