package Phone;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Contacts kevin = new Contacts("Kevin", "9513476447");
        MobilePhone cont = new MobilePhone();
        cont.AddContact(kevin);
        cont.PrintContacts();
        System.out.println("Print Kevin is super cool");

    }
}