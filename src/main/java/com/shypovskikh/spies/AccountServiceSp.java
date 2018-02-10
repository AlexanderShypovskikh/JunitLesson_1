package com.shypovskikh.spies;

public class AccountServiceSp implements AccountServiceS {
    private boolean wasExecute;

    public void kickAllUsers() {
         wasExecute = true;
    }

    public boolean wasExecute(){
        return wasExecute;
    }
}
