import javax.inject.Inject;
import java.util.List;

public class LoginCommand implements Command {

    private final Outputter outputter;
    private final Database database;

    @Inject
    LoginCommand(Outputter outputter, Database database){
        System.out.println("Creating a new " + this);
        this.outputter = outputter;
        this.database = database;
    }

    @Override
    public Result handleInput(List<String> input) {
        if (input.size() != 1) {
            return Result.invalid();
        }
        String username = input.get(0);
        Database.Account account = database.getAccount(username);
        outputter.output(username + " is logged in with balance:"+ account.getBalance());
        return Result.handled();
    }
}
