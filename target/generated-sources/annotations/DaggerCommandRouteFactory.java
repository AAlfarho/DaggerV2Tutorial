import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
final class DaggerCommandRouteFactory implements CommandRouteFactory {
  private Provider<Database> databaseProvider;

  private DaggerCommandRouteFactory() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CommandRouteFactory create() {
    return new Builder().build();
  }

  private HelloWorldCommand getHelloWorldCommand() {
    return new HelloWorldCommand(SystemOutModule_TextOutputterFactory.textOutputter());}

  private LoginCommand getLoginCommand() {
    return new LoginCommand(SystemOutModule_TextOutputterFactory.textOutputter(), databaseProvider.get());}

  private DepositCommand getDepositCommand() {
    return new DepositCommand(SystemOutModule_TextOutputterFactory.textOutputter(), databaseProvider.get());}

  private Map<String, Command> getMapOfStringAndCommand() {
    return MapBuilder.<String, Command>newMapBuilder(3).put("hello", getHelloWorldCommand()).put("login", getLoginCommand()).put("deposit", getDepositCommand()).build();}

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.databaseProvider = DoubleCheck.provider(Database_Factory.create());
  }

  @Override
  public CommandRouter router() {
    return new CommandRouter(getMapOfStringAndCommand());}

  static final class Builder {
    private Builder() {
    }

    public CommandRouteFactory build() {
      return new DaggerCommandRouteFactory();
    }
  }
}
