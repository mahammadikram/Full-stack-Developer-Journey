package BankDAO;
import java.util.ArrayList;
import java.util.List;
public class BankImpli implements BankInterface {
    int pass=1234;
    int bal=2000;
    public java.util.List<Custumer> accounts=new ArrayList();
    public void  addCustumer(Custumer c){
        accounts.add(c);
    }
    public void searchpin(){    
    }
    public void  DepositeBal(int pin,int price){
        try{
        if(price<1){
            throw new MinDeposit();
        }

    else{
        for(Custumer S:accounts){
            if(pin==S.getPin()){
                bal+=price;
            System.out.println("Your amunt has been Deposited Successfully");
            }
        }
    }
    }
    catch( MinDeposit d){
        System.out.println(d.minDeposite());
    }
    }
    public void withdrawBal(int pin ,int amt){
        System.out.println("you entered into the Withdrawl method");
        try{
        if(amt>1000){
            throw new Maxwithdrawl();
        }
        else  if(amt<100){
            throw  new Minwithdrawl();
        }

         else{ // s=null;
        for(Custumer S:accounts){
            if(pin==S.getPin()){
                bal-=amt;
            }
            System.out.println("Your Transactions Done Successfully");
        }
    }
    }
    catch(Maxwithdrawl m){
        System.out.println(m.maxwithDraw());
    }
    catch(Minwithdrawl m){
        System.out.println(m.minWithdraw());
    }
    }          
        public  String CheckBal(int pin){
            for(Custumer S:accounts){
            if(pin==S.getPin()){
                    System.out.println("your pin matches successfully");
                    System.out.println("your balence= "+bal);
                    break;
            }
            else{
                System.out.println("your pin not correct");
            }
        }
         return "";
    }
    public boolean CheckPIN(int PIN){
        for(Custumer S:accounts){
           // boolean r=false;
            if(PIN==S.getPin()){
                return true;
            }
        }
        return false;
    }
}