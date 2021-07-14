package com.saidur.bariwala.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.saidur.bariwala.dao.FloorDao;
import com.saidur.bariwala.dao.HouseDao;
import com.saidur.bariwala.dao.UnitDao;
import com.saidur.bariwala.entity.Floor;
import com.saidur.bariwala.entity.House;
import com.saidur.bariwala.entity.Unit;

@Database(entities = {House.class, Floor.class, Unit.class}, version = 1,exportSchema = true)
public abstract class DB extends RoomDatabase {

    public abstract HouseDao houseDao();
    public abstract UnitDao unitDao();
    public abstract FloorDao floorDao();

    public static volatile DB Instance;

    public static DB getDBInstance(Context c) {
        if (Instance == null)
            synchronized (DB.class) {
                Instance = Room.databaseBuilder(c.getApplicationContext(), DB.class, "home_table").fallbackToDestructiveMigration().allowMainThreadQueries().build();
            }
        return Instance;
    }

}
