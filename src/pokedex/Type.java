/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.util.ArrayList;

/**
 *
 * @author cbran
 */
public class Type {

    private String type;
    private final ArrayList<Pokemon> pokemons = new ArrayList();

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void addPokemon(Pokemon pk) {
        pokemons.add(pk);
    }

    public String displayPokemon(String ty) {
        String pokemonOfType = "Here are all the pokemon with the type " + ty + ".";
        for (int i = 0; i < pokemons.size(); i++) {
            if (i % 10 == 0) {
                pokemonOfType += "\n";
            }
            pokemonOfType += pokemons.get(i).getNationalNumber() + " " + pokemons.get(i).getName() + "     ";
        }
        return pokemonOfType;
    }
}
