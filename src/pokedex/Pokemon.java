/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.util.ArrayList;

/**
 *
 * @author Norco College
 */
class Pokemon {

    private String name;
    private String nationalNumber;
    private String type1;
    private String type2;
    private String species;
    private String gender;
    private String height;
    private String weight;
    private String entry;
    private ArrayList<String> evolvesInto;
    private String evolvesFrom;
    private String fileName; 
    
    Pokemon(String n, String num, String ty1, String ty2, String sp, String g, String h, String w, String e, ArrayList<String> eInto, String eFrom) {
        name = n;
        nationalNumber = num;
        type1 = ty1;
        type2 = ty2;
        species = sp;
        gender = g;
        height = h;
        weight = w;
        entry = e;
        evolvesInto = eInto;
        evolvesFrom = eFrom;
        fileName = String.valueOf(num) + ".png"; 
    }
    
    public String getFileName()
    {
        return fileName; 
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
    
    public ArrayList<String> getEvolvesInto() {
        return evolvesInto;
    }
    
    public void setEvolvesInto(ArrayList<String> evolvesInto) {
        this.evolvesInto = evolvesInto;
    }

    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }
    
}
