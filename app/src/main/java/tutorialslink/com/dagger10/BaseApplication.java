package tutorialslink.com.dagger10;

import dagger.android.AndroidInjector;
import dagger.android.DaggerActivity;
import dagger.android.DaggerApplication;
import tutorialslink.com.dagger10.di.DaggerAppComponent;

public class BaseApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().Application(this).build();
    }
}
