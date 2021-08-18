package task_44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact updatedContact) {
        if (myContacts.contains(oldContact)) {
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, updatedContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        int size = myContacts.size();
        Contact currentContact;
        for (int i = 0; i < size; i++) {
            currentContact = myContacts.get(i);
            if (currentContact.getName().equals(contact.getName()) &&
                    currentContact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String contactName) {
        int position = -1;
        int count = -1;
        for (Contact currentContact : myContacts) {
            count++;
            if (currentContact.getName().equals(contactName)) {
                position = count;
                break;
            }
        }
        return position;
    }

    public Contact queryContact(String contactName) {
        for (Contact currentContact : myContacts) {
            if (currentContact.getName().equals(contactName)) {
                return currentContact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int size = myContacts.size();
        for (int i = 0; i < size; i++) {
            System.out.printf("%d. %s -> %s", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }
}
