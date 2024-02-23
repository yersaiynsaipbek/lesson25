package Lessons.lesson_25.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");


        Contact contact1 = new Contact("Али", "7078097252");
        Contact contact2 = new Contact("Даулет", "7076870945");
        Contact contact3 = new Contact("Нуртай", "7775657869");


        phoneBook.addContactToGroup(contact1, "Друзья");
        phoneBook.addContactToGroup(contact2, "Работа");
        phoneBook.addContactToGroup(contact3, "Друзья");


        String phoneNumberToFind = "7078097252";
        Contact foundContact = phoneBook.findContactByPhoneNumber(phoneNumberToFind);
        if (foundContact != null) {
            System.out.println("Найдено контакт: " + foundContact);
        } else {
            System.out.println("Контакт с номером " + phoneNumberToFind + " не найдено.");
        }


        String groupNameToSearch = "Друзья";
        List<Contact> contactsInGroup = phoneBook.getContactsInGroup(groupNameToSearch);
        System.out.println("Контакт в группе '" + groupNameToSearch + "':");
        for (Contact contact : contactsInGroup) {
            System.out.println(contact);
        }
    }
}