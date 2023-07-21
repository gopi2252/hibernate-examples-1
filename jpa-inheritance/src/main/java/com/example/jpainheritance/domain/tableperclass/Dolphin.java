package com.example.jpainheritance.domain.tableperclass;

import javax.persistence.Entity;

@Entity
public class Dolphin extends Mammal{

    private Boolean hasSpots;

    public Boolean getHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(Boolean hasSpots) {
        this.hasSpots = hasSpots;
    }
}
