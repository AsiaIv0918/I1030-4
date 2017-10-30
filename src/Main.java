import java.util.*;
public class Main {
//標準體重
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int h,x;
        float w;
        h=in.nextInt();
        x=in.nextInt();
//如果不指定小數資料型態則為double
        if(x==1){
            w=(h-80)*0.7f;
            System.out.printf("%.1f",w);
        }

        if(x==2){
            w=(h-70)*0.6f;
            System.out.printf("%.1f",w);
        }
        /*
        if(b==1)
         System.out.printf("%.1f,(a-80)*0.7")
         else
         System.out.printf("%.1f,(a-70)*0.6")

        */

    }
}
