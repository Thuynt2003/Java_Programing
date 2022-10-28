package ThongTinSV;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class InformationController {
    public TextField Name;
    public Text strName;
    public TextField Email;
    public Text strEmail;
    public TextField Address;
    public Text strAddress;
    public TextField Age;
    public Text strAge;

    public void submit(ActionEvent actionEvent) {
        String name = Name.getText();
        String age = Age.getText();
        String email = Email.getText();
        String address = Address.getText();
        strName.setText(name);
        strAge.setText(age);
        strEmail.setText(email);
        strAddress.setText(address);
    }
}
