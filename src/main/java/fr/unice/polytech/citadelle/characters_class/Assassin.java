package fr.unice.polytech.citadelle.characters_class;

import fr.unice.polytech.citadelle.game.Character;
import fr.unice.polytech.citadelle.game_interactor.Behaviour;
import fr.unice.polytech.citadelle.output.PrintCitadels;

import java.util.LinkedHashMap;
import java.util.Optional;

/**
 * Assassin can kill one character per round. The player having the character being killed will be not
 * able to play the round.
 */
public class Assassin extends Character{
    public Assassin(){
        super("Assassin", 1);
    }

    @Override
    public void spellOfTurn(Behaviour bot, LinkedHashMap<Character, Optional<Behaviour>> hashOfCharacters, PrintCitadels printC){
        Character characterToDie= bot.selectCharacterForSpell(hashOfCharacters);
        if (hashOfCharacters.get(characterToDie).isPresent())
            hashOfCharacters.get(characterToDie).get().setCharacterIsAlive(false);
        printC.killCharacter(characterToDie);
    }
}
