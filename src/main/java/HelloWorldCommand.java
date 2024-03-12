import javax.inject.Inject;
import java.util.List;

public class HelloWorldCommand implements Command {

    private final Outputter outputter;
    @Inject
    HelloWorldCommand(Outputter outputter){
        System.out.println("Creating a new " + this);
        this.outputter = outputter;
    }

    @Override
    public Result handleInput(List<String> input) {
        if(!input.isEmpty()) {
            return Result.invalid();
        }
        outputter.output("world!");
        return Result.handled();
    }
}
