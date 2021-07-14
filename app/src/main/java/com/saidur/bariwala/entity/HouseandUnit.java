package com.saidur.bariwala.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

public class HouseandUnit {
    @Embedded
    public Unit unit;
    @Relation(
            parentColumn = "houseId",
            entityColumn = "unitId"
    )
    public House house;
}
