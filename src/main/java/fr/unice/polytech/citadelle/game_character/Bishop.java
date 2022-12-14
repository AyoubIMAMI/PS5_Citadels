package fr.unice.polytech.citadelle.game_character;

import java.util.LinkedHashMap;
import java.util.Optional;

import fr.unice.polytech.citadelle.game_interactor.game_behaviour.Behaviour;

/**
 * Bishop districts cannot be destroyed by Warlord.
 * Each religious districts bring one gold to the Bishop.
 *
 * @author BONNET Killian, IMAMI Ayoub, KARRAKCHOU Mourad, LE BIHAN Léo
 */
public class Bishop extends Character {
    public Bishop(){
        super("Bishop", 5);
    }

    /**
     * Execute the spell
     * @param bot
     * @param hashOfCharacters
     */
    @Override
    public void spellOfTurn(Behaviour bot, LinkedHashMap<Character, Optional<Behaviour>> hashOfCharacters){
        super.spellOfTurnDistrictFamily(bot,"Bishop","Religion");
    }
}
