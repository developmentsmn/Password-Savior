package com.developmentsmn.passwordsavior;
import com.developmentsmn.passwordsavior.datamodule.PasswordItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import java.util.ArrayList;
import java.util.List;
public class Controller {
    private List<PasswordItem> passwordItems;
    @FXML
    private ListView<PasswordItem> passwordListView;
    @FXML
    private TextArea itemDetailsTextArea;
    public void initialize() {
        PasswordItem password1 = new PasswordItem("LeetCode", "leetcode@gmail.com","xxxyyyzzz");
        PasswordItem password2 = new PasswordItem("Google", "google@gmail.com","xxxyyyzzz");
        PasswordItem password3 = new PasswordItem("Facebook", "facebok@gmail.com","xxxyyyzzz");
        PasswordItem password4 = new PasswordItem("Chase", "chase@gmail.com","xxxyyyzzz");
        PasswordItem password5 = new PasswordItem("Visa", "visa@gmail.com","xxxyyyzzz");
        passwordItems = new ArrayList<PasswordItem>();
        passwordItems.add(password1);
        passwordItems.add(password2);
        passwordItems.add(password3);
        passwordItems.add(password4);
        passwordItems.add(password5);
        passwordListView.getItems().setAll(passwordItems);
        passwordListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    @FXML
    public void handleClickListView() {
        PasswordItem password =  passwordListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText("Email: " + password.getEmail() +"\n"+ "Password: " + password.getPassword());
    }
}
