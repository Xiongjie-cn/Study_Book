package unite3;

public class Conver {
    public static void main(String[] args){
        //byte数据
        byte mybyte = 127;
        //定义int数据类型myint
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println("byte型与float型数据进行运算结果为：" + (mybyte + myfloat));
        System.out.println("byte型与int型数据进行运算结果为：" + (mybyte * myint));
        System.out.println("byte型与char型数据进行运算结果为：" + (mybyte / mychar));
        System.out.println("double型与char型数据进行运算结果为：" + (mydouble + mychar));
    }
}
