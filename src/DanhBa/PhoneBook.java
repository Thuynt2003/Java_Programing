package DanhBa;

import java.util.ArrayList;
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
    public Contact searchPhone(String name) {
        for (Contact c : phoneList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }


    @Override
    public void sort() {
        Collections.sort(getPhoneList(), new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        }




    ArrayList<Contact> phoneList = new ArrayList<Contact>();

    public ArrayList<Contact> getPhoneList() {
        return phoneList;
    }
}
