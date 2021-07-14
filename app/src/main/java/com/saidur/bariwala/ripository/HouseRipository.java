package com.saidur.bariwala.ripository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.saidur.bariwala.dao.FloorDao;
import com.saidur.bariwala.dao.HouseDao;
import com.saidur.bariwala.dao.UnitDao;
import com.saidur.bariwala.db.DB;
import com.saidur.bariwala.entity.Floor;
import com.saidur.bariwala.entity.FloorandUnit;
import com.saidur.bariwala.entity.House;
import com.saidur.bariwala.entity.Unit;

import java.util.List;

public class HouseRipository {
public HouseDao houseDao;
public FloorDao floorDao;
public UnitDao unitDao;

public LiveData<List<FloorandUnit>> floorwithUnit_list;
public LiveData<List<Floor>> onlyfloor_list;
public LiveData<List<Unit>> onlyunit_list;

    public HouseRipository(Application application) {
        DB db=DB.getDBInstance(application);
        houseDao=db.houseDao();
        floorDao=db.floorDao();
        unitDao=db.unitDao();

        floorwithUnit_list=houseDao.getFloorwithUnit();
        onlyfloor_list=floorDao.floorList();
        onlyunit_list=unitDao.unitList();
    }

    //action/operation for "HOUSE"
    public void insert_house(House house)
    {
        houseDao.insertHouse(house);
    }
    public void update_house(House house)
    {
        houseDao.udateHouse(house);
    }
    public void delete_house(int id)
    {
        houseDao.deleteHouse(id);
    }

    //action/operation for "Only Floor"
    public void insert_floor(Floor floor)
    {
        floorDao.insertFloor(floor);
    }
    public void update_floor(Floor floor)
    {
        floorDao.updateFloor(floor);
    }
    public void delete_floor(int id)
    {
        floorDao.deleteFloor(id);
    }

    //action/operation for "Only Unit"
    public void insert_unit(Unit unit)
    {
        unitDao.insertUnits(unit);
    }
    public void update_unit(Unit unit)
    {
        unitDao.updateUnit(unit);
    }
    public void delete_unit(int id)
    {
        unitDao.deleteUnit(id);
    }
}
