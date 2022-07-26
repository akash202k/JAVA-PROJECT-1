import java.awt.*;

public class Account{
    private int accNo;
    private  static int saccNo=1001;
    private String name;
    private String city;
    private int bal;

    public Account(String name, String city, int bal) {
        this.name = name;
        this.city = city;
        this.bal = bal;
        this.accNo=saccNo++;

    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
//
//    public static int getSaccNo() {
//        return saccNo;
//    }

//    public static void setSaccNo(int saccNo) {
//        Account.saccNo = saccNo;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }


}

