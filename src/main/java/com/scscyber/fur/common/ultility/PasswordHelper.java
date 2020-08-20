package com.scscyber.fur.common.ultility;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordHelper {

    public static final int workload = 12;

    public static String HashPassword(String password) {
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(password, salt);
    }

    public static boolean CheckPassword(String password, String passwordHashed) {
        if (null == passwordHashed || !passwordHashed.startsWith("$2a$"))
            return false;

        return BCrypt.checkpw(password, passwordHashed);
    }
}
