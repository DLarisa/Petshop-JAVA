import Animale_Magice.*;
import Contracte.*;

import java.util.*;
import java.lang.*;

public class Service {
    public static double SUMA_MAGAZIN=5000;

    private static Service single = null;
    public static Service getInstance()
    {
        if (single == null) single = new Service();
        return single;
    }

    private List<Animal> animale;
    private List<Dragon> dragoni;
    private List<Phoenix> phoenixes;
    private List<Trol> troli;
    private List<Zana> zane;

    private List<Cumparator> cumparatori;
    private List<Adoptator> adoptatori;
    private List<Vanzator> vanzatori;

    Service()
    {
        this.animale = new ArrayList<Animal>();
        this.dragoni = new ArrayList<Dragon>();
        this.phoenixes = new ArrayList<Phoenix>();
        this.troli = new ArrayList<Trol>();
        this.zane = new ArrayList<Zana>();

        this.cumparatori = new ArrayList<Cumparator>();
        this.adoptatori = new ArrayList<Adoptator>();
        this.vanzatori = new ArrayList<Vanzator>();
    }
    
    public List<Dragon> getDragoni()
    { return this.dragoni; }
    public List<Phoenix> getPhoenixes()
    { return this.phoenixes; }
    public List<Trol> getTroli()
    { return this.troli; }
    public List<Zana> getZane()
    { return this.zane; }
    
    public void afisareBani() { System.out.println(this.SUMA_MAGAZIN); }

    public void adaugareAnimal(Animal a) { this.animale.add(a); }
    public void afisareAnimale()
    { for(Animal a: this.animale) { System.out.println(a.toString()); System.out.println("------------------------------"); } }
    public void adaugareDragon(Dragon d) { this.dragoni.add(d); }
    public void afisareDragoni()
    { for(Dragon d: this.dragoni) { System.out.println(d.toString()); System.out.println("------------------------------"); } }
    public void adaugarePhoenix(Phoenix p) { this.phoenixes.add(p); }
    public void afisarePhoenixex()
    { for(Phoenix p: this.phoenixes) { System.out.println(p.toString()); System.out.println("------------------------------"); }}
    public void adaugareTrol(Trol t) { this.troli.add(t); }
    public void afisareTroli()
    { for(Trol t: this.troli) { System.out.println(t.toString()); System.out.println("------------------------------"); } }
    public void adaugareZana(Zana z) { this.zane.add(z); }
    public void afisareZane()
    { for(Zana z: this.zane) { System.out.println(z.toString()); System.out.println("------------------------------"); } }

    public void adaugareCumparator(Cumparator c) { this.cumparatori.add(c); }
    public void afisareCumparatori()
    {
        for(Cumparator c: this.cumparatori)
        {
            System.out.println(c.getCNP());
            System.out.println(c.getNume());
            System.out.println(c.getData());
            System.out.println(c.getSuma());
            System.out.println(c.getAnimal());
            System.out.println("------------------------------");
        }
    }
    public void adaugareAdoptator(Adoptator a) { this.adoptatori.add(a); }
    public void afisareAdoptatori()
    {
        for(Adoptator a: this.adoptatori)
        {
            System.out.println(a.getCNP());
            System.out.println(a.getNume());
            System.out.println(a.getData());
            System.out.println(a.getSuma());
            System.out.println(a.getAnimal());
            System.out.println("------------------------------");
        }
    }
    public void adaugareVanzator(Vanzator v) { this.vanzatori.add(v); }
    public void afisareVanzatori()
    {
        for(Vanzator v: this.vanzatori)
        {
            System.out.println(v.getCNP());
            System.out.println(v.getNume());
            System.out.println(v.getData());
            System.out.println(v.getSuma());
            System.out.println(v.getAnimal());
            System.out.println("------------------------------");
        }
    }

