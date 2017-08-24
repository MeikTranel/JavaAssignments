package edu.MeikTranel.AssignmentFX;

import java.util.Locale;

public class Converter {
    public String ToGermanCurrency(final double value){
        return String.format(Locale.GERMANY,"€%.2f",value);
    }
    
    public double GallonToLiter(final double gallons){
        return gallons *  3.78f;
    }
    public double LiterToGallon(final double liters){
        return liters / 3.78f;
    }
    
}
