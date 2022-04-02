import account.Account;

public class main {
    public static void main(String[] args) {

        Account account = new Account();

        account.setId();
        account.setFirstname("seb");
        account.setLastname("pel");

        System.out.println(account.getFullname());
    }
}
