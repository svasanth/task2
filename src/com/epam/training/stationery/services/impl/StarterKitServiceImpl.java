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
    public List<StarterKit> create() {

        List<StarterKit> starterKitList = new ArrayList<StarterKit>();

        starterKitList.add(new StarterKit(new Folder("FOLDER", 100)));
        starterKitList.add(new StarterKit(new File("FILE", 25, 100)));
        starterKitList.add(new StarterKit(new File("FILE", 35, 100)));
        starterKitList.add(new StarterKit(new Marker("MARKER", 15, "black")));
        starterKitList.add(new StarterKit(new Pen("PEN", 5, "blue")));

        Pencil pencil = new Pencil("PENCIL", 2);
        StickNote stickNote = new StickNote();
        stickNote.setMessage(new Message("It's a color pencil"));
        pencil.setStickNote(stickNote);
        starterKitList.add(new StarterKit(pencil));

        starterKitList.add(new StarterKit(new StickNote("NOTES", 55)));

        return starterKitList;
    }

    @Override
    public List<StarterKit> sortByName(List<StarterKit> starterKitList) {
        Collections.sort(starterKitList, new Comparator<StarterKit>() {
            @Override
            public int compare(StarterKit o1, StarterKit o2) {
                return o1.getStationery().getName().compareToIgnoreCase(o2.getStationery().getName());
            }
        });

        return starterKitList;
    }

    @Override
    public List<StarterKit> sortByPrice(List<StarterKit> starterKitList) {
        Collections.sort(starterKitList, new Comparator<StarterKit>() {
            @Override
            public int compare(StarterKit o1, StarterKit o2) {
                return o1.getStationery().getPrice()- o2.getStationery().getPrice();
            }
        });

        return starterKitList;
    }

    @Override
    public List<StarterKit> sortByNameAndPrice(List<StarterKit> starterKitList) {
        Collections.sort(starterKitList, new Comparator<StarterKit>() {
            @Override
            public int compare(StarterKit o1, StarterKit o2) {
                int result = o1.getStationery().getName().compareToIgnoreCase(o2.getStationery().getName());

                if(result != 0 ){
                    return result;
                }
                return o1.getStationery().getPrice()- o2.getStationery().getPrice();
            }
        });

        return starterKitList;
    }
}
