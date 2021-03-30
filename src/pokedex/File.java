/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Norco College
 */
public class File {

    private static String fileName = "";

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        File.fileName = fileName;
    }

    public static void getPokemonData(ArrayList<Pokemon> pokes) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("Pokemon.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] pokeData = line.split(",");
            String[] eInto = pokeData[9].split("&");
            ArrayList<String> evo = new ArrayList(Arrays.asList(eInto));
            Pokemon pk = new Pokemon(pokeData[0], (pokeData[1]), pokeData[2], pokeData[3], pokeData[4], pokeData[5], (pokeData[6]), (pokeData[7]), pokeData[8], evo, pokeData[10]);
            pokes.add(pk);
        }
    }

    public static void saveTeam(Queue<String> pokemon) throws IOException {
        boolean done = false;
        while (!done) {
            setFileName(getUserInput("Enter a name for the file to save the team.") + ".txt");
            java.io.File file = new java.io.File(getFileName());
            if (file.createNewFile()) {
                displayMenu("File created.");
                done = true;
            } else {
                displayMenu("File already exists.");
            }
        }
        PrintWriter pr = new PrintWriter(fileName);
        int n = pokemon.size();
        for (int i = 0; i < n; i++) {
            pr.println((i + 1) + ". " + pokemon.remove());
        }
        pr.flush();
    }

    public static void loadTeam() throws FileNotFoundException, IOException {
        boolean done = false;
        while (!done) {
            String name = getUserInput("Enter the name of the team you wish to display. -1 to go back.") + ".txt";
            if (name.equals("-1.txt")) {
                done = true;
            } else {
                setFileName(name);
                BufferedReader br = new BufferedReader(new FileReader(getFileName()));
                ArrayList<String> teamFile = new ArrayList();
                String line;
                while ((line = br.readLine()) != null) {
                    teamFile.add(line);
                }
                String team = "Here is the team.\n";
                for (int i = 0; i < teamFile.size(); i++) {
                    team += teamFile.get(i) + "\n";
                }
                displayMenu(team);
            }
        }
    }

    private static void displayMenu(String menu) {
        JOptionPane.showMessageDialog(null, menu);
    }

    private static String getUserInput(String menu) {
        return JOptionPane.showInputDialog(menu);
    }
}
