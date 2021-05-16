package net.Goda.notebook;

import java.io.*;

public class NoteReader implements Runnable{
    private Note note;
    private File inputFile;

    public NoteReader(File inputFile){
        this.inputFile = inputFile;
    }

    public Note getNote(){
        return note;
    }

    @Override
    public void run() {
        try {

            if (inputFile.exists()) {

                FileInputStream fileIn = new FileInputStream(inputFile);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                note = (Note) in.readObject();
                in.close();
                fileIn.close();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("An error occurred.");
        }
    }


}
