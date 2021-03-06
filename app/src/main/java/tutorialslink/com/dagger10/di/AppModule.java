package tutorialslink.com.dagger10.di;


import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import dagger.Module;
import dagger.Provides;
import tutorialslink.com.dagger10.R;

@Module
public class AppModule {

    @Provides
    static RequestOptions provideRequestOptions(){

        return RequestOptions.placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application)
                .applyDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppLogo(Application application){
        return ContextCompat.getDrawable(application,R.drawable.logo);
    }

}
