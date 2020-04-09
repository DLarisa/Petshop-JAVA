package Animale_Magice;


public class Trol extends Animal {
    private String element;

    public Trol(){}
    public Trol(String element) {this.element = element;}
    public Trol(String nume, String culoare, double varsta, double pret, String element)
    {
        super(nume, culoare, varsta, pret);
        this.element = element;

        switch (this.element)
        {
            case "Apa":
                pret += pret * 0.7; this.setPret(pret); break;
            case "Padure":
                pret += pret * 0.5; this.setPret(pret); break;
            case "Munte":
                pret += pret * 0.3; this.setPret(pret); break;
            case "Mlastina":
                pret += pret * 0.1; this.setPret(pret); break;
            default:
                break;
        }

        if(this.getCuloare() != "maroniu") this.setCuloare("maroniu");
    }

    public String getElement() {return this.element;}
    public void setElement(String element) {this.element = element;}

    @Override
    public String toString()
    {
        return "Trol de " + this.element + ": " + this.getNume() + ", " + this.getVarsta() + " ani"
                + "\nPret: " + this.getPret() + " monede de aur";
    }
}
