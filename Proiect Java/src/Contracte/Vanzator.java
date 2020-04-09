package Contracte;
import Animale_Magice.*;

/*
    Poate vinde orice; magazinul trebuie sa aiba bani sa cumpere.
    El vrea o suma += suma*impozit. Magazinul poate declina anumite tranzactii.
*/

public class Vanzator implements Contract {
    private String nume, CNP;
    private int zi, luna, an;
    private double suma, impozit; //poate vinde orice animal;
    private Animal animal;

    public Vanzator(){}
    public Vanzator(String nume,  String CNP, int zi, int luna, int an, double suma, Animal animal)
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
    public void setNume(String nume) {this.nume = nume; }

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

    public double getImpozit() {return this.impozit;}
    public void setImpozit(double impozit) {this.impozit = impozit;}

    @Override
    public Animal getAnimal(){return this.animal;}
    public void setAnimal(Animal animal) {this.animal = animal;}
}
