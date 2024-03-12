import java.util.Scanner;

class CommandLineAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouteFactory commandRouteFactory = DaggerCommandRouteFactory.create();
        CommandRouter commandRouter = commandRouteFactory.router();

        while (scanner.hasNextLine()) {
            Command.Result unused = commandRouter.route(scanner.nextLine());
        }
    }
}