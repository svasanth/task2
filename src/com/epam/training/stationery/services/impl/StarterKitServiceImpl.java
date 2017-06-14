package com.epam.training.stationery.services.impl;

import com.epam.training.stationery.domain.*;
import com.epam.training.stationery.services.StarterKitService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class StarterKitServiceImpl implements StarterKitService<StarterKit> {

    @Override
    public StarterKit create() {

        List<Stationery> stationeryList = new ArrayList<Stationery>();

        stationeryList.add(new Folder("FOLDER", 100));
        stationeryList.add(new File("FILE", 25, 100));
        stationeryList.add(new File("FILE", 35, 100));
        stationeryList.add(new Marker("MARKER", 15, "black"));
        stationeryList.add(new Pen("PEN", 5, "blue"));

        Pencil pencil = new Pencil("PENCIL", 2);
        StickNote stickNote = new StickNote();
        stickNote.setMessage(new Message("It's a color pencil"));
        pencil.setStickNote(stickNote);
        stationeryList.add(pencil);

        stationeryList.add(new StickNote("NOTES", 55));

        StarterKit starterKit = new StarterKit();
        starterKit.setStationeryList(stationeryList);

        return starterKit;
    }

    @Override
    public List<Stationery> sortByName(List<Stationery> stationeryList) {
        Collections.sort(stationeryList, getNameComparator());

        return stationeryList;
    }

    @Override
    public List<Stationery> sortByPrice(List<Stationery> stationeryList) {
        Collections.sort(stationeryList, getPriceComparator());

        return stationeryList;
    }

    @Override
    public List<Stationery> sortByNameAndPrice(List<Stationery> stationeryList) {
        Collections.sort(stationeryList, new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                int result = o1.getName().compareToIgnoreCase(o2.getName());

                if(result != 0 ){
                    return result;
                }
                return o1.getPrice()- o2.getPrice();
            }
        });

        return stationeryList;
    }

    private Comparator<Stationery> getNameComparator(){
        return new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
    }

    private Comparator<Stationery> getPriceComparator(){
        return new Comparator<Stationery>() {
            @Override
            public int compare(Stationery o1, Stationery o2) {
                return o1.getPrice()- o2.getPrice();
            }
        };
    }
}
