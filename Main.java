import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,city;
        int amt,accNo;

        ArrayList<Account> list=new ArrayList<>();

        list.add(new Account("akash","pune",500));
        list.add(new Account("pratik","nagar",500000));
        list.add(new Account("omkar","solapur",5));



        System.out.println("Select Operation  \n");
        System.out.println("1.Open Account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Balance Enquiry");
        System.out.println("5.List All");
        System.out.println("6.Exit");
        boolean found;

        int choice;

    do {
        System.out.print("\nEnter your Choice : ");
         choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Your Name : ");
                name=sc.next();
                System.out.print("Enter Your City : ");
                city=sc.next();
                System.out.print("Enter Amount : ");
                amt=sc.nextInt();

                Account newAccount=new Account(name,city,amt);
                list.add(newAccount);
                System.out.println("\nAccount Opened..!");
                break;
            case 2:
                System.out.print("Enter Your Account No : ");
                 accNo=sc.nextInt();
                 found=false;
                for(Account ac:list){
                    if (accNo==ac.getAccNo()){
                       found=true;
                        System.out.println("................................................................................");
                        System.out.println("Account No : " + ac.getAccNo());
                        System.out.print("Account Holder Name : " + ac.getName());
                        System.out.println();
                        System.out.print("Current Balance : " + ac.getBal());
                        System.out.print("\n *** Enter Amount To Deposit : ");
                        int depositAmount=sc.nextInt();
                        ac.setBal(ac.getBal()+depositAmount);
                        System.out.println("\nMoney deposited To Your Account..!");

                        System.out.println("................................................................................");

                        System.out.print("*** Updated Account Balance : " + ac.getBal());

                        System.out.println("\n................................................................................");
                    }
                }
                if (!found){
                    System.out.println("ENTER CORRECT ACCOUNT NUMBER ..!");
                }
                break;
            case 3:
                System.out.print("Enter Your Account No : ");
                accNo=sc.nextInt();
                found=false;
                for(Account ac:list){
                    if (accNo==ac.getAccNo()){
                        found=true;
                        System.out.println("................................................................................");
                        System.out.println("Account No : " + ac.getAccNo());
                        System.out.print("Account Holder Name : " + ac.getName());
                        System.out.println();
                        System.out.print("Current Balance : " + ac.getBal());
                        System.out.print("\n *** Enter Amount To Withdraw : ");
                        int withdrawAmount=sc.nextInt();

                        if (withdrawAmount<ac.getBal()){
                            ac.setBal((ac.getBal()-withdrawAmount));
                        }else{
                            System.out.println("INSUFFICIENT BALANCE ..!");
                        }

                        System.out.println("................................................................................");

                        System.out.print("*** Updated Account Balance : " + ac.getBal());

                        System.out.println("\n..............................................................................");

                    }
                    else if (!found){
                        System.out.println("ENTER CORRECT ACCOUNT NUMBER ..!");
                        break;
                    }

                }
                System.out.println("\nMoney Debited From Your Account..!");
                break;
            case 4:
                System.out.print("Enter Your Account No : ");
                 accNo=sc.nextInt();
                    found=false;
                 for (Account ac:list) {
                     if (accNo == ac.getAccNo()) {
                         found=true;
                         System.out.println("Dear " + ac.getName() + " \nYour current balance is  :  " + ac.getBal());
                     }
                 }
                if (!found){
                    System.out.println("ENTER CORRECT ACCOUNT NUMBER..!");
                }

                 break;
            case 5:
                System.out.println("\nList Of All Account..!");
                for(Account ac:list){
//                System.out.println("[ " + ac.getAccNo() + "  " + ac.getName()+ "  " + ac.getCity()+ "  " + ac.getBal() + " ]");

                    System.out.println(" ....................................................................................... ");
                    System.out.println(" Account Number  : " + ac.getAccNo());
                    System.out.println(" Account Holder Name : " + ac.getName());
                    System.out.println(" Location (City) : " + ac.getCity());
                    System.out.println(" Current Balance : " + ac.getBal());
                    System.out.println(" ....................................................................................... \n\n");
                 }
                break;
            case 6:
                System.out.println("Thanks For visiting..!");
                break;
            default:
                System.out.println("INVALID CHOICE..!");
                System.out.println("Enter Correct Choice From Below Operations ...");

                System.out.println("1.Open Account");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Balance Enquiry");
                System.out.println("5.List All");
                System.out.println("6.Exit");
                break;

        }
    }while (choice!=6);

    }
}