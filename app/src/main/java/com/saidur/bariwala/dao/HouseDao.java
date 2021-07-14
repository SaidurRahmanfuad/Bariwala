package com.saidur.bariwala.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.saidur.bariwala.entity.FloorandUnit;
import com.saidur.bariwala.entity.House;

import java.util.List;

@Dao
public interface HouseDao {
    @Insert
    public void insertHouse(House house);

    @Query("delete from table_house where houseId=:id")
    void deleteHouse(int id);

    @Update
    void udateHouse(House house);

   /* @Transaction
    @Query("SELECT * FROM table_unit")
    public List<UnitandFloor> getUnitandFloor();*/

    @Transaction
    @Query("SELECT * FROM table_floor")
    public LiveData<List<FloorandUnit>> getFloorwithUnit();
}
