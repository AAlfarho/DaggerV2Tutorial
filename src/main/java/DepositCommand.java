import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

public class DepositCommand implements Command {
    private final Database db;
    private final Outputter outputter;

    @Inject
    DepositCommand(Outputter outputter, Database db) {
        System.out.println("Creating a new " + this);
        this.outputter = outputter;
        this.db = db;
    }
    @Override
    public Result handleInput(List<String> input) {
        if (input.size() != 2) {
            return Result.invalid();
        }

        Database.Account account = db.getAccount(input.get(0));
        account.deposit(new BigDecimal(input.get(1)));
        outputter.output(account.getUsername() + " now has: " + account.getBalance());
        return Result.handled();
    }
}
