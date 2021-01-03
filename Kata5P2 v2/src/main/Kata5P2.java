package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import view.HistogramDisplay;
import model.Histogram;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mail;
import view.MailListReader;
import view.MailListReaderBD;

public class Kata5P2 {

    public static void main(String[] args) {
        
        Kata5P2 histograma = new Kata5P2();
        try {
            histograma.execute();
        } catch (IOException ex) {
            Logger.getLogger(Kata5P2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private List<Mail> list;
    private Histogram<String> histogram;
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        //list = MailListReader.read("email.txt");
        list = MailListReaderBD.read();
    }
    
    private void process() throws IOException {
        histogram = view.MailHistogramBuilder.build(list);
    }
    
    private void output() throws IOException {
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM", histogram);
        histo.execute();
    }
}


