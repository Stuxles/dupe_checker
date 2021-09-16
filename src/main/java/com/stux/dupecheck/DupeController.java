package com.stux.dupecheck;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;

import java.io.File;

public class DupeController {

    @FXML
    private Label folderText;

    @FXML
    protected void selectFolder() {
        final DirectoryChooser directoryChooser = new DirectoryChooser();

        File file = directoryChooser.showDialog(null);

        if (file != null) {
            folderText.setText(file.getAbsolutePath());
        }


    }
}