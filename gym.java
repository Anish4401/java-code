import java.util.*;
public class gym{
public static void main (String a[]){
Scanner sc =new Scanner(System.in);
int cash=sc.nextInt();
if
(cash ==400||  cash<400  ){
System.out.println("cannot get any subscription");
System.out.println( "can get 1 subscription");
}
else if
(cash >400 && cash<=600){
System.out.println("can get 3 subscription");
}
else
System.out.println("can get all subscription");
}
}
