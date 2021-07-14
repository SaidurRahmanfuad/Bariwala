package com.saidur.bariwala.ui.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.saidur.bariwala.R;
import com.saidur.bariwala.databinding.ActivityRegistrationBinding;
import com.saidur.bariwala.ui.login.LoginActivity;
import com.saidur.bariwala.ui.splashwelcome.Welcome;
import com.saidur.bariwala.utils.Const;

import static com.saidur.bariwala.utils.Const.who;

public class Registration extends AppCompatActivity {
ActivityRegistrationBinding arbinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arbinding=ActivityRegistrationBinding.inflate(getLayoutInflater());
       // setContentView(R.layout.activity_registration);
        setContentView(arbinding.getRoot());
        Toast.makeText(this, who, Toast.LENGTH_SHORT).show();
        switch (who)
        {

            case "Bariwala":
                arbinding.tilHc.setVisibility(View.GONE);
                break;
            case "Varatia":
                arbinding.tilHc.setVisibility(View.VISIBLE);
                break;
        }

        arbinding.gotoLogin.setOnClickListener(v -> {
            startActivity(new Intent(Registration.this, LoginActivity.class));
            finish();
        });
    }
}