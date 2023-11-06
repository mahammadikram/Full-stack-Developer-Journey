package BankDAO;
public class BankFac{
public  BankInterface creaInstance(){
      return new BankImpli();
}
}
