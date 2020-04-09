package Animale_Magice;
import java.util.Comparator;

public class A_sortByPret implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {return (int)(a1.getPret() - a2.getPret());}
}
