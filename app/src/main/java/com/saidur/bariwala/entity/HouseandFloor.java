package com.saidur.bariwala.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

public class HouseandFloor {
    @Embedded
    public Floor floor;
    @Relation(
            parentColumn = "houseId",
            entityColumn = "floorId"
    )
    public House house;
}
