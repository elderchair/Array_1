package Phone;

import java.util.ArrayList;
import java.util.Objects;



public class MobilePhone {
    private ArrayList<Contacts> myContacts = new ArrayList<Contacts>();


    public void AddContact(Contacts co){
        myContacts.add(co);
    }
    public void PrintContacts(){
        for (int x = 0;x< myContacts.size();x++){
            System.out.println(myContacts.get(x).getName());
        }
    }

    public void removeContact(Contacts co){
        myContacts.remove(co);
    }
    public int findContact(Contacts co){
        int position = myContacts.indexOf(co);
        if (position >= 0){
            return position;
        }
        else{
            return -1;
        }

    }

    public String queryContact(String name){
        for (int x =0; x< myContacts.size();x++){
            if (myContacts.get(x).getName() == name){
                return name;
            }
        }
        return null;
    }
}
