package DanhBa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    @Override
    public void insertPhone(String name, String phone) {
        for (int i = 0; i < phoneList.size(); i++){
            if(phoneList.get(i).getName().equals(name)) {
                for (int j = 0; j < phoneList.get(i).getNumbers().size(); j++) {
                    if(!phoneList.get(i).getNumbers().get(j).equals(phone)) {
                        phoneList.get(i).getNumbers().add(phone);
                        System.out.println(name+","+phone);
                    }
                }
            } else {
                Contact newContact = new Contact();
                ArrayList<String> newNumbers = new ArrayList<String>();
                newNumbers.add(phone);
                newContact.setName(name);
                newContact.setNumbers(newNumbers);
                phoneList.add(newContact);
                System.out.println(name+","+phone);
            }
        }
    }

    @Override
    public void removePhone(String name) {
        for (int i = 0; i < phoneList.size(); i++){
            if(phoneList.get(i).getName().equals(name)) {
                phoneList.remove(i);
            }
        }

    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
       for (int i=0; i < phoneList.size(); i++){
           if(phoneList.get(i).getName().equals(name)){
               for (int j = 0 ; j< phoneList.get(i).getNumbers().size();j++){
                   if (phoneList.get(i).getNumbers().get(j).equals(oldPhone)){
                       phoneList.get(i).getNumbers().remove(j);
                       phoneList.get(i).getNumbers().add(newPhone);
                   }
               }
           }
       }

    }


    @Override
    public void searchPhone(String name) {
        for (int i = 0; i < phoneList.size(); i++){
            if(phoneList.get(i).getName().equals(name)) {
              for (int j = 0 ; j< phoneList.get(i).getNumbers().size();j++){
                  System.out.println(phoneList.get(i).getNumbers().get(j));
              }
            }
        }
    }

    @Override
    public void sort() {
            Collections.sort(phoneList, new Comparator<>() {
                @Override
                public int compare(Contact a, Contact b) {
                    return a.getName().compareTo(b.getName());
                }
            });
        }
    ArrayList<Contact> phoneList = new ArrayList<Contact>();
}
