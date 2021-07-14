package com.saidur.bariwala.entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "table_house")
public class House {
    @PrimaryKey(autoGenerate = true)
    public int houseId;

    @ColumnInfo(name = "houseName")
    public String houseName;

    @ColumnInfo(name = "houseAddress")
    public String houseAddress;

    @ColumnInfo(name = "houseCode")
    public String houseCode;

    /*@Embedded(prefix = "houseFloor_")
    @ColumnInfo(name = "houseFloor")
    public Floor houseFloor;*/

   /* @Embedded(prefix = "houseUnit_")
    @ColumnInfo(name = "houseUnit")
    public Unit houseUnit;*/

  /*  @Embedded(prefix = "houseVaratia_")
    @ColumnInfo(name = "houseVaratia")
    public Varatia houseVaratia;*/

//    public List<Varatia> houseVaratiaList;

    @ColumnInfo(name = "totalFloor")
    public String totalFloor;

    @ColumnInfo(name = "totalUnit")
    public String totalUnit;

    @ColumnInfo(name = "houseUtility")
    public String houseUtility;

    public House() {
    }

    public House(String houseName, String houseAddress, String houseCode, String totalFloor, String totalUnit, String houseUtility) {
        this.houseName = houseName;
        this.houseAddress = houseAddress;
        this.houseCode = houseCode;
        this.totalFloor = totalFloor;
        this.totalUnit = totalUnit;
        this.houseUtility = houseUtility;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }



    public String getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(String totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(String totalUnit) {
        this.totalUnit = totalUnit;
    }

    public String getHouseUtility() {
        return houseUtility;
    }

    public void setHouseUtility(String houseUtility) {
        this.houseUtility = houseUtility;
    }
}
