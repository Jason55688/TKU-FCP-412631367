import java.util.* ;
public class hm_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;

        System.out.println("請輸入您的姓名");
        String name = scn.next() ;
        System.out.println("您的年齡?");
        int age = scn.nextInt() ;
        System.out.println("您所居住的城市?");
        String city = scn.next() ;
        System.out.println("姓名: "+name+" 年齡: "+age+" 城市: "+city);
        scn.close() ;
    }
}
