package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private  Map<String, List<String>> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        contacts.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        List<String> phoneNumberList = contacts.get(name);
        phoneNumberList.addAll(Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        if(!contacts.containsKey(name)){
            contacts.put(name, new ArrayList<>());
        }
        contacts.remove(name);
    }

    public Boolean hasEntry(String name) {
        return contacts.containsKey(name);
    }

    public List<String> lookup(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    public String reverseLookup(String phoneNumber)  {
        for(Map.Entry<String, List<String>> entry : contacts.entrySet()){
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            if(phoneNumbers.contains(phoneNumbers)){
                return name;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(contacts.keySet());
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
