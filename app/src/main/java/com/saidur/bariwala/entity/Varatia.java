package com.saidur.bariwala.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_varatia")
public class Varatia {
    @PrimaryKey(autoGenerate = true)
    int unitId;

    @ColumnInfo(name = "varatiaName")
    public String varatiaName;


    @ColumnInfo(name = "varatiaMobile")
    public String varatiaMobile;

    @ColumnInfo(name = "varatiaRent")
    public String varatiaRent;

    @ColumnInfo(name = "varatiaUnit")
    public String varatiaUnit;

    @ColumnInfo(name = "varatiaImg")
    public String varatiaImg;

    @ColumnInfo(name = "varatiaHcode")
    public String varatiaHcode;

    @ColumnInfo(name = "varatiaUtility")
    public String varatiaUtility;

    @ColumnInfo(name = "varatiaEntrydate")
    public String varatiaEntrydate;

    @ColumnInfo(name = "varatiaPay")
    public String varatiaPay;
}