    public Dragon citireDragon()
    {
        Dragon a = new Dragon();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Culoare: "); String cul = in.nextLine(); a.setCuloare(cul);
        System.out.println("Specie: "); String specie = in.nextLine(); a.setSpecie(specie);
        System.out.println("Element: "); String el = in.nextLine(); a.setElement(el);
        System.out.println("Varsta: "); double v = in.nextDouble(); a.setVarsta(v);
        System.out.println("Pret: "); double p = in.nextDouble(); a.setPret(p);
        return a;
    }
    public Phoenix citirePhoenix()
    {
        Phoenix a = new Phoenix();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Culoare: "); String cul = in.nextLine(); a.setCuloare(cul);
        System.out.println("Tara: "); String t = in.nextLine(); a.setTara(t);
        System.out.println("Varsta: "); double v = in.nextDouble(); a.setVarsta(v);
        System.out.println("Pret: "); double p = in.nextDouble(); a.setPret(p);
        return a;
    }
    public Trol citireTrol()
    {
        Trol a = new Trol();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Culoare: "); String cul = in.nextLine(); a.setCuloare(cul);
        System.out.println("Element: "); String el = in.nextLine(); a.setElement(el);
        System.out.println("Varsta: "); double v = in.nextDouble(); a.setVarsta(v);
        System.out.println("Pret: "); double p = in.nextDouble(); a.setPret(p);
        return a;
    }
    public Zana citireZana()
    {
        Zana a = new Zana();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Culoare: "); String cul = in.nextLine(); a.setCuloare(cul);
        System.out.println("Element: "); String el = in.nextLine(); a.setElement(el);
        System.out.println("Varsta: "); double v = in.nextDouble(); a.setVarsta(v);
        System.out.println("Pret: "); double p = in.nextDouble(); a.setPret(p);
        return a;
    }

    public Cumparator citireCumparator()
    {
        Cumparator a = new Cumparator();
        Scanner in = new Scanner(System.in);
        System.out.println("Data: "); int z = in.nextInt(), l = in.nextInt(), an = in.nextInt(); a.setData(z, l, an);
        System.out.println("Suma: "); double s = in.nextDouble(); a.setSuma(s);
        String buff = in.nextLine();
        System.out.println("CNP: "); String CNP = in.nextLine(); a.setCNP(CNP);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Animal: "); String animal = in.nextLine();
        switch (animal)
        {
            case "Dragon":
                if(dragoni.size() > 0)
                {Collections.sort(this.dragoni, new A_sortByPret());

                int poz = 0;
                for(int i=0; i<dragoni.size(); i++)
                    if(a.getSuma() < dragoni.get(i).getPret()) poz = i;

                a.setAnimal(dragoni.get(poz));
                animale.remove(dragoni.get(poz));
                this.SUMA_MAGAZIN += dragoni.get(poz).getPret();
                dragoni.remove(poz);
                break;}
                else return null;
            case "Phoenix":
                if(phoenixes.size() > 0)
                {Collections.sort(this.phoenixes, new A_sortByPret());

                int poz = 0;
                for(int i=0; i<phoenixes.size(); i++)
                    if(a.getSuma() < phoenixes.get(i).getPret()) poz = i;

                a.setAnimal(phoenixes.get(poz));
                animale.remove(phoenixes.get(poz));
                this.SUMA_MAGAZIN += phoenixes.get(poz).getPret();
                phoenixes.remove(poz);
                break;}
                else return null;
            case "Trol":
                if(troli.size() > 0)
                { Collections.sort(this.troli, new A_sortByPret());

                int poz = 0;
                for(int i=0; i<troli.size(); i++)
                    if(a.getSuma() < troli.get(i).getPret()) poz = i;

                a.setAnimal(troli.get(poz));
                animale.remove(troli.get(poz));
                this.SUMA_MAGAZIN += troli.get(poz).getPret();
                troli.remove(poz);
                break;}
                else return null;
            case "Zana":
                if(zane.size() > 0)
                {Collections.sort(this.zane, new A_sortByPret());

                int poz = 0;
                for(int i=0; i<zane.size(); i++)
                    if(a.getSuma() < zane.get(i).getPret()) poz = i;

                a.setAnimal(zane.get(poz));
                animale.remove(zane.get(poz));
                this.SUMA_MAGAZIN += zane.get(poz).getPret();
                phoenixes.remove(poz);
                break;}
                else return null;
            default: System.out.println("Eroare la Citire Animal. Try Again"); return null;
        }

        if(a.getAnimal() == null) return null;
        return a;
    }

