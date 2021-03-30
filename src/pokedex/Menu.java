/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author cbran
 */
public class Menu {

    private boolean done;
    Pokedex pokedex;
    Team team;

    public Menu() throws IOException {
        this.pokedex = new Pokedex();
        this.team = new Team();
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done1) {
        this.done = done1;
    }

    public void start() throws IOException {
        setDone(false);
        while (!isDone()) {
            String menu = "Welcome to the National Pokedex!\n"
                    + "1. Display All Pokemon\n"
                    + "2. Search Pokemon by Name\n"
                    + "3. Search Pokemon by Number\n"
                    + "4. Search Pokemon by Type\n"
                    + "5. Create a team\n"
                    + "6. Display a team\n"
                    + "7. Exit\n";
            processUserData1(getUserInput(menu));
        }
    }

    private void processUserData1(String choice) throws IOException {
        if (choice.equals("1")) {
            setDone(false);
            while (!isDone()) {
                String menu = "How would you like to display the Pokémon?\n"
                        + "1. Ascending Numerical Order\n"
                        + "2. Descending Numerical Order\n"
                        + "3. A - Z\n"
                        + "4. Z - A\n"
                        + "5. Smallest to Tallest\n"
                        + "6. Tallest to Smallest\n"
                        + "7. Lightest to Heaviest\n"
                        + "8. Heaviest to Lightest\n"
                        + "9. Go Back";
                processUserData2(getUserInput(menu));
            }
            setDone(false);
        } else if (choice.equals("2")) {
            boolean quit = false;
            while (!quit) {
                String name = getUserInput("Enter the name of the pokémon. -1 to Go Back.");
                for (int i = 0; i < pokedex.getPokemonsSize(); i++) {
                    if (name.equalsIgnoreCase(pokedex.getPokemon(i).getName())) {
                        displayMenuIcon(pokedex.displayPokemon(pokedex.getPokemon(i)), i);
                        break;
                    } else if (name.equals("-1")) {
                        quit = true;
                    } else if (i == (pokedex.getPokemonsSize() - 1)) {
                        displayError("pokémon");
                    }
                }
            }
        } else if (choice.equals("3")) {
            boolean quit = false;
            while (!quit) {
                String number = getUserInput("Enter the number of the pokémon. -1 to Go Back.");
                if (number.equals("-1")) {
                    quit = true;
                } else {
                    int num = -1;
                    try {
                        num = Integer.parseInt(number);
                    } catch (NumberFormatException ex) {
                    }
                    int[] nums = new int[807];
                    for (int i = 0; i < pokedex.getPokemonsSize(); i++) {
                        nums[i] = Integer.parseInt(pokedex.getPokemon(i).getNationalNumber());
                    }
                    num = pokedex.binarySearch(nums, 0, pokedex.getPokemonsSize() - 1, num);
                    if (num == -1) {
                        displayError("pokémon");
                    } else {
                        displayMenuIcon(pokedex.displayPokemon(pokedex.getPokemon(num)), num);
                    }
                }
            }
        } else if (choice.equals("4")) {
            boolean quit = false;
            while (!quit) {
                String type = getUserInput("Enter the type of the pokémon. -1 to Go Back.");
                type = type.toLowerCase();
                type = type.substring(0, 1).toUpperCase() + type.substring(1);
                if (type.equals("Normal") || type.equals("Fighting") || type.equals("Flying")
                        || type.equals("Fire") || type.equals("Water") || type.equals("Grass")
                        || type.equals("Poison") || type.equals("Electric") || type.equals("Ground")
                        || type.equals("Psychic") || type.equals("Rock") || type.equals("Ice")
                        || type.equals("Bug") || type.equals("Dragon") || type.equals("Ghost")
                        || type.equals("Dark") || type.equals("Steel") || type.equals("Fairy")) {
                    displayMenu(pokedex.getType(type).displayPokemon(type));
                } else if (type.equals("-1")) {
                    quit = true;
                } else {
                    displayError("type");
                }
            }
        } else if (choice.equals("5")) {
            team.start(pokedex);
        } else if (choice.equals("6")) {
            boolean quit = false;
            while (!quit) {
                try {
                    File.loadTeam();
                    quit = true;
                } catch (FileNotFoundException ex) {
                    displayMenu("No team file found yet.\nCreate one by creating a team.");
                } catch (IOException ex) {
                    displayMenu("Unable to read team file.\nCreate one by creating a team.");
                }
            }
        } else if (choice.equals("7")) {
            setDone(true);
        } else {
            displayOptionError();
        }
    }

    private void processUserData2(String choice) {
        if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")
                || choice.equals("5") || choice.equals("6") || choice.equals("7") || choice.equals("8")) {
            displayMenu(pokedex.startSort(choice));
        } else if (choice.equals("9")) {
            setDone(true);
        } else {
            displayOptionError();
        }
    }

    private void displayMenu(String menu) {
        JOptionPane.showMessageDialog(null, menu);
    }
    private void displayMenuIcon(String menu, int i) {
        JOptionPane.showMessageDialog(null, menu, "Pokedex", JOptionPane.INFORMATION_MESSAGE, pokedex.pkIcon(pokedex.getPokemon(i)));
    }

    private String getUserInput(String menu) {
        return JOptionPane.showInputDialog(menu);
    }

    private void displayOptionError() {
        displayMenu("Please select an option listed.");
    }

    private void displayError(String object) {
        displayMenu("Sorry. We could not find the " + object + " you were looking for.");
    }
}
