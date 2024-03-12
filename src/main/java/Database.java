import javax.inject.Inject;
import javax.inject.Singleton;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Singleton
final class Database {
    private final Map<String, Account> accounts = new HashMap<>();

    @Inject
    Database(){
        System.out.println("Creating a new " + this);
    }

    public Account getAccount(String username) {
        return accounts.computeIfAbsent(username, Account::new);
    }

    static final class Account {
        private final String username;
        private BigDecimal balance = BigDecimal.ZERO;

        Account(String username) {
            this.username = username;
        }

        String getUsername(){return username;}
        BigDecimal getBalance(){ return balance;}

        void deposit(BigDecimal amount) {
            balance = balance.add(amount);
        }
    }
}
