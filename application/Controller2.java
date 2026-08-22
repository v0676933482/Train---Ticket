package application;

import java.io.IOException;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Controller2 {

    @FXML
    private TableColumn<Zgjedhje, String> cmimiColumn;

    @FXML
    private TableColumn<Zgjedhje, String> dataColumn;

    @FXML
    private TableColumn<Zgjedhje, String> destinacioniColumn;

    @FXML
    private TableColumn<Zgjedhje, Integer> numriVendeveColumn;

    @FXML
    private TableColumn<Zgjedhje, String> orariColumn;

    @FXML
    private TableView<Zgjedhje> reservationTable;


    @FXML
    void initialize() {
        ObservableList<Zgjedhje> zgjedhjet = FXCollections.observableArrayList(
            new Zgjedhje("Shkodër", "2024-04-20", "10:00", 50, 500.0),
            new Zgjedhje("Lezhë", "2024-04-21", "12:00", 40, 400.0),
            new Zgjedhje("Tiranë", "2024-04-22", "14:00", 30, 300.0),
            new Zgjedhje("Durrës", "2024-04-23", "16:00", 20, 200.0)
        );

        reservationTable.setItems(zgjedhjet);

        destinacioniColumn.setCellValueFactory(cellData -> cellData.getValue().destinacioniProperty());
        dataColumn.setCellValueFactory(cellData -> cellData.getValue().dataProperty());
        orariColumn.setCellValueFactory(cellData -> cellData.getValue().orariProperty());
        numriVendeveColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getNumriVendeve()).asObject());
        cmimiColumn.setCellValueFactory(cellData -> new SimpleStringProperty(Double.toString(cellData.getValue().getCmimi())));
    }

    @FXML
    private Node firstNameField1; // Deklarimi i atributit për të përfaqësuar firstNameField

    // Metoda initialize dhe metoda tjetër continueClicked...

    @FXML
    void continueClicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Bileta.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);


            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
