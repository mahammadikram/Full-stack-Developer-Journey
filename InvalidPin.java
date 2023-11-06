package BankDAO;

public class InvalidPin extends Exception {
    public String  invalid(){
        return "You entered the Wrong PIN";
    }
}
