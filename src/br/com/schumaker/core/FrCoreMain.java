package br.com.schumaker.core;

import java.io.File;
import javax.swing.JProgressBar;

/**
 *
 * @author hudson schumaker
 */
public class FrCoreMain {

    private static final FrCoreMain INSTANCE = new FrCoreMain();

    private FrCoreMain() {

    }

    public static FrCoreMain getInstance() {
        return INSTANCE;
    }

    public void setMacintoshHD(JProgressBar bar) {
        File file = new File("/");
        System.out.println(file.getTotalSpace());
        double max = ((file.getTotalSpace() / 1024) / 1024) / 1024;
        double free = ((file.getFreeSpace() / 1024) / 1024) / 1024;

        System.out.println("Total space (bytes): " + ((file.getTotalSpace() / 1024) / 1024) / 1024);
        System.out.println("Free space (bytes): " + ((file.getFreeSpace() / 1024) / 1024) / 1024);
        System.out.println("Usable space (bytes): " + ((file.getUsableSpace() / 1024) / 1024) / 1024);
        System.out.println("Free space (Giga): " + ((file.getFreeSpace() / 1024) / 1024) / 1024);

        double use = max - free;
        System.out.println(use);

        bar.setMaximum((int) max);
        bar.setMinimum(0);
        bar.setValue((int) use);
    }

}
