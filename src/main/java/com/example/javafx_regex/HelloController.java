package com.example.javafx_regex;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.regex.Pattern;

public class HelloController {

    @FXML
    private TextArea text_area;
    @FXML
    private TextField text_field;
    @FXML
    private Label label;
    @FXML
    private Button button;

    @FXML
    protected void onHelloButtonClick() {
        String pattern = text_field.getText();
        String word = text_area.getText();

        if(pattern.equals(word)){
            label.setText("OK");
        }else{
            label.setText("NG");
        }
    }
}

