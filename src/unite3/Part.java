package unite3;

public class Part {
    //声明全局常量PI，全局变量应直接赋值
    static final double PI = 3.14;
    static int age = 23;
    public static void main(String[] args){
        final int number;
        number = 1235;
        age = 22;
        //number = 1234   错误！常量只能赋值一次
        System.out.println("常量PI的值为：" + PI);
        System.out.println("赋值后的number的值为：" + number);
        System.out.println("int型变量age的值为：" + age);
    }
}
