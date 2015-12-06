package main.java.yas.api.service;

import main.java.yas.manager.HousingManager;

/**
 * Created by Salman on 11/30/2015.
 */
public class HousingService {
    public static String createNewHousing(HousingManager manager) {
        String housingName = manager.createNewHousing();
        return housingName;
    }
}
