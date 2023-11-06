package BankDAO;
import java.lang.invoke.StringConcatFactory;
public class Custumer {
    private String name;
    private String Branch;
    private int Pin;
    private int Pin_code;
     public Custumer(String Name,String Branch,int PIN,int PIN_CODE){
        this.name=Name;
        this.Branch=Branch;
        this.Pin=PIN;
        this.Pin_code=PIN_CODE;
    }
    String getName(){
        return name;
    }
    String getBrach(){
        return Branch;
    }
    int  getPin(){
        return Pin;
    }
    int  getCode(){
        return Pin_code;
    }
}
