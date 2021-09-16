package unite3;

public class Number {                                          //class
    public static void main(String[] args){                    //main
        byte mybyte = 124;                                     //byte  8(1bit)
        short myshort = 32564;                                 //short 16(2bit)
        int myint = 45784612;                                  //int   32(4bit)
        long mylong = 46789451;                                //long  64(8bit)  >max(int)  *****(L/1)
        long result = mybyte + myshort + myint + mylong;
        System.out.println("结果为：" + result);
        int maxint = 2147483647;
        long result2 = maxint + 100;
        System.out.println("检验" + result2);                   //??????
    }
}
