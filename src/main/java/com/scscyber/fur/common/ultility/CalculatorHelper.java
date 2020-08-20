package com.scscyber.fur.common.ultility;

import java.util.UUID;

public class CalculatorHelper {
    public static String GeneratePassword(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
