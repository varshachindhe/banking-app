package com.guides.banking.mapper;

import com.guides.banking.dto.AccountDto;
import com.guides.banking.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account =new Account(
               accountDto.getId(),
               accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
