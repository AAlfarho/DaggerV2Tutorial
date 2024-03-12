import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        HelloWorldModule.class,
        SystemOutModule.class,
        LogginCommandModule.class,
        UserCommandsModule.class
})
interface CommandRouteFactory {
    CommandRouter router();
}