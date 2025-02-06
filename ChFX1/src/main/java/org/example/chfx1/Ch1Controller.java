package org.example.chfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Ch1Controller {

    @FXML
    private Label resultLabel;

    private Logistics logistics;

    @FXML
    public void onTruckButtonClick() {
        logistics = new RoadLogistics();
        updateResultLabel(logistics.createTransport().deliver());
    }

    @FXML
    public void onShipButtonClick() {
        logistics = new SeaLogistics();
        updateResultLabel(logistics.createTransport().deliver());
    }

    @FXML
    public void onAirplaneButtonClick() {
        logistics = new AirLogistics();
        updateResultLabel(logistics.createTransport().deliver());
    }

    private void updateResultLabel(String result) {
        resultLabel.setText("The Result:\n" + result);
    }
}
