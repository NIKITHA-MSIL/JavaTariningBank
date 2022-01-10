import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class BankDetails {
        private String accno;
        private String name;
        private String acc_type;
        private long balance;
        Scanner sc = new Scanner(System.in);
        public void openAccount() {
            System.out.print("Enter Account No: ");
            accno = sc.next();
            System.out.print("Enter Account type: ");
            acc_type = sc.next();
            System.out.print("Enter Name: ");
            name = sc.next();
            System.out.print("Enter Balance: ");
            balance = sc.nextLong();
            ArrayList<String> name = new ArrayList<String>();
            ArrayList<String> location = new ArrayList<String>();
            HashMap<String, String> myMap = new HashMap<String, String>();


            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your address: ");
            name.add(sc.next());
            System.out.println("Please enter your Location: ");
            location.add(sc.next());
            myMap.put(name.get(0), location.get(0));
            System.out.println(myMap);

        }
        public void showAccount() {
            System.out.println("Name of account holder: " + name);
            System.out.println("Account no.: " + accno);
            System.out.println("Account type: " + acc_type);
            System.out.println("Balance: " + balance);
        }

        public void deposit() {
            long amt;
            System.out.println("Enter the amount you want to deposit: ");
            amt = sc.nextLong();
            balance = balance + amt;
        }

        public void withdrawal() {
            long amt;
            System.out.println("Enter the amount you want to withdraw: ");
            amt = sc.nextLong();
            if (balance >= amt) {
                balance = balance - amt;
                System.out.println("Balance after withdrawal: " + balance);
            } else {
                System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
            }
        }
        public boolean search(String ac_no) {
            if (accno.equals(ac_no)) {
                showAccount();
                return (true);
            }
            return (false);
        }
    }



