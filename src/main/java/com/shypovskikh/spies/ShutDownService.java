package com.shypovskikh.spies;

public class ShutDownService {
      AccountServiceS accountService = null;

       public ShutDownService(AccountServiceS accountService){
           this.accountService = accountService;
       }

      public void stop(String msg){
          accountService.kickAllUsers();
      }
}
