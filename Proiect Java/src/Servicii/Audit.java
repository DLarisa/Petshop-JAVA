package Servicii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class Audit {
    private static Audit instance = null;
    public static Audit getInstance()
    {
        if(instance == null) instance = new Audit();
        return instance;
    }

    private static PrintWriter printWriter;
    private static final String LOG ="audit.csv";

    public Audit() {
        try {
            printWriter = new PrintWriter(new File(LOG));
        } catch (FileNotFoundException exc) {
            //exc.printStackTrace();
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                inchidere();
            }
        });
    }

    public void scrie(String message) {
        Date d = new Date();
        printWriter.println(message + "," + d);
    }

    private boolean inchidere() {
        boolean result = true;
        printWriter.flush();
        printWriter.close();
        return result;
    }
}
