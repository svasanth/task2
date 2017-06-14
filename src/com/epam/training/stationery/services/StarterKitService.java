package com.epam.training.stationery.services;

import java.util.List;
import com.epam.training.stationery.domain.StarterKit;
import com.epam.training.stationery.domain.Stationery;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public interface StarterKitService<StarterKit> {

    com.epam.training.stationery.domain.StarterKit create();

    List<Stationery> sortByName(List<Stationery> stationeryList);

    List<Stationery> sortByPrice(List<Stationery> stationeryList);

    List<Stationery> sortByNameAndPrice(List<Stationery> stationeryList);
}
