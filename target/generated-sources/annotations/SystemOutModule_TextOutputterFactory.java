import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
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
public final class SystemOutModule_TextOutputterFactory implements Factory<Outputter> {
  @Override
  public Outputter get() {
    return textOutputter();
  }

  public static SystemOutModule_TextOutputterFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Outputter textOutputter() {
    return Preconditions.checkNotNullFromProvides(SystemOutModule.textOutputter());
  }

  private static final class InstanceHolder {
    private static final SystemOutModule_TextOutputterFactory INSTANCE = new SystemOutModule_TextOutputterFactory();
  }
}
