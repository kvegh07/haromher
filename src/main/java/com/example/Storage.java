package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void writeContent(String areaStr) {
    try {
        tryWriteContent(areaStr);
    } catch (IOException e) {
        System.err.println("Hiba! A fájl nem írható!");
        System.err.println(e.getMessage());
    }
    }

                public static void tryWriteContent(String areaStr) throws IOException  {
                    FileWriter fileWriter = new FileWriter("teruletek.txt", true);
                    fileWriter.write(areaStr + "\n");
                    fileWriter.close();
                }

    
}
