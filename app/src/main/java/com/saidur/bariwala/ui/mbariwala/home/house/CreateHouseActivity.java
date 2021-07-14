package com.saidur.bariwala.ui.mbariwala.home.house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.saidur.bariwala.R;
import com.saidur.bariwala.databinding.ActivityCreateHouseBinding;
import com.saidur.bariwala.entity.Floor;
import com.saidur.bariwala.ui.login.LoginActivity;
import com.saidur.bariwala.ui.mbariwala.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class CreateHouseActivity extends AppCompatActivity {
    ActivityCreateHouseBinding achoubinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        achoubinding = ActivityCreateHouseBinding.inflate(getLayoutInflater());
        setContentView(achoubinding.getRoot());
        this.getSupportActionBar().hide();
        //setContentView(R.layout.activity_create_house);

        achoubinding.openhinfo.setOnClickListener(v -> {
            achoubinding.llhomeinfoslay.setVisibility(View.VISIBLE);
            achoubinding.closehinfo.setVisibility(View.VISIBLE);
            achoubinding.openhinfo.setVisibility(View.GONE);
        });
        achoubinding.closehinfo.setOnClickListener(v -> {
            achoubinding.llhomeinfoslay.setVisibility(View.GONE);
            achoubinding.closehinfo.setVisibility(View.GONE);
            achoubinding.openhinfo.setVisibility(View.VISIBLE);
        });
        achoubinding.openunit.setOnClickListener(v -> {
            achoubinding.llunitlay.setVisibility(View.VISIBLE);
            achoubinding.openunit.setVisibility(View.GONE);
            achoubinding.closeunit.setVisibility(View.VISIBLE);
        });
        achoubinding.closeunit.setOnClickListener(v -> {
            achoubinding.llunitlay.setVisibility(View.GONE);
            achoubinding.closeunit.setVisibility(View.GONE);
            achoubinding.openunit.setVisibility(View.VISIBLE);
        });

        achoubinding.savehomeinfo.setOnClickListener(v -> {
            achoubinding.llhomeinfoslay.setVisibility(View.GONE);
            achoubinding.closehinfo.setVisibility(View.GONE);
            achoubinding.openhinfo.setVisibility(View.VISIBLE);
        });
        achoubinding.saveunitinfo.setOnClickListener(v -> {
            achoubinding.llunitlay.setVisibility(View.GONE);
            achoubinding.closeunit.setVisibility(View.GONE);
            achoubinding.openunit.setVisibility(View.VISIBLE);
        });
        //final save
        achoubinding.gotohome.setOnClickListener(v -> {
            startActivity(new Intent(CreateHouseActivity.this, MainActivity.class));
            finish();
        });

        achoubinding.savehomeinfo.setOnClickListener(v1 -> {
            achoubinding.crtHousename.getText().toString();
            achoubinding.crtHouseadd.getText().toString();

            int floorsize= Integer.parseInt(achoubinding.crtHousefloor.getText().toString());
            List<Floor> floors=new ArrayList<>();
            for(int i=0;i<floorsize;i++)
            {
                Log.d("CreatH", "index: "+i);
                Floor floor=new Floor();
                floor.floorId=i;
                floor.floorName="Test Floor "+i;

                Log.d("CreatH", "data id: "+  floor.floorId);
                Log.d("CreatH", "data name: "+floor.floorName);
              //  floors.add(String.valueOf(i).indexOf(i),floor);

                floors.add(floor);

            }
            Log.d("CreatH", "data list: "+floors.toString());
        });
    }
}