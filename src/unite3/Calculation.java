package unite3;

public class Calculation {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        boolean result = ((a > b) && (a != b));            //与 &&(短路)  &(非短路)
        boolean result2 = ((a > b) || (a != b));           //或 ||     ;   非 !
        System.out.println(result);
        System.out.println(result2);
    }
}
