package BankDAO;

//import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Custumer c1=new Custumer("ikram", "SBI", 1234,517214 );
        Custumer c2=new Custumer("Asad", "SBI", 1254,517215 );
        Custumer  c3=new Custumer("suhel", "ICIC", 7654, 570214);
        Custumer c4=new Custumer("abid", "canera Bank", 123, 521179);
        BankFac bf=new BankFac();
        BankInterface bi =bf.creaInstance();
        bi.addCustumer(c1);
        bi.addCustumer(c2);
        bi.addCustumer(c3);
        bi.addCustumer(c4);
        System.out.println("Enter the pin");
        int PIN=sc.nextInt();
        if(bi.CheckPIN(PIN)){
        System.out.println("Enter the  choice\n 1.Deposite\n 2.Withdraw \n 3.CheckBal \b 4.exit \n");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("enter the deposite amount ");
            int amt=sc.nextInt();
            bi.DepositeBal(PIN, amt);
            break;
            case 2:
            System.out.println("Enter the amount to be withdraw ");
            int w=sc.nextInt();
             bi.withdrawBal(PIN, w);
            break;
            case 3:
             bi.CheckBal(PIN);
             break;
             case 4 :
             System.err.println(" Your transaction is successfull! ..Thank you visit again");
             break;
            default :
            System.out.println("entered wrong pin and option");
        }
    }
    else {
        System.out.println("Entered wrong pin ");
    }
    }
}