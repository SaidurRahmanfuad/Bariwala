package com.saidur.bariwala.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_floor")
public class Floor {
    @PrimaryKey(autoGenerate = true)
   public int floorId;

    @ColumnInfo(name = "floorName")
    public String floorName;

  /*  @ColumnInfo(name = "floorUnit")
    public String floorUnit;*/
}
