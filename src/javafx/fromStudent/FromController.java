package javafx.fromStudent;
import javafx.fxml.FXMLLoader;
import javafx.listStudent.ListControler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
public class FromController  {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;

    public void submits(ActionEvent actionEvent) throws Exception {
        try{
            Student s = new Student(txtName.getText(), txtEmail.getText(), Integer.parseInt(txtMark.getText()));
        
            if(Integer.parseInt(txtMark.getText()) < 0 || Integer.parseInt(txtMark.getText()) > 10);
            ListControler.ls.add(s);
            listStudent(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    }
    public void listStudent(ActionEvent actionEvent)throws Exception {
        Parent listpage = FXMLLoader.load(getClass().getResource("../listStudent/listStudent.fxml"));
        Scene sc = new Scene(listpage,800,600);
        Main.listStudent.setTitle("list Student");
        Main.listStudent.setScene(sc);
    }
   
       
}
