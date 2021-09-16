package unite3;

public class Val {
    static int times = 3;
    public static void main(String[] args){
        int times=4;
        System.out.println("times的值为：" + times);   //同名时全局变量失效
    }
}
