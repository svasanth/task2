package com.epam.training.stationery.main;

import com.epam.training.stationery.domain.StarterKit;
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
		List<StarterKit> starterKitList = starterKitService.create();

		System.out.println("Before Sort");
		display(starterKitList);

		System.out.println("After Sort By Name");
		starterKitService.sortByName(starterKitList);
		display(starterKitList);

		System.out.println("After Sort By Price");
		starterKitService.sortByPrice(starterKitList);
		display(starterKitList);

		System.out.println("After Sort By Name and Price");
		starterKitService.sortByNameAndPrice(starterKitList);
		display(starterKitList);

	}

	private static void display(List<StarterKit> starterKitList){
		for (StarterKit starterKit: starterKitList ) {
			System.out.println("Name:"+ starterKit.getStationery().getName() +" Price:"+starterKit.getStationery().getPrice());
		}
	}

}
