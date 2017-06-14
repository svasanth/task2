package com.epam.training.stationery.domain;

import java.util.List;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class StarterKit {

    private Stationery stationery;

    List<Stationery> stationeryList;

    public StarterKit() {
    }

    public StarterKit(Stationery stationery) {
        this.stationery = stationery;
    }

    public Stationery getStationery() {
        return stationery;
    }

    public void setStationery(Stationery stationery) {
        this.stationery = stationery;
    }

    public List<Stationery> getStationeryList() {
        return stationeryList;
    }

    public void setStationeryList(List<Stationery> stationeryList) {
        this.stationeryList = stationeryList;
    }
}
