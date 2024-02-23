package Lessons.lesson_25.task_1;

import Lessons.lesson_25.task_1.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PhoneBook {
    private HashMap<String, List<Contact>> groups;

    public PhoneBook() {
        groups = new HashMap<>();
    }

    public void addGroup(String groupName) {
        groups.put(groupName, new ArrayList<>());
    }

    public void addContactToGroup(Contact contact, String groupName) {
        if (groups.containsKey(groupName)) {
            List<Contact> contacts = groups.get(groupName);
            contacts.add(contact);
            groups.put(groupName, contacts);
        } else {
            System.out.println("Группа '" + groupName + "' не существует.");
        }
    }

    public List<Contact> getContactsInGroup(String groupName) {
        return groups.getOrDefault(groupName, new ArrayList<>());
    }

    public Contact findContactByPhoneNumber(String phoneNumber) {
        for (List<Contact> contacts : groups.values()) {
            for (Contact contact : contacts) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    return contact;
                }
            }
        }
        return null;
    }
}
