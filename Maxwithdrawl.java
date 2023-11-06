package BankDAO;

public class Maxwithdrawl extends Exception {
    public String maxwithDraw(){
        return "You can withdraw only 10000 at a time";
    }
}
