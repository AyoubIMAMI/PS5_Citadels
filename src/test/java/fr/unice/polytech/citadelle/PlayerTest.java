package fr.unice.polytech.citadelle;

import fr.unice.polytech.citadelle.output.PrintCitadels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import fr.unice.polytech.citadelle.game.Player;
import fr.unice.polytech.citadelle.game.District;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.ArrayList;

public class PlayerTest {
    //Initialization
    Player player = new Player("robot1");

    @BeforeEach
    void beforeEach(){
        PrintCitadels.activateLevelWarning();

        player.getDistrictCards().clear();
        player.getDistrictCards().add(new District("Haunted City", 2,"empty","empty"));
        player.getDistrictCards().add(new District("Prison", 2,"empty","empty"));
        player.getDistrictCards().add(new District("Manor", 3,"empty","empty"));
        player.getDistrictCards().add(new District("Castle", 4,"empty","empty"));
        player.getDistrictCards().add(new District("Laboratory", 5,"empty","empty"));
        player.getDistrictCards().add(new District("Observatory", 5,"empty","empty"));
        player.getDistrictCards().add(new District("University", 6,"empty","empty"));

        player.getCity().builtDistrict.clear();
    }


    @RepeatedTest(1)
    //@Test
    void buildDistrictTest(){
        player.golds = 4;

        ArrayList<District> districts = new ArrayList<>();
        districts.add(new District("Manor", 3,"empty","empty"));

        ArrayList<District> districts1 = new ArrayList<>();
        districts1.add(new District("Haunted City", 2,"empty","empty"));
        districts1.add(new District("Prison", 2,"empty","empty"));
        districts1.add(new District("Castle", 4,"empty","empty"));
        districts1.add(new District("Laboratory", 5,"empty","empty"));
        districts1.add(new District("Observatory", 5,"empty","empty"));
        districts1.add(new District("University", 6,"empty","empty"));

        player.buildDistrict(new District("Manor", 3,"empty","empty"));

        assertEquals(districts, player.getCity().builtDistrict);
        assertEquals(districts1, player.getDistrictCards());
        assertEquals(1, player.getGolds());
    }

}
