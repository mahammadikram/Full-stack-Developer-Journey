package HotelDao;
import java.util.*;
public class Counter {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Custumer c1=new Custumer();
Hotel_fact hf=new Hotel_fact();
Hotel_Interface hi=hf.createInstance();
System.out.println("=======================Welcome=======================");
System.out.println("enter the choice");
hi.menu(c1);
int choice=sc.nextInt();
while(choice<7) {
hi.takeorder(c1, choice);
hi.menu(c1);
choice=sc.nextInt();
}
float total=hi.bill(c1);
int Total=(int)total;
int bil= c1.requestBill((int)total);
System.out.println("Your Bill is Ready");
//int bil= c1.requestBill((int)total);
if(bil==Total){
    System.out.println("Thank you Visit Again!");
}
else{
    System.out.println("Please Pay the Bill ");
    hi.bill(c1);
    bil=c1.requestBill(bil);
}
}
}