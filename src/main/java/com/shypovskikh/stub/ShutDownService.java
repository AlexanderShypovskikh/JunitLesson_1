package com.shypovskikh.stub;

public class ShutDownService {
      AccountService accountService = null;

       public ShutDownService(AccountService accountService){
           this.accountService = accountService;
       }

      public void stop(String msg){
          accountService.kickAllUsers();
      }
}
