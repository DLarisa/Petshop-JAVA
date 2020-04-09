package Animale_Magice;
/*

*/

public class Dragon extends Animal {
    private String specie, element;

    public Dragon(){}
    public Dragon(String specie, String element)
    {
        this.specie = specie;
        this.element = element;
    }
    public Dragon(String nume, String culoare, double varsta, double pret, String specie, String element)
    {
        super(nume, culoare, varsta, pret);
        this.specie = specie;
        this.element = element;

        switch (this.element)
        {
            case "Foc":
                pret += pret * 0.7; this.setPret(pret); break;
            case "Apa":
                pret += pret * 0.5; this.setPret(pret); break;
            case "Pamant":
                pret += pret * 0.3; this.setPret(pret); break;
            case "Aer":
                pret += pret * 0.1; this.setPret(pret); break;
            default:
                break;
        }
    }

    public String getSpecie() {return this.specie;}
    public void setSpecie(String specie) {this.specie = specie;}

    public String getElement() {return this.element;}
    public void setElement(String element) {this.element = element;}

    @Override
    public String toString()
    {
        return "Dragon " + this.specie + ": " + this.getNume() + ", " + this.getVarsta() + " ani \nElement: " + this.element +
                "\nCulore: " + this.getCuloare()
                + "\nPret: " + this.getPret() + " monede de aur";
    }
}
