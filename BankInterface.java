package BankDAO;

public interface  BankInterface {
public void  addCustumer(Custumer c);
public void  DepositeBal(int Pin,int price);
public void  withdrawBal(int PIN,int Price);
public  String CheckBal(int PIN);
public boolean CheckPIN(int PIN);
}
