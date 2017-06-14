package com.epam.training.stationery.main;

import com.epam.training.stationery.domain.StarterKit;
import com.epam.training.stationery.domain.Stationery;
import com.epam.training.stationery.services.StarterKitService;
import com.epam.training.stationery.services.impl.StarterKitServiceImpl;

import java.util.List;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class MainController {

	public static void main(String[] args) {
		System.out.println("---Welcome To Stationary App---");
		StarterKitService starterKitService = new StarterKitServiceImpl();
		StarterKit starterKit = starterKitService.create();

		System.out.println("Before Sort");
		display(starterKit.getStationeryList());

		System.out.println("After Sort By Name");
		starterKitService.sortByName(starterKit.getStationeryList());
		display(starterKit.getStationeryList());

		System.out.println("After Sort By Price");
		starterKitService.sortByPrice(starterKit.getStationeryList());
		display(starterKit.getStationeryList());

		System.out.println("After Sort By Name and Price");
		starterKitService.sortByNameAndPrice(starterKit.getStationeryList());
		display(starterKit.getStationeryList());

	}

	private static void display(List<Stationery> stationeryList){
		for (Stationery stationery: stationeryList ) {
			System.out.println("Name:"+ stationery.getName() +" Price:"+ stationery.getPrice());
		}
	}

}
