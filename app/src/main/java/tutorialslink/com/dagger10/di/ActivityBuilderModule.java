package tutorialslink.com.dagger10.di;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import tutorialslink.com.dagger10.ui.AuthActivity;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributesAuthActivity();

}
