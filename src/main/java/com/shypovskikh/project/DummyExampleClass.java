package com.shypovskikh.project;

import java.util.HashMap;
import java.util.Map;

public class DummyExampleClass {
    private Map<String, String> userHub = new HashMap();

    public void addUser(String login, String pass){
        this.userHub.put(login, pass);
    }

    public int getUserCount(){
        return this.userHub.size();
    }


}
