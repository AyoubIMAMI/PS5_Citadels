package fr.unice.polytech.citadelle.game_engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;

import fr.unice.polytech.citadelle.characters_class.Architect;
import fr.unice.polytech.citadelle.characters_class.Assassin;
import fr.unice.polytech.citadelle.characters_class.Bishop;
import fr.unice.polytech.citadelle.characters_class.King;
import fr.unice.polytech.citadelle.characters_class.Magician;
import fr.unice.polytech.citadelle.characters_class.Merchant;
import fr.unice.polytech.citadelle.characters_class.Thief;
import fr.unice.polytech.citadelle.characters_class.Warlord;
import fr.unice.polytech.citadelle.game.Board;
import fr.unice.polytech.citadelle.game.Character;
import fr.unice.polytech.citadelle.game.DeckCharacter;
import fr.unice.polytech.citadelle.game.DeckDistrict;
import fr.unice.polytech.citadelle.game.Player;
import fr.unice.polytech.citadelle.game_interactor.Behaviour;
import fr.unice.polytech.citadelle.game_interactor.NormalBot;
import fr.unice.polytech.citadelle.game_interactor.RushBot;

/**
 * The Initialiser initialize all objects needed for a game
 * @author BONNET Killian, IMAMI Ayoub, KARRAKCHOU Mourad, LE BIHAN Léo
 */
public class Initialiser {
	
	//créer un enum
	public static final int ASSASIN_INDEX = 0;
	public static final int THIEF_INDEX = 1;
	public static final int MAGICIAN_INDEX = 2;
	public static final int KING_INDEX = 3;
	public static final int BISHOP_INDEX = 4;
	public static final int MERCHANT_INDEX = 5;
	public static final int ARCHITECT_INDEX = 6;
	public static final int WARLORD_INDEX = 7;
	public final static int NUMBER_OF_PLAYER = 4;

	
	public Initialiser() {}

	
	public void initAll(LinkedHashMap<Character, Optional<Behaviour>> hashOfCharacters, ArrayList<Character> listOfAllCharacters, ArrayList<Player> listOfPlayer, ArrayList<Behaviour> listOfBehaviour){
		createListOfAllCharacter(listOfAllCharacters);
		resetHashOfCharacter(hashOfCharacters, listOfAllCharacters);
		createListOfBehaviour(listOfBehaviour, listOfPlayer);
	}
	
	public LinkedHashMap<Character, Optional<Behaviour>> resetHashOfCharacter(LinkedHashMap<Character, Optional<Behaviour>> hashOfCharacters,
			ArrayList<Character> listOfAllCharacters) {
		hashOfCharacters.put(listOfAllCharacters.get(ASSASIN_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(THIEF_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(MAGICIAN_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(KING_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(BISHOP_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(MERCHANT_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(ARCHITECT_INDEX), Optional.empty());
		hashOfCharacters.put(listOfAllCharacters.get(WARLORD_INDEX), Optional.empty());
		
		return hashOfCharacters;
	}
	
	public ArrayList<Character> createListOfAllCharacter(ArrayList<Character> listOfAllCharacters) {
		Assassin theAssassin = new Assassin();
		Thief theThief = new Thief();
		Magician theMagician = new Magician();
		King theKing = new King();
		Bishop theBishop = new Bishop();
		Merchant theMerchant = new Merchant();
		Architect theArchitect = new Architect();
		Warlord theWarlord = new Warlord();

		listOfAllCharacters.add(theAssassin);
		listOfAllCharacters.add(theThief);
		listOfAllCharacters.add(theMagician);
		listOfAllCharacters.add(theKing);
		listOfAllCharacters.add(theBishop);
		listOfAllCharacters.add(theMerchant);
		listOfAllCharacters.add(theArchitect);
		listOfAllCharacters.add(theWarlord);
		
		return listOfAllCharacters;
	}
	
	public ArrayList<Behaviour> createListOfBehaviour(ArrayList<Behaviour> listOfBehaviour, ArrayList<Player> listOfPlayer){
		for (int i = 1; i < NUMBER_OF_PLAYER; i++) {
			Player newPlayer = new Player("roBehaviour" + i);
			listOfBehaviour.add(new NormalBot(newPlayer));
			listOfPlayer .add(newPlayer);
		}
		Player newPlayer = new Player("roBehaviour_Rusher");
		listOfBehaviour.add(new RushBot(newPlayer));
		listOfPlayer.add(newPlayer);
		
		return listOfBehaviour;

	}
	
	public void fillHashOfCharacter(HashMap<Character, Optional<Behaviour>> hashOfCharacters, Character character, Behaviour Behaviour) {
		hashOfCharacters.put(character, Optional.of(Behaviour));
	}
	
	public Board createBoard(ArrayList<Character> listOfCharacter){
		Board board = new Board(new ArrayList<Player>(), new DeckDistrict(), new DeckCharacter(listOfCharacter));
		return board;
	}
	
	public DeckDistrict initDeckDistrict(DeckDistrict deck) {
		deck.initialise();
		return deck;
	}
	
	public DeckCharacter initDeckCharacter(DeckCharacter deck, ArrayList<Character> listOfCharacter) {
		deck.initialise(listOfCharacter);
		return deck;
	}
}
