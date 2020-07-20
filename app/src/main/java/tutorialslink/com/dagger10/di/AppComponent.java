package tutorialslink.com.dagger10.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import tutorialslink.com.dagger10.BaseApplication;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuilderModule.class,
        AppModule.class,

})
public interface AppComponent extends AndroidInjector<BaseApplication>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder Application(Application application);

        AppComponent build();

    }
}
