package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Zgjedhje {
    private final SimpleStringProperty destinacioni;
    private final SimpleStringProperty data;
    private final SimpleStringProperty orari;
    private final SimpleIntegerProperty numriVendeve;
    private final double cmimi;

    public Zgjedhje(String destinacioni, String data, String orari, int numriVendeve, double cmimi) {
        this.destinacioni = new SimpleStringProperty(destinacioni);
        this.data = new SimpleStringProperty(data);
        this.orari = new SimpleStringProperty(orari);
        this.numriVendeve = new SimpleIntegerProperty(numriVendeve);
        this.cmimi = cmimi;
    }

    public String getDestinacioni() {
        return destinacioni.get();
    }

    public SimpleStringProperty destinacioniProperty() {
        return destinacioni;
    }

    public String getData() {
        return data.get();
    }

    public SimpleStringProperty dataProperty() {
        return data;
    }

    public String getOrari() {
        return orari.get();
    }

    public SimpleStringProperty orariProperty() {
        return orari;
    }

    public int getNumriVendeve() {
        return numriVendeve.get();
    }

    public SimpleIntegerProperty numriVendeveProperty() {
        return numriVendeve;
    }

    public double getCmimi() {
        return cmimi;
    }
}
