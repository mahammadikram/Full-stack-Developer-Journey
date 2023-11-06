package HotelDao;

import java.util.Scanner;

public  class Custumer {
    static  int  order[][]=new int[6][2];
     static String  Items[]=new String[]{"Chicken Burger","Chicken Lolipop(6-pc)","Chicken wings(4-pc)",
     "Chicken Roll& Pepsi","Chicken Bucket(4-leg,2-wings,2-Pepsi) ","Peri Peri (5-leg & 2-Dips)"} ;    
    Custumer(){ 
        order[0][0]=125;
        order[1][0]=289;
        order[2][0]=180;
        order[3][0]=120;
        order[4][0]=515;
        order[5][0]=630;
    }
        void setQuantity(int item,int price) {
        order[item][1]=price;
        }
        int getPrice(int item) {
        return order[item][0];
        }
        int getQuantity(int item) {
        return order[item][1];
        }
        public int requestBill(int Bill){
            System.out.println("Please Pay Your Bill "+Bill);
            Scanner sc=new Scanner(System.in);
            int bill=sc.nextInt();
            return bill;
        }
    }

