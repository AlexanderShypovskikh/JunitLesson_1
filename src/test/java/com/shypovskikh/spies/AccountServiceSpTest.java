package com.shypovskikh.spies;

import com.shypovskikh.stub.AccountService;
import com.shypovskikh.stub.AccountServiceStub;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AccountServiceSpTest {


    @Test
    public void testKickAllUsers(){
        final AccountServiceS accountService  = new AccountServiceSp();
        final AccountServiceS spyAccountService = spy(accountService);

        doNothing().when(spyAccountService).kickAllUsers();
        new ShutDownService(spyAccountService).stop("we are closing" );
        verify(spyAccountService, times(1)).kickAllUsers();
     }
}