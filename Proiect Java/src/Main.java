import Animale_Magice.*;
import Contracte.*;
import Servicii.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service serviciu = new Service();
        Audit audit = new Audit();

        // Citire Animalele din Ziua Precedentă și le adaug în vectorii corespunzători pt a putea lucra cu ele
        Citire citire = new Citire();

        List<Dragon> aux1 = citire.read_dragoniCSV();
        if(aux1.size() > 0)
            for(Dragon d: aux1)
            { serviciu.adaugareAnimal(d); serviciu.adaugareDragon(d); }
        aux1.clear();

        List<Phoenix> aux2 = citire.read_phoenixesCSV();
        if(aux2.size() > 0)
            for(Phoenix p: aux2)
            { serviciu.adaugareAnimal(p); serviciu.adaugarePhoenix(p); }
        aux2.clear();

        List<Trol> aux3 = citire.read_troliCSV();
        if(aux3.size() > 0)
            for(Trol t: aux3)
            { serviciu.adaugareAnimal(t); serviciu.adaugareTrol(t); }
        aux3.clear();

        List<Zana> aux4 = citire.read_zaneCSV();
        if(aux4.size() > 0)
            for(Zana z: aux4)
            { serviciu.adaugareAnimal(z); serviciu.adaugareZana(z); }
        aux4.clear();
        //------------------------------------------------------------------------------------------

        Scanner in = new Scanner(System.in);
        Meniu();
        int comanda = in.nextInt();
        while(true)
        {
            switch (comanda)
            {
               case 0:
                    // Înainte de ieșirea din program, trebuie reactualizate listele cu animale (cele rămase, care nu au fost vândute / adoptate și adăugate cele cumpărate)
                    Scriere scriere = new Scriere();
                    scriere.write_dragoniCSV(serviciu.getDragoni()); scriere.write_phoenixesCSV(serviciu.getPhoenixes());
                    scriere.write_troliCSV(serviciu.getTroli()); scriere.write_zaneCSV(serviciu.getZane());
                    return;
                case 1: Dragon d = serviciu.citireDragon(); serviciu.adaugareAnimal(d); serviciu.adaugareDragon(d); audit.scrie("Adaugare_Dragon"); break;
                case 2: Phoenix p = serviciu.citirePhoenix(); serviciu.adaugareAnimal(p); serviciu.adaugarePhoenix(p); audit.scrie("Adaugare_Phoenix"); break;
                case 3: Trol t = serviciu.citireTrol(); serviciu.adaugareAnimal(t); serviciu.adaugareTrol(t); audit.scrie("Adaugare_Trol"); break;
                case 4: Zana z = serviciu.citireZana(); serviciu.adaugareAnimal(z); serviciu.adaugareZana(z); audit.scrie("Adaugare_Zana"); break;
                case 5: serviciu.afisareAnimale(); audit.scrie("Afisare_Animale"); break;
                case 6: serviciu.afisareDragoni(); audit.scrie("Afisare_Dragoni"); break;
                case 7: serviciu.afisarePhoenixex(); audit.scrie("Afisare_Phoenixes"); break;
                case 8: serviciu.afisareTroli(); audit.scrie("Afisare_Troli"); break;
                case 9: serviciu.afisareZane(); audit.scrie("Afisare_Zane"); break;
                case 10:
                    Cumparator c = serviciu.citireCumparator();
                    if(c != null) serviciu.adaugareCumparator(c);
                    audit.scrie("Citire_Cumparator"); break;
                case 11:
                    Vanzator v = serviciu.citireVanzator();
                    if(v != null) serviciu.adaugareVanzator(v);
                    audit.scrie("Citire_Vanzator"); break;
                case 12:
                    Adoptator a = serviciu.citireAdoptator();
                    if(a != null) serviciu.adaugareAdoptator(a);
                    audit.scrie("Citire_Adoptator"); break;
                case 13: serviciu.afisareCumparatori(); audit.scrie("Afisare_Cumparatori"); break;
                case 14: serviciu.afisareAdoptatori(); audit.scrie("Afisare_Adoptatori"); break;
                case 15: serviciu.afisareVanzatori(); audit.scrie("Afisare_Vanzatori"); break;
                case 16: serviciu.afisareAnimaleBatrane(); audit.scrie("Afisare_Animale_Batrane"); break;
                case 17: serviciu.afisareBani(); audit.scrie("Afisare_Bani"); break;
                default: System.out.println("Eroare la Introducerea unei Comenzi! Try Again!");
            }

            Meniu();
            comanda = in.nextInt();
        }
    }

    public static void Meniu()
    {
        System.out.println("Meniu:\n0) Exit\n1) Adaugare Dragon\n2) Adaugare Phoenix\n3) Adaugare Trol\n" +
                "4) Adaugare Zana\n5) Afisare Animale\n6) Afisare Dragoni\n7) Afisare Phoenixes\n" +
                "8) Afisare Troli\n9) Afisare Zane\n10) Tranzactie Cumparator\n11) Tranzactie Vanzator\n" +
                "12) Tranzactie Adoptator\n13) Istoric Cumparatori \n14) Istoric Adoptii \n15) Istoric Vanzatori \n16) Afisare Animale Batrane\n" +
                "17) Afisare Bani Magazin\n");
    }

}
