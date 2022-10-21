package libraries.createbook;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import libraries.Book;
import libraries.listbook.ListbookController;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CreateController implements Initializable{
    public TextField txtCode;
    public TextField txtName;
    public TextField txtAuthor;
    public ComboBox<String>cbPubCompany;
    public ComboBox<String>cbType;
    public TextField txtPrice;
    public TextField txtAmount;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> publishingCompany = FXCollections.observableArrayList(); 
        publishingCompany.add("nha xuat ban Tre");
        publishingCompany.add("nha xuat ban Kim Dong");
        publishingCompany.add("nha xuat ban tong hop tp.HCM");
        publishingCompany.add("nha xuat ban Hoi Nha Van");
        publishingCompany.add("nha xuat ban Phu Nu Viet Nam");
        publishingCompany.add("nha xuat ban Lao Dong");
        publishingCompany.add("nha xuat ban Giao Duc");
        publishingCompany.add("nha xuat ban Thong Tin va Truyen Thong");
        ObservableList<String> typebook = FXCollections.observableArrayList();
        typebook.add("sach chinh tri va phap luat");
        typebook.add("sach khoa hoc cong nghe - kinh te");
        typebook.add("sach van hoc nghe thuat");
        typebook.add("sach van hoa xa hoi - lich su");
        typebook.add("sach truyen, tieu thuyet");
        typebook.add("sach tam li ,tam linh ,ton giao");
        typebook.add("sach thieu nhi");
        cbPubCompany.setItems(publishingCompany);
        cbType.setItems(typebook);
    }

    public void listBook(ActionEvent actionEvent) throws IOException {
        Parent listScene = FXMLLoader.load(getClass().getResource("../listbook/listbook.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void add(ActionEvent actionEvent) {
        try {
        Integer pr = Integer.parseInt(txtPrice.getText());
        Integer amounts = Integer.parseInt(txtAmount.getText());
        Book newBook = new Book(txtCode.getText(),txtName.getText(),txtAuthor.getText(),cbPubCompany.getValue(),cbType.getValue(),pr,amounts);
        ListbookController.ls.add(newBook);
        listBook(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}
