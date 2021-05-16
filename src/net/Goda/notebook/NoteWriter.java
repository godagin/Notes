package net.Goda.notebook;

import java.io.*;

public class NoteWriter implements Runnable {
    private Note note;
    private final File outputFile;

    public NoteWriter(Note note, File outputFile){
        this.note = note;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        writeToFile();
    }

    public void writeToFile(){
        synchronized (outputFile){
            try {
                if (!outputFile.exists()) {
                    outputFile.createNewFile();
                }
                FileOutputStream fileOut = new FileOutputStream(outputFile, true);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(note);
                out.close();
                fileOut.close();


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("An error occurred.");
            }

            System.out.println(note.toString());
        }

    }

}
