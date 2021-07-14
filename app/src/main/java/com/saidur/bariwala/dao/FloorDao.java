package com.saidur.bariwala.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.saidur.bariwala.entity.Floor;

import java.util.List;

@Dao
public interface FloorDao {

    @Query("select * from table_floor")
    LiveData<List<Floor>> floorList();

    @Insert
    public void insertFloor(Floor floor);

    @Update
    public void updateFloor(Floor floor);

    @Query("delete from table_floor where floorId=:id")
    public void deleteFloor(int id);
}
