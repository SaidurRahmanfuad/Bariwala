package com.saidur.bariwala.ui.mbariwala.home.house;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.saidur.bariwala.entity.Floor;
import com.saidur.bariwala.entity.FloorandUnit;
import com.saidur.bariwala.entity.House;
import com.saidur.bariwala.entity.Unit;
import com.saidur.bariwala.ripository.HouseRipository;

import java.util.List;

public class CreateHouseVM extends AndroidViewModel {
    public HouseRipository HouseRepo;

    public LiveData<List<Floor>> Floor_List;
    public LiveData<List<Unit>> Unit_List;
    public LiveData<List<FloorandUnit>> Floor_With_Unit_List;

    public CreateHouseVM(@NonNull Application application) {
        super(application);
        HouseRepo = new HouseRipository(application);

        Floor_List=HouseRepo.onlyfloor_list;
        Unit_List=HouseRepo.onlyunit_list;
        Floor_With_Unit_List=HouseRepo.floorwithUnit_list;
    }

    //action/operation for "HOUSE"
    public void Insert_House(House house)
    {
        HouseRepo.insert_house(house);
    }
    public void Update_House(House house)
    {
        HouseRepo.update_house(house);
    }
    public void Delete_House(int id)
    {
        HouseRepo.delete_house(id);
    }


    //action/operation for "Only Floor"
    public void Insert_Floor(Floor floor)
    {
        HouseRepo.insert_floor(floor);
    }
    public void Update_Floor(Floor floor)
    {
        HouseRepo.update_floor(floor);
    }
    public void Delete_Floor(int id)
    {
        HouseRepo.delete_floor(id);
    }

    //action/operation for "Only Unit"
    public void Insert_Unit(Unit unit)
    {
        HouseRepo.insert_unit(unit);
    }
    public void Update_Unit(Unit unit)
    {
        HouseRepo.update_unit(unit);
    }
    public void Delete_Unit(int id)
    {
        HouseRepo.delete_unit(id);
    }
}
