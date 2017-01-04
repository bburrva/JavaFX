package sample;

import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources){list.setItems(contacts);}

    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;

    public void addItem() throws IOException {
        Contact c = new Contact(name.getText(), phone.getText(), email.getText());
        if (name.getText().equals("") || phone.getText().equals("") || email.getText().equals("")) {
            System.out.println("All fields required.");
            Contact.infoBox("All fields are required.", "Error");
        } else {
//            c.gson(name.getText(), phone.getText(), email.getText());
            contacts.add(new Contact(name.getText(), phone.getText(), email.getText()));
            name.setText("");
            phone.setText("");
            email.setText("");
        }
    }

    public void removeItem() {
        Contact person = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(person);
    }
}
