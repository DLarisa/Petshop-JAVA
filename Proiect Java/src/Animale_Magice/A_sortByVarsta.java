package Animale_Magice;
import java.util.Comparator;

public class A_sortByVarsta implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {return (int)(a1.getVarsta() - a2.getVarsta());}
}
