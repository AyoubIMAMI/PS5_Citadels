package fr.unice.polytech.citadelle.game_interactor.game_strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.function.Function;

import fr.unice.polytech.citadelle.game.Board;
import fr.unice.polytech.citadelle.game.Player;
import fr.unice.polytech.citadelle.game.purple_districts.Library;
import fr.unice.polytech.citadelle.game_character.Character;




public class RichalphonseStrategy {
    Board board;
    Player currentPlayer;    
    //---------------
    SituationLibrairie librairie;



    public RichalphonseStrategy(Board board, Player player) {
        this.board = board;
        this.currentPlayer = player;
        librairie=new SituationLibrairie(board);
    }

    
    public Situation getBestSituation(int orderOfPlay, ArrayList<Character> listOfRichardCharacterPickable){
    	ArrayList<Situation> searchSituation = librairie.filterByOrderOfPlay(librairie.getLibrairieContent(), orderOfPlay);
    	searchSituation = librairie.filterByOrderOfPlay(searchSituation, orderOfPlay);
    	searchSituation = librairie.filterByListOfCharacterPickable(searchSituation, listOfRichardCharacterPickable);

    	Collections.sort(searchSituation);
    	Situation bestSituation =  searchSituation.get(0);
    	return bestSituation;
    }
    
}
