package presenter;

import model.service.Service;
import view.ConsoleUI;
import view.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(){
        view = new ConsoleUI();

    }
}
