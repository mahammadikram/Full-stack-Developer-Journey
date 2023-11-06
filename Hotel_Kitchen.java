package HotelDao;

import java.util.Scanner;

public class Hotel_Kitchen implements Hotel_Interface {
    public void menu(Custumer c) {
        for(int i=0;i<6;i++) {
        System.out.println(i+1+"." +" "+c.Items[i]+"--RS."+ c.getPrice(i)+"/-");
        }
        System.out.println("Select 7 for bill");
    }
    public float bill(Custumer c) {
        System.out.println("Item                          Quantity          Price           Total") ; 
        System.out.println("==================================================================") ;
        for(int i=0;i<6;i++) {
         if(c.getQuantity(i)>0)
        System.out.println(i+1+"."+c.Items[i]+"                "+c.getQuantity(i)+"            "+ c.getPrice(i)+"         "+c.getQuantity(i)*c.getPrice(i)) ;
        }
    System.out.println("===================================================================") ;
    System.out.println("GST 18%");
    float total=0;
    for(int i=0;i<6;i++){
    total=total+(c.getQuantity(i)* c.getPrice(i));
    }
    System.out.println("Total="+total);
    System.out.println("After the GST ");
    float bill=total+(total*0.18f);
    System.out.println(" Total Bill="+bill) ;
    return bill;
}
public void takeorder(Custumer c,int p) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of plates");
    try {
        int q=sc.nextInt();
        if(q<1) {
        throw new NoPlatesException();
        }
        else {
        int z=c.getQuantity(p-1);
        z=z+q;
        c.setQuantity(p-1, z);
        }
    }
    catch(NoPlatesException e) {
    System.out.println(e.getMessage());
    }
}
}
