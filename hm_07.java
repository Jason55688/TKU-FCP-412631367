import java.util.*;
public class hm_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("請輸入圓的半徑");
        int r = scn.nextInt() ;
        System.out.println("圓面積="+(r*r)*(3.14));
        scn.close() ;
    }
    
}
