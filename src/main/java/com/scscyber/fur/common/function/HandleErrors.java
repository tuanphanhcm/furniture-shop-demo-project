package com.scscyber.fur.common.function;

import com.scscyber.fur.common.function.Interface.IHandleErrors;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

@Service
public class HandleErrors implements IHandleErrors {
    public List<String> ErrorBindingResults(BindingResult result) {
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
