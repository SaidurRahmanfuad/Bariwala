package com.saidur.bariwala.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class FloorandUnit {
    @Embedded
    public Floor floor;
    @Relation(
            parentColumn = "floorId",
            entityColumn = "unitFloor"
    )

  //  public Unit unit;
    public List<Unit> unitList;
}
