package Servicii;

import Animale_Magice.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Citire {
    private static Citire citire_instance = null;
    public static Citire getInstance()
    {
        if(citire_instance == null) citire_instance = new Citire();
        return citire_instance;
    }

    public List<Dragon> read_dragoniCSV()
    {
        List<Dragon> dragoni = new ArrayList<Dragon>();
        try {
            RandomAccessFile fila = new RandomAccessFile("dragoni.csv", "r");
            String str;

            while((str = fila.readLine()) != null)
            {
                String[] l = str.split(",");
                Dragon d = new Dragon(l[0], l[1], Double.valueOf(l[2]), Double.valueOf(l[3]), l[4], l[5]);
                dragoni.add(d);
            }

            fila.close();
        } catch (FileNotFoundException e) {
           // e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return dragoni;
    }

    public List<Phoenix> read_phoenixesCSV()
    {
        List<Phoenix> phoenixes = new ArrayList<Phoenix>();
        try
        {
            RandomAccessFile fila = new RandomAccessFile("phoenixes.csv", "r");
            String str;

            while((str = fila.readLine()) != null)
            {
                String[] l = str.split(",");
                Phoenix p = new Phoenix(l[0], l[1], Double.valueOf(l[2]), Double.valueOf(l[3]), l[4]);
                phoenixes.add(p);
            }

            fila.close();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return phoenixes;
    }

    public List<Trol> read_troliCSV()
    {
        List<Trol> troli = new ArrayList<Trol>();
        try
        {
            RandomAccessFile fila = new RandomAccessFile("troli.csv", "r");
            String str;

            while((str = fila.readLine()) != null)
            {
                String[] l = str.split(",");
                Trol t = new Trol(l[0], l[1], Double.valueOf(l[2]), Double.valueOf(l[3]), l[4]);
                troli.add(t);
            }

            fila.close();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return troli;
    }

    public List<Zana> read_zaneCSV()
    {
        List<Zana> zane = new ArrayList<Zana>();
        try
        {
            RandomAccessFile fila = new RandomAccessFile("zane.csv", "r");
            String str;

            while((str = fila.readLine()) != null)
            {
                String[] l = str.split(",");
                Zana z = new Zana(l[0], l[1], Double.valueOf(l[2]), Double.valueOf(l[3]), l[4]);
                zane.add(z);
            }

            fila.close();
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return zane;
    }
}
