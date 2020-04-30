package Servicii;

import Animale_Magice.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Scriere {
    private static Scriere scriere_instance = null;
    public static Scriere getInstance()
    {
        if(scriere_instance == null) scriere_instance = new Scriere();
        return scriere_instance;
    }

    public void write_dragoniCSV(List<Dragon> dragoni) {
        try {
            File fila = new File("dragoni.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("dragoni.csv");
            myWriter.write("");
            for(Dragon d: dragoni)
                myWriter.write(d.getNume() + "," + d.getCuloare() + "," + d.getVarsta() + "," + d.getPret() + "," + d.getSpecie() + "," + d.getElement() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public void write_phoenixesCSV(List<Phoenix> phoenixes) {
        try {
            File fila = new File("phoenixes.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("phoenixes.csv");
            myWriter.write("");
            for(Phoenix p: phoenixes)
                myWriter.write(p.getNume() + "," + p.getCuloare() + "," + p.getVarsta() + "," + p.getPret() + "," + p.getTara() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public void write_troliCSV(List<Trol> troli) {
        try {
            File fila = new File("troli.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("troli.csv");
            myWriter.write("");
            for(Trol t: troli)
                myWriter.write(t.getNume() + "," + t.getCuloare() + "," + t.getVarsta() + "," + t.getPret() + "," + t.getElement() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }

    public void write_zaneCSV(List<Zana> zane) {
        try {
            File fila = new File("zane.csv");
            fila.createNewFile();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("zane.csv");
            myWriter.write("");
            for(Zana z: zane)
                myWriter.write(z.getNume() + "," + z.getCuloare() + "," + z.getVarsta() + "," + z.getPret() + "," + z.getElement() + "\n");

            myWriter.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }
}
