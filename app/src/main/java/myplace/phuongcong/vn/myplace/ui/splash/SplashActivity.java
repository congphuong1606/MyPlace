package myplace.phuongcong.vn.myplace.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import myplace.phuongcong.vn.myplace.R;
import myplace.phuongcong.vn.myplace.common.Constants;
import myplace.phuongcong.vn.myplace.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferences preferences;
    private String accName;
    private String accPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        preferences = getSharedPreferences(Constants.SPF_NAME, Context.MODE_PRIVATE);
        accName = preferences.getString("name", "");
        accPass = preferences.getString("pass", "");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                i.putExtra("name", accName);
                i.putExtra("pass", accPass);
                startActivity(i);
                finish();
            }
        }, 3000);
    }


}
