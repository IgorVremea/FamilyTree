package presenter;

import model.service.Service;
import view.View;

public class Presenter {
    View view;
    Service service;

    public Presenter(View view){
        this.view = view;
        this.service = new Service();
    }
    public String getFamilyMemberList(){
        return service.getFamilyMemberList();
    }
    public void addTestMembers(){
        service.addTestMembers();
    }
    public void sortFamilyMemberListByName(){
        service.sortFamilyMemberListByName();
    }
    public void sortFamilyMemberListByAge() {
        service.sortFamilyMemberListByAge();
    }
    public void exportFamilyTree(){
        service.exportFamilyTree();
    }
    public void importFamilyTree(){
        service.importFamilyTree();
    }
}
