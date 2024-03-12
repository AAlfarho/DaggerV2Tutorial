import dagger.internal.DaggerGenerated;
import dagger.internal.MapBuilder;
import java.util.Map;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
final class DaggerCommandRouteFactory {
  private DaggerCommandRouteFactory() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CommandRouteFactory create() {
    return new Builder().build();
  }

  static final class Builder {
    private Builder() {
    }

    public CommandRouteFactory build() {
      return new CommandRouteFactoryImpl();
    }
  }

  private static final class CommandRouteFactoryImpl implements CommandRouteFactory {
    private final CommandRouteFactoryImpl commandRouteFactoryImpl = this;

    private CommandRouteFactoryImpl() {


    }

    private HelloWorldCommand helloWorldCommand() {
      return new HelloWorldCommand(SystemOutModule_TextOutputterFactory.textOutputter());
    }

    private LoginCommand loginCommand() {
      return new LoginCommand(SystemOutModule_TextOutputterFactory.textOutputter(), new Database());
    }

    private DepositCommand depositCommand() {
      return new DepositCommand(SystemOutModule_TextOutputterFactory.textOutputter(), new Database());
    }

    private Map<String, Command> mapOfStringAndCommand() {
      return MapBuilder.<String, Command>newMapBuilder(3).put("hello", helloWorldCommand()).put("login", loginCommand()).put("deposit", depositCommand()).build();
    }

    @Override
    public CommandRouter router() {
      return new CommandRouter(mapOfStringAndCommand());
    }
  }
}