    public Vanzator citireVanzator()
    {
        Vanzator a = new Vanzator();
        Scanner in = new Scanner(System.in);
        System.out.println("Data: "); int z = in.nextInt(), l = in.nextInt(), an = in.nextInt(); a.setData(z, l, an);
        System.out.println("Suma: "); double s = in.nextDouble(); a.setSuma(s);
        System.out.println("Impozit: "); double imp = in.nextDouble(); a.setImpozit(imp);

        double nr = a.getSuma(); nr += nr*a.getImpozit();
        if(this.SUMA_MAGAZIN <= nr) return null;
        else this.SUMA_MAGAZIN -= nr;

        String buff = in.nextLine();
        System.out.println("CNP: "); String CNP = in.nextLine(); a.setCNP(CNP);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Animal: "); String animal = in.nextLine();

        switch (animal)
        {
            case "Dragon": Dragon d = citireDragon(); d.setPret(nr); this.adaugareAnimal(d); this.adaugareDragon(d); break;
            case "Phoenix": Phoenix p = citirePhoenix(); p.setPret(nr); this.adaugareAnimal(p); this.adaugarePhoenix(p); break;
            case "Trol": Trol t =citireTrol(); t.setPret(nr); this.adaugareAnimal(t); this.adaugareTrol(t); break;
            case "Zana": Zana za = citireZana(); za.setPret(nr); this.adaugareAnimal(za); this.adaugareZana(za); break;
            default: System.out.println("Eroare la Citire Animal. Try Again"); return null;
        }
        return a;
    }

    public Adoptator citireAdoptator()
    {
        Adoptator a = new Adoptator();
        Scanner in = new Scanner(System.in);
        System.out.println("Data: "); int z = in.nextInt(), l = in.nextInt(), an = in.nextInt(); a.setData(z, l, an);
        System.out.println("Suma: "); double s = in.nextDouble(); a.setSuma(s);
        System.out.println("Varsta Animalut: "); double age = in.nextDouble(); a.setAge(age);

        Collections.sort(this.animale, new A_sortByPret());
        if(animale.size() == 0 || animale.get(0).getPret() > a.getSuma()) return null;
        Collections.sort(this.animale, new A_sortByVarsta());
        if(animale.get(animale.size()-1).getVarsta() < a.getAge()) return null;

        String buff = in.nextLine();
        System.out.println("CNP: "); String CNP = in.nextLine(); a.setCNP(CNP);
        System.out.println("Nume: "); String nume = in.nextLine(); a.setNume(nume);
        System.out.println("Animal: "); String animal = in.nextLine();

        switch (animal)
        {
            case "Trol":
                if(troli.size() > 0)
                {Collections.sort(this.troli, new A_sortByVarsta());
                int poz = 0, i;
                for(i=0; i<troli.size(); i++)
                    if(a.getAge() < troli.get(i).getVarsta() && a.getSuma() <= troli.get(i).getPret()) {poz=i; break;}

                a.setAnimal(troli.get(poz)); animale.remove(troli.get(poz));
                this.SUMA_MAGAZIN += troli.get(poz).getPret();
                troli.remove(poz);
                break;}
                else return null;
            case "Zana":
                if(zane.size() > 0)
                {Collections.sort(this.zane, new A_sortByVarsta());
                    int poz = 0, i;
                    for(i=0; i<zane.size(); i++)
                        if(a.getAge() < zane.get(i).getVarsta() && a.getSuma() <= zane.get(i).getPret()) {poz=i; break;}

                    a.setAnimal(zane.get(poz)); animale.remove(zane.get(poz));
                    this.SUMA_MAGAZIN += zane.get(poz).getPret();
                    zane.remove(poz);
                    break;}
                else return null;
            default: System.out.println("Eroare la Citire Animal. Try Again"); return null;
        }

        if(a.getAnimal() == null) return null;
        return a;
    }

    public void afisareAnimaleBatrane()
    {
        Collections.sort(this.animale, new A_sortByVarsta().reversed().thenComparing(new A_sortByPret()));
        System.out.println("Ce animale doriti sa vedeti?\n1) Toate\n2) Dragoni\n3) Phonixes\n4) Troli\n5) Zane");
        Scanner in = new Scanner(System.in);
        int aux = in.nextInt();
        switch (aux)
        {
            case 1: afisareAnimale(); break;
            case 2: afisareDragoni(); break;
            case 3: afisarePhoenixex(); break;
            case 4: afisareTroli(); break;
            case 5: afisareZane(); break;
            default: System.out.println("Comanda introdusa Gresit. Try Again!"); break;
        }
    }

}
