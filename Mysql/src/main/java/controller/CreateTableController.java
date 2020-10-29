package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CreateTableController {

    @FXML
    private DialogPane dialogPane;

    @FXML
    private GridPane columnGridPane;

    public void initialize() {
        dialogPane.getButtonTypes().addAll(
                ButtonType.OK,
                ButtonType.CANCEL
        );
    }

    @FXML
    public void addImageClick(){
        System.out.println("vikalp");
    }

    @FXML
    public void minusImageClick() {
    }

    @FXML
    public void addImageHover(){

    }
}
