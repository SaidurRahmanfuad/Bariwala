package com.saidur.bariwala.ui.splashwelcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.saidur.bariwala.R;
import com.saidur.bariwala.ui.registration.Registration;
import com.saidur.bariwala.utils.Const;

public class Welcome extends AppCompatActivity {
private TextView bariwala,varatia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        bariwala=findViewById(R.id.bariwala);
        varatia=findViewById(R.id.varatia);

        bariwala.setOnClickListener(v -> {
            Const.who="Bariwala";
            startActivity(new Intent(Welcome.this, Registration.class));
            finish();
        });
        varatia.setOnClickListener(v -> {
            Const.who="Varatia";
            startActivity(new Intent(Welcome.this, Registration.class));
            finish();
        });
    }
}