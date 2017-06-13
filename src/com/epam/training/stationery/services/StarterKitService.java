package com.epam.training.stationery.services;

import com.epam.training.stationery.domain.StarterKit;

import java.util.List;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public interface StarterKitService<StarterKit> {

    List<StarterKit> create();

    List<StarterKit> sortByName(List<StarterKit> starterKitList);

    List<StarterKit> sortByPrice(List<StarterKit> starterKitList);

    List<StarterKit> sortByNameAndPrice(List<StarterKit> starterKitList);
}
