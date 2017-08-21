package edu.MeikTranel.AssignmentFX;

import java.util.Scanner;

/**
 * @author meiktranel
 */
public abstract class BaseUebung {
    protected final Scanner Scanner;
    protected Converter Converter;
    public BaseUebung(){
        this.Scanner = new Scanner(System.in);
        this.Converter = new Converter();
    }
}
