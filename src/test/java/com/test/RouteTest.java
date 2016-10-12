package com.test;

import com.my.route.CustomerContextHolder;
import com.my.route.mapper.AccountsMapper;
import com.my.route.mapper.ClickBindMapper;
import com.my.route.model.Accounts;
import com.my.route.model.ClickBind;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RouteTest extends GeneralSpringTest {

    @Autowired
    @Qualifier("accountsMapper")
    private AccountsMapper accountsMapper;

    @Autowired
    private ClickBindMapper clickBindMapper;

    @Autowired
    @Qualifier("accountsMapper1")
    private AccountsMapper accountsMapper1;

    @Test
    public void selectByIdTest() {
        CustomerContextHolder.setCustomerType("MASTER");
        Accounts accounts = accountsMapper.selectByPrimaryKey(6);
        System.out.println(accounts.getAccountName() + "++++++++++");
        CustomerContextHolder.setCustomerType("SLAVE");
        ClickBind clickBind = clickBindMapper.selectByPrimaryKey(128);
        System.out.println(clickBind.getBindTemplateId() + "++++++++++");
    }

}


