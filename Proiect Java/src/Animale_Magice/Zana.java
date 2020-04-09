package Animale_Magice;


public class Zana extends Animal {
    private String element;

    public Zana(){}
    public Zana(String element) {this.element = element;}
    public Zana(String nume, String culoare, double varsta, double pret, String element)
    {
        super(nume, culoare, varsta, pret);
        this.element = element;

        switch (this.element)
        {
            case "Apa":
                pret += pret * 0.7; this.setPret(pret); break;
            case "Padure":
                pret += pret * 0.5; this.setPret(pret); break;
            default:
                break;
        }
    }

    public String getElement() {return this.element;}
    public void setElement(String element) {this.element = element;}

    @Override
    public String toString()
    {
        return "Zana de " + this.element + ": " + this.getNume() + ", " + this.getVarsta() + " ani \nCulore: " + this.getCuloare()
                + "\nPret: " + this.getPret() + " monede de aur";
    }
}
