import dagger.internal.Factory;
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
public final class DepositCommand_Factory implements Factory<DepositCommand> {
  private final Provider<Outputter> outputterProvider;

  private final Provider<Database> dbProvider;

  public DepositCommand_Factory(Provider<Outputter> outputterProvider,
      Provider<Database> dbProvider) {
    this.outputterProvider = outputterProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public DepositCommand get() {
    return new DepositCommand(outputterProvider.get(), dbProvider.get());
  }

  public static DepositCommand_Factory create(Provider<Outputter> outputterProvider,
      Provider<Database> dbProvider) {
    return new DepositCommand_Factory(outputterProvider, dbProvider);
  }

  public static DepositCommand newInstance(Outputter outputter, Object db) {
    return new DepositCommand(outputter, (Database) db);
  }
}
