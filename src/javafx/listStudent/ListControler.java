package javafx.listStudent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fromStudent.Main;
import javafx.fromStudent.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListControler {
    public TextField NameStudent;
    public TextField EmailStudent;
    public TextField MarkStudent;

    public static ObservableList<Student> ls = FXCollections.observableArrayList();
    public ListView<Student> lvStudents;
    public ListControler(){

    };
    protected void initialize(){

        lvStudents.setItems(ls);
    };
    public void back(ActionEvent actionEvent) throws Exception{

        Parent fromPage = FXMLLoader.load(getClass().getResource("../fromStudent/fromStudent.fxml"));
        Scene sc = new Scene(fromPage,800,600);
        Main.listStudent.setTitle("From Student");
        Main.listStudent.setScene(sc);
    };
}
