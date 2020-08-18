package com.scscyber.fur.common.function;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

public class HandleErrors {
    public static List<String> ErrorBindingResults(BindingResult result) {
        if (result.hasErrors()) {
            List<String> err = new ArrayList<>();
            for (ObjectError ob : result.getAllErrors()) {
                err.add(ob.getDefaultMessage());
            }
            return err;
        }
        return null;
    }
}
