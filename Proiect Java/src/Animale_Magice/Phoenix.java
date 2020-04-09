package Animale_Magice;

public class Phoenix extends Animal {
    private String tara;

    public Phoenix(){}
    public Phoenix(String tara) {this.tara = tara;}
    public Phoenix(String nume, String culoare, double varsta, double pret, String tara)
    {
        super(nume, culoare, varsta, pret);
        this.tara = tara;

        switch (this.tara)
        {
            case "Grecia":
                pret += pret * 0.7; this.setPret(pret); break;
            case "Spania":
                pret += pret * 0.5; this.setPret(pret); break;
            case "Japonia":
                pret += pret * 0.3; this.setPret(pret); break;
            default:
                break;
        }

        if(this.getCuloare() != "portocaliu" || this.getCuloare() != "rosu") this.setCuloare("portocaliu");
    }

    public String getTara() {return this.tara;}
    public void setTara(String tara) {this.tara = tara;}

    @Override
    public String toString()
    {
        return "Phoenix din " + this.tara + ": " + this.getNume() + ", " + this.getVarsta() + " ani"
                + "\nPret: " + this.getPret() + " monede de aur";
    }
}
