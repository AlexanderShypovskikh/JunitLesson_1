package com.shypovskikh.stub;

public class AccountServiceStub implements AccountService{
    private boolean wasExecute;

    public void kickAllUsers() {
         wasExecute = true;
    }

    public boolean wasExecute(){
        return wasExecute;
    }
}
