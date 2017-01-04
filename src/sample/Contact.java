package sample;

import com.google.gson.Gson;
import javafx.scene.control.Alert;

/**
 * Created by Ben on 1/3/17.
 */
public class Contact {
    String name = "";
    String phone = "";
    String email = "";

    public Contact(){}

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    Gson gson = new Gson();
//    String json = gson.toJson(new Contact());

//    Contact deserialized = gson.fromJson(json, Contact.class);

    @Override
    public String toString() {return String.format("%s, %s, %s", name, phone, email);}

    public static void infoBox(String message, String title) {
        infoBox(message, title, null);
    }

    public static void infoBox(String message, String title, String header) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
