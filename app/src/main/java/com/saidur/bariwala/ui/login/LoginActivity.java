package com.saidur.bariwala.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.saidur.bariwala.R;
import com.saidur.bariwala.databinding.ActivityLoginBinding;
import com.saidur.bariwala.ui.mbariwala.MainActivity;
import com.saidur.bariwala.ui.mbariwala.home.house.CreateHouseActivity;
import com.saidur.bariwala.ui.registration.Registration;

public class LoginActivity extends AppCompatActivity {
ActivityLoginBinding albinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        albinding=ActivityLoginBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_login);
        setContentView(albinding.getRoot());

        albinding.gotoRegi.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, Registration.class));
            finish();
        });
        albinding.loginSubmit.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, CreateHouseActivity.class));
            finish();
        });


    }
}