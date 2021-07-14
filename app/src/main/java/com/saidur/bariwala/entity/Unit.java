package com.saidur.bariwala.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.OnConflictStrategy;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_unit")
public class Unit {
    @PrimaryKey(autoGenerate = true)
   public int unitId;

    @ColumnInfo(name = "unitName")
    public String unitName;

    @ColumnInfo(name = "unitFloor")
    public String unitFloor;

    @ColumnInfo(name = "unitHouse")
    public String unitHouse;

    @ColumnInfo(name = "unitRent")
    public String unitRent;

    @ColumnInfo(name = "unitStatus")
    public boolean unitStatus;

}
