public class ch5_10 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            if(i%3==0)                  //判斷i%3是否為0
                break;
            System.out.println("i="+i); //印出i的值
        }
        System.out.println("when loop interruped, i="+i);    
    }
    
}
