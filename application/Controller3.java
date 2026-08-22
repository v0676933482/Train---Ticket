package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller3 {

    @FXML
    private TextField teDhenatField;

    public void shfaqTeDhenat(TeDhenat teDhenat) {
        Zgjedhje zgjedhje = teDhenat.getZgjedhja();
        String tekst = "Emri: " + teDhenat.getEmri() + "\n" +
                       "Mbiemri: " + teDhenat.getMbiemri() + "\n" +
                       "Email: " + teDhenat.getEmail() + "\n" +
                       "Telefoni: " + teDhenat.getTelefon() + "\n" +
                       "Gjinia: " + teDhenat.getGjinia() + "\n" +
                       "Destinacioni: " + zgjedhje.getDestinacioni() + "\n" +
                       "Data: " + zgjedhje.getData() + "\n" +
                       "Orari: " + zgjedhje.getOrari() + "\n" +
                       "Numri i vendeve: " + zgjedhje.getNumriVendeve() + "\n" +
                       "Cmimi: " + zgjedhje.getCmimi();
        teDhenatField.setText(tekst);
    }
}
