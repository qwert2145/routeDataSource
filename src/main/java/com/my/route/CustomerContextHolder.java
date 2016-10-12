package com.my.route;

import org.springframework.util.Assert;

/**
 * Created by wlb on 2016/9/28.
 */
public class CustomerContextHolder {

    private static final ThreadLocal<String> contextHolder =
            new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        Assert.notNull(customerType, "customerType cannot be null");
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
}