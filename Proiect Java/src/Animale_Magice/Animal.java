package Animale_Magice;

public abstract class Animal {
    private String nume, culoare;
    private double varsta, pret;

    public Animal(){}

    public Animal(String nume, String culoare, double varsta, double pret)
    {
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
        this.pret = pret;
    }

    public String getNume(){return this.nume;}
    public void setNume(String nume){this.nume = nume;}

    public String getCuloare(){return this.culoare;}
    public void setCuloare(String culoare){this.culoare = culoare;}

    public double getVarsta(){return this.varsta;}
    public void setVarsta(double varsta){this.varsta = varsta;}

    public double getPret(){return this.pret;}
    public void setPret(double pret){this.pret = pret;}

    @Override
    public String toString()
    {
        return "Animal: " + this.nume + ", " + this.varsta + " ani \nCuloare: "
                + this.culoare + "\nPret: " + this.pret + " monede de aur";
    }
}
