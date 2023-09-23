public class Main {
    public Main() {

}
    public static void main(String[] args) {
        PersonalAccount aruuke = new PersonalAccount(220104031, "Aruuke");
        new PersonalAccount(220104003, "Gulpiyaz");
        aruuke.printTransactionHistory();
        aruuke.deposit(700.0);
        aruuke.withdraw(500.0);
        aruuke.deposit(800.0);
        aruuke.withdraw(1500.0);

    }}