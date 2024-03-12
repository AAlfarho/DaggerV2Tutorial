import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
abstract class LogginCommandModule {
    @Binds
    @IntoMap
    @StringKey("login")
    abstract Command loginCommand(LoginCommand command);
}
