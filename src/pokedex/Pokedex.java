/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author Norco College
 */
class Pokedex {

    private final ArrayList<Pokemon> pokemons = new ArrayList();
    private final Type normal = new Type("Normal");
    private final Type fighting = new Type("Fighting");
    private final Type flying = new Type("Flying");
    private final Type fire = new Type("Fire");
    private final Type water = new Type("Water");
    private final Type grass = new Type("Grass");
    private final Type poison = new Type("Poison");
    private final Type electric = new Type("Electric");
    private final Type ground = new Type("Ground");
    private final Type psychic = new Type("Psychic");
    private final Type rock = new Type("Rock");
    private final Type ice = new Type("Ice");
    private final Type bug = new Type("Bug");
    private final Type dragon = new Type("Dragon");
    private final Type ghost = new Type("Ghost");
    private final Type dark = new Type("Dark");
    private final Type steel = new Type("Steel");
    private final Type fairy = new Type("Fairy");
    private final HashMap<String, Type> types = new HashMap();

    Pokedex() throws IOException {
        File.getPokemonData(pokemons);
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getType1().equalsIgnoreCase(normal.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(normal.getType())) {
                normal.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(fighting.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(fighting.getType())) {
                fighting.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(flying.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(flying.getType())) {
                flying.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(fire.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(fire.getType())) {
                fire.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(water.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(water.getType())) {
                water.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(grass.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(grass.getType())) {
                grass.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(poison.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(poison.getType())) {
                poison.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(electric.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(electric.getType())) {
                electric.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(ground.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(ground.getType())) {
                ground.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(psychic.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(psychic.getType())) {
                psychic.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(rock.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(rock.getType())) {
                rock.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(ice.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(ice.getType())) {
                ice.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(bug.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(bug.getType())) {
                bug.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(dragon.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(dragon.getType())) {
                dragon.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(ghost.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(ghost.getType())) {
                ghost.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(dark.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(dark.getType())) {
                dark.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(steel.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(steel.getType())) {
                steel.addPokemon(pokemons.get(i));
            }
            if (pokemons.get(i).getType1().equalsIgnoreCase(fairy.getType()) || pokemons.get(i).getType2().equalsIgnoreCase(fairy.getType())) {
                fairy.addPokemon(pokemons.get(i));
            }
        }
        types.put(normal.getType(), normal);
        types.put(fighting.getType(), fighting);
        types.put(flying.getType(), flying);
        types.put(fire.getType(), fire);
        types.put(water.getType(), water);
        types.put(grass.getType(), grass);
        types.put(poison.getType(), poison);
        types.put(electric.getType(), electric);
        types.put(ground.getType(), ground);
        types.put(psychic.getType(), psychic);
        types.put(rock.getType(), rock);
        types.put(ice.getType(), ice);
        types.put(bug.getType(), bug);
        types.put(dragon.getType(), dragon);
        types.put(ghost.getType(), ghost);
        types.put(dark.getType(), dark);
        types.put(steel.getType(), steel);
        types.put(fairy.getType(), fairy);
    }

    public Pokemon getPokemon(Integer i) {
        return pokemons.get(i);
    }

    public Type getType(String type) {
        return types.get(type);
    }

    public Integer getPokemonsSize() {
        return pokemons.size();
    }

    public Integer getTypesSize() {
        return types.size();
    }

    public String displayPokemon(Pokemon pk) {
        String pokemon = pk.getName() + "\n" + pk.getNationalNumber() + "\n"
                + pk.getType1();
        if (!pk.getType2().equalsIgnoreCase("nothing")) {
            pokemon += " & " + pk.getType2();
        }
        pokemon += "\nSpecies: " + pk.getSpecies() + "\n" + pk.getGender()
                + "\nHeight: " + pk.getHeight() + " m\nWeight: "
                + pk.getWeight() + " kg\n" + pk.getEntry();
        if (!pk.getEvolvesInto().get(0).equalsIgnoreCase("nothing")) {
            pokemon += "\nEvolves Into: ";
            for (int i = 0; i < pk.getEvolvesInto().size(); i++) {
                if (i == (pk.getEvolvesInto().size() - 1)) {
                    pokemon += pk.getEvolvesInto().get(i);
                } else {
                    pokemon += pk.getEvolvesInto().get(i) + ", ";
                }
            }
        }
        if (!pk.getEvolvesFrom().equalsIgnoreCase("nothing")) {
            pokemon += "\nEvolves From: " + pk.getEvolvesFrom();
        }
        if (pk.getEvolvesFrom().equalsIgnoreCase("nothing") && pk.getEvolvesInto().get(0).equalsIgnoreCase("nothing")) {
            pokemon += "\nDoes not evolve.";
        }
        return pokemon;
    }
    
    public ImageIcon pkIcon (Pokemon pk)
    {
        ImageIcon icon = new ImageIcon(pk.getFileName()); 
        return icon; 
    }

    public int binarySearch(int nums[], int left, int right, int number) {
        if (right >= left) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == (number)) {
                return middle;
            }
            if (nums[middle] > number) {
                return binarySearch(nums, left, middle - 1, number);
            }
            return binarySearch(nums, middle + 1, right, number);
        }
        return -1;
    }

    public String startSort(String choice) {
        ArrayList<String> names = new ArrayList();
        ArrayList<String> numbers = new ArrayList();
        ArrayList<Double> heights = new ArrayList();
        ArrayList<Double> weights = new ArrayList();
        for (int i = 0; i < getPokemonsSize(); i++) {
            names.add(getPokemon(i).getName());
            numbers.add(getPokemon(i).getNationalNumber());
            heights.add(Double.parseDouble(getPokemon(i).getHeight()));
            weights.add(Double.parseDouble(getPokemon(i).getWeight()));
        }
        if (choice.equals("1")) {
            String pokemon = "Here are all of the pokemon from 1 to " + getPokemonsSize() + ".";
            for (int i = 0; i < getPokemonsSize(); i++) {
                if (i % 20 == 0) {
                    pokemon += "\n";
                }
                pokemon += (getPokemon(i).getNationalNumber() + " " + getPokemon(i).getName() + "     ");
            }
            return pokemon;
        } else if (choice.equals("2")) {
            String pokemon = "Here are all of the pokemon from " + getPokemonsSize() + " to 1.";
            for (int i = 0; i < getPokemonsSize(); i++) {
                if (i % 20 == 0) {
                    pokemon += "\n";
                }
                pokemon += (getPokemon(getPokemonsSize() - 1 - i).getNationalNumber() + " " + getPokemon(getPokemonsSize() - 1 - i).getName() + "     ");
            }
            return pokemon;
        }
        if (choice.equals("3")) {
            return sortAtoZ(names, numbers);
        } else if (choice.equals("4")) {
            return sortZtoA(names, numbers);
        } else if (choice.equals("5")) {
            return sortSmallToTall(names, numbers, heights);
        } else if (choice.equals("6")) {
            return sortTallToSmall(names, numbers, heights);
        } else if (choice.equals("7")) {
            return sortLightToHeavy(names, numbers, weights);
        } else if (choice.equals("8")) {
            return sortHeavyToLight(names, numbers, weights);
        } else {
            return null;
        }
    }

    private String sortAtoZ(ArrayList<String> names, ArrayList<String> numbers) {
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = 0; j < names.size() - 1 - i; j++) {
                if (names.get(j).compareToIgnoreCase(names.get(j + 1)) > 0) {
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                    String tempNum = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tempNum);
                }
            }
        }
        String pokemon = "Here are all of the pokemon from A to Z.";
        return displayAlpha(names, numbers, pokemon);
    }

    private String sortZtoA(ArrayList<String> names, ArrayList<String> numbers) {
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = 0; j < names.size() - 1 - i; j++) {
                if (names.get(j).compareToIgnoreCase(names.get(j + 1)) < 0) {
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                    String tempNum = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tempNum);
                }
            }
        }
        String pokemon = "Here are all of the pokemon from Z to A.";
        return displayAlpha(names, numbers, pokemon);
    }

    private String displayAlpha(ArrayList<String> names, ArrayList<String> numbers, String pokemon) {
        for (int i = 0; i < names.size(); i++) {
            if (i % 20 == 0) {
                pokemon += "\n";
            }
            pokemon += (names.get(i) + " " + numbers.get(i) + "     ");
        }
        return pokemon;
    }

    private String sortSmallToTall(ArrayList<String> names, ArrayList<String> numbers, ArrayList<Double> heights) {
        for (int i = 0; i < heights.size() - 1; i++) {
            for (int j = 0; j < heights.size() - 1 - i; j++) {
                if (heights.get(j) > heights.get(j + 1)) {
                    Double tempHeight = heights.get(j);
                    heights.set(j, heights.get(j + 1));
                    heights.set(j + 1, tempHeight);
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                    String tempNum = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tempNum);
                }
            }
        }
        String pokemon = "Here are all of the pokemon from Smallest to Tallest.";
        return displayHeight(names, numbers, heights, pokemon);
    }

    private String sortTallToSmall(ArrayList<String> names, ArrayList<String> numbers, ArrayList<Double> heights) {
        for (int i = 0; i < heights.size() - 1; i++) {
            for (int j = 0; j < heights.size() - 1 - i; j++) {
                if (heights.get(j) < heights.get(j + 1)) {
                    Double tempHeight = heights.get(j);
                    heights.set(j, heights.get(j + 1));
                    heights.set(j + 1, tempHeight);
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                    String tempNum = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tempNum);
                }
            }
        }
        String pokemon = "Here are all of the pokemon from Tallest to Smallest.";
        return displayHeight(names, numbers, heights, pokemon);
    }

    private String displayHeight(ArrayList<String> names, ArrayList<String> numbers, ArrayList<Double> heights, String pokemon) {
        for (int i = 0; i < names.size(); i++) {
            if (i % 20 == 0) {
                pokemon += "\n";
            }
            pokemon += (heights.get(i) + " m " + names.get(i) + " " + numbers.get(i) + "    ");
        }
        return pokemon;
    }

    private String sortLightToHeavy(ArrayList<String> names, ArrayList<String> numbers, ArrayList<Double> weights) {
        for (int i = 0; i < weights.size() - 1; i++) {
            for (int j = 0; j < weights.size() - 1 - i; j++) {
                if (weights.get(j) > weights.get(j + 1)) {
                    Double tempWeight = weights.get(j);
                    weights.set(j, weights.get(j + 1));
                    weights.set(j + 1, tempWeight);
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                    String tempNum = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tempNum);
                }
            }
        }
        String pokemon = "Here are all of the pokemon from Lightest to Heaviest.";
        return displayWeight(names, numbers, weights, pokemon);
    }

    private String sortHeavyToLight(ArrayList<String> names, ArrayList<String> numbers, ArrayList<Double> weights) {
        for (int i = 0; i < weights.size() - 1; i++) {
            for (int j = 0; j < weights.size() - 1 - i; j++) {
                if (weights.get(j) < weights.get(j + 1)) {
                    Double tempWeight = weights.get(j);
                    weights.set(j, weights.get(j + 1));
                    weights.set(j + 1, tempWeight);
                    String tempName = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, tempName);
                    String tempNum = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tempNum);
                }
            }
        }
        String pokemon = "Here are all of the pokemon from Heaviest to Lightest.";
        return displayWeight(names, numbers, weights, pokemon);
    }

    private String displayWeight(ArrayList<String> names, ArrayList<String> numbers, ArrayList<Double> weights, String pokemon) {
        for (int i = 0; i < names.size(); i++) {
            if (i % 20 == 0) {
                pokemon += "\n";
            }
            pokemon += (weights.get(i) + " kg " + names.get(i) + " " + numbers.get(i) + "    ");
        }
        return pokemon;
    }
    
}
