package libraries.listbook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import libraries.Book;
import libraries.createbook.Main;
import libraries.edit.EditController;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ListbookController implements Initializable {


    public  ListView lv;
    public static ObservableList<Book> ls = FXCollections.observableArrayList();
    public TextField txtSearch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(ls);
    }

    public void add(ActionEvent actionEvent) throws IOException {
        Parent listScene = FXMLLoader.load(getClass().getResource("../createbook/addbook.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void edit(ActionEvent actionEvent) throws IOException {
        Book editBook = (Book) lv.getSelectionModel().getSelectedItem();
        EditController.editBook = editBook;
        EditController.ls = ls;
        Parent listScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../edit/edit.fxml")));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setTitle("EDIT BOOK");
        Main.rootStage.setScene(sc);
    }

    public void delete(ActionEvent actionEvent) {
        Book delete = (Book) lv.getSelectionModel().getSelectedItem();
        ls.remove(delete);
    }

    public void search(ActionEvent actionEvent) {
          ObservableList<Book> lsm = FXCollections.observableArrayList();
          for (Book a : ls){
              if (a.getName().contains(txtSearch.getText())){
                  lsm.add(a);
              }
          }
          lv.setItems(lsm);
    }
}
