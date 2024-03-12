import javax.inject.Inject;
import java.util.*;


final class CommandRouter {
    private final Map<String, Command> commands;

    @Inject
    CommandRouter(Map<String, Command> commands) {
        this.commands = commands;
    }

    Command.Result route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        List<String> args = splitInput.subList(1, splitInput.size());
        Command.Result result = command.handleInput(args);
        return result.status().equals(Command.Status.INVALID) ?
                invalidCommand(input) : result;
    }

    private Command.Result invalidCommand(String input) {
        System.out.println(
                String.format("couldn't understand \"%s\" . pleasetry again.", input));
        return Command.Result.invalid();
    }

    // Split on whitespace
    private static List<String> split(String input) {
        return Arrays.asList(input.trim().split("\\s+"));
    }
}