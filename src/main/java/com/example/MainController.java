package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField aSideField;

    @FXML
    private TextField areaField;

    @FXML
    private TextField bSideField;

    @FXML
    private TextField cSideField;

    @FXML
    void onClickCalcButton(ActionEvent event) {

    }

    void startCalc() {
        double aSide = Double.parseDouble(aSideField.getText());
        double bSide = Double.parseDouble(bSideField.getText());
        double cSide = Double.parseDouble(cSideField.getText());
        Double area = Triangle.calcArea(aSide, bSide, cSide);
        areaField.setText(area.toString());
        Storage.writeContent(area.toString());
    }

}
