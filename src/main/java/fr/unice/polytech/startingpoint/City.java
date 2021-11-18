package fr.unice.polytech.startingpoint;

import java.util.ArrayList;

public class City {
    private ArrayList<District> builtDistrict;
    private final int cityComplete = 8;

    public City() {
        builtDistrict = new ArrayList<>();
    }

    public void buildDistrict(District district) {
        builtDistrict.add(district);
    }

    public boolean isComplete() {
        return (builtDistrict.size() == cityComplete);
    }
}