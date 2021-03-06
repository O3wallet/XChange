package org.knowm.xchange.examples.bankera;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.dto.account.AccountInfo;
import org.knowm.xchange.service.account.AccountService;

import java.io.IOException;

public class BankeraAccountServiceDemo {
  public static void main(String[] args) throws IOException {
    Exchange exchange = BankeraDemoUtils.createExchange();
    AccountService accountService = exchange.getAccountService();

    // Get the account information
    AccountInfo accountInfo = accountService.getAccountInfo();
    System.out.println("AccountInfo as String: " + accountInfo.toString());
  }
}
