package tutorialslink.com.dagger10.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import tutorialslink.com.dagger10.R;

public class AuthActivity extends DaggerAppCompatActivity {

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        setLogo();


    }

    private void setLogo(){
        requestManager
                .load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }
}