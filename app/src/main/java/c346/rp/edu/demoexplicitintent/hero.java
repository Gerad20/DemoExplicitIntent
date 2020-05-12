package c346.rp.edu.demoexplicitintent;

import java.io.Serializable;

public class hero implements Serializable {
    private String name;
    private int strength;
    private int technicalProwess;

    public hero(String name, int strength,
                int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }



    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;

    }
}
