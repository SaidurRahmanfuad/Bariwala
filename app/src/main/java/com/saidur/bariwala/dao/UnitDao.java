package com.saidur.bariwala.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.saidur.bariwala.entity.Floor;
import com.saidur.bariwala.entity.Unit;

import java.util.List;

@Dao
public interface UnitDao {
    @Query("select * from table_unit")
    LiveData<List<Unit>> unitList();

    @Insert
    public void insertUnits(Unit unit);

    @Update
    public void updateUnit(Unit unit);

    @Query("delete from table_unit where unitId=:id")
    public void deleteUnit(int id);
   /* @Delete
    public void deleteUnit(Unit unit);*/

   /* @Query("update table_unit where unitId=:id")
    public void updateUnit(int id);*/
}
