/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author cbran
 */
public class Team {

    boolean done;
    boolean done2;
    boolean found;
    Queue<String> team = new LinkedList();

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone2() {
        return done2;
    }

    public void setDone2(boolean done2) {
        this.done2 = done2;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    void start(Pokedex pokedex) throws IOException {
        setDone(false);
        while (!isDone()) {
            setPokemonOnTeam(pokedex, "Enter the name of the pokémon you want to go first in the party.");
            for (int i = 0; i < 5; i++) {
                setPokemonOnTeam(pokedex, "Enter the name of the pokémon you want to have in your party.");
            }
            displayTeam();
        }
    }

    private void setPokemonOnTeam(Pokedex pokedex, String output) {
        setDone(false);
        while (!isDone()) {
            String[] name = findPokemon(pokedex, "", output);
            boolean quit = false;
            while (!quit) {
                String choice = getUserInput(name[1] + "\n\n1 to confirm. 0 to choose another.");
                if (isFound()) {
                    if (choice.equals("1")) {
                        String nameFinal = name[0].toLowerCase();
                        nameFinal = nameFinal.substring(0, 1).toUpperCase() + nameFinal.substring(1);
                        team.add(nameFinal);
                        setDone(true);
                        quit = true;
                    } else if (choice.equals("0")) {
                        quit = true;
                    } else {
                        displayOptionError();
                    }
                }
            }
        }
    }

    private String getName(String output) {
        return getUserInput(output);
    }

    private String[] findPokemon(Pokedex pokedex, String name, String output) {
        name = getName(output);
        String[] names = new String[2];
        for (int i = 0; i < pokedex.getPokemonsSize(); i++) {
            if (name.equalsIgnoreCase(pokedex.getPokemon(i).getName())) {
                names[0] = name;
                names[1] = pokedex.displayPokemon(pokedex.getPokemon(i));
                break;
            } else if (i == (pokedex.getPokemonsSize() - 1)) {
                displayError();
                return findPokemon(pokedex, "", output);
            }
        }
        setFound(true);
        return names;
    }

    private void displayTeam() throws IOException {
        String pokemon = "Here is your team.\n";
        ArrayList<String> names = new ArrayList();
        int n = team.size();
        for (int i = 0; i < n; i++) {
            names.add(team.remove());
            pokemon += (i + 1) + ". " + names.get(i) + "\n";
        }
        for (int i = 0; i < names.size(); i++) {
            team.add(names.get(i));
        }
        pokemon += "\nSelect an option.\n"
                + "1. Save team\n"
                + "2. Create a new team\n"
                + "3. Go Back\n";
        setDone2(false);
        while (!isDone2()) {
            processUserInput(getUserInput(pokemon));
        }
    }

    private void processUserInput(String choice) throws IOException {
        if (choice.equals("1")) {
            File.saveTeam(team);
            boolean quit = false;
            while (!quit) {
                String choice2 = getUserInput("Select an option.\n1. Create a new team\n2. Go Back\n");
                if (choice2.equals("1")) {
                    setDone(false);
                    quit = true;
                } else if (choice2.equals("2")) {
                    setDone(true);
                    quit = true;
                } else {
                    displayOptionError();
                }
            }
            setDone2(true);
        } else if (choice.equals("2")) {
            team.clear();
            setDone2(true);
            setDone(false);
        } else if (choice.equals("3")) {
            team.clear();
            setDone2(true);
            setDone(true);
        } else {
            displayOptionError();
        }
    }

    private void displayMenu(String menu) {
        JOptionPane.showMessageDialog(null, menu);
    }

    private String getUserInput(String menu) {
        return JOptionPane.showInputDialog(menu);
    }

    private void displayOptionError() {
        displayMenu("Please select an option listed.");
    }

    private void displayError() {
        displayMenu("Sorry. We could not find the pokémon you were looking for.");
    }

}
