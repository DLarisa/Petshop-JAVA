package Contracte;
import Animale_Magice.*;

/*
    Nu se pot adopta Dragoni si Phonexi. Tranzactia va fi declinata.
    Adoptatorul precizeaza o varsta minima pe care o vrea pentru animalut.
*/

public class Adoptator implements Contract {
    private String nume, CNP;
    private int zi, luna, an;
    private double suma;
    private Animal animal;
    private double age;

    public Adoptator(){}
    public Adoptator(String nume, String CNP, int zi, int luna, int an, double suma, Animal animal)
    {
        this.nume = nume;
        this.CNP = CNP;
        this.zi = zi;
        this.luna = luna;
        this.an = an;
        this.suma = suma;
        this.animal = animal;
    }

    @Override
    public String getCNP() {return this.CNP;}
    public void setCNP(String CNP) {this.CNP = CNP;}

    @Override
    public String getNume() {return this.nume;}
    public void setNume(String nume) {this.nume = nume;}

    @Override
    public String getData()
    {
        String aux;
        switch (this.luna)
        {
            case 1: aux = "Ianuarie"; break;
            case 2: aux = "Februarie"; break;
            case 3: aux = "Martie"; break;
            case 4: aux = "Aprilie"; break;
            case 5: aux = "Mai"; break;
            case 6: aux = "Iunie"; break;
            case 7: aux = "Iulie"; break;
            case 8: aux = "August"; break;
            case 9: aux = "Septembrie"; break;
            case 10: aux = "Octombrie"; break;
            case 11: aux = "Noiembrie"; break;
            case 12: aux = "Decembrie"; break;
            default: return "Eroare la introducerea datei!";
        }
        return Integer.toString(zi) + "/" + aux + "/" + Integer.toString(an);
    }
    public void setData(int zi, int luna, int an)
    {
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    @Override
    public double getSuma() {return this.suma;}
    public void setSuma(double suma) {this.suma = suma;}

    @Override
    public Animal getAnimal() {return this.animal;}
    public void setAnimal(Animal animal) {this.animal = animal;}

    public double getAge() {return this.age;}
    public void setAge(double age) {this.age = age;}

}
