package com.shypovskikh.stub;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountServiceStubTest {


    @Test
    public void testKickAllUsers(){
        final AccountService accountService = new AccountServiceStub();
        new ShutDownService(accountService).stop("We are closing!");
        assertTrue(accountService.wasExecute());

    }

}