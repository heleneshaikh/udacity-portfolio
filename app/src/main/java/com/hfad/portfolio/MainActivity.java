package com.hfad.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowToast(View view) {
        final String text = "This button will launch ";
        String appText = null;
        switch(view.getId()) {
            case R.id.btn_movies:
                appText = "Popular Movies app!";
                break;
            case R.id.btn_stock_hawk:
                appText ="Stock Hawk app!";
                break;
            case R.id.btn_build:
                appText = "App Build with Gradle app!";
                break;
            case R.id.btn_app_material:
                appText = "App Material app!";
                break;
            case R.id.btn_ubiquitous:
                appText = "Ubiquitous app!";
                break;
            case R.id.btn_capstone:
                appText = "Capstone app!";
                break;
        }
        Toast toast = Toast.makeText(this, text + appText, Toast.LENGTH_SHORT);
        toast.show();
    }
}
