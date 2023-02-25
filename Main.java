import Seminar_5.controllers.UserController;
import Seminar_5.model.FileOperation;
import Seminar_5.model.FileOperationImpl;
import Seminar_5.model.Repository;
import Seminar_5.model.RepositoryFile;
import Seminar_5.utils.Validate;
import Seminar_5.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
