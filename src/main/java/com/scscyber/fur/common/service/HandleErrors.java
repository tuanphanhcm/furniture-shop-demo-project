package com.scscyber.fur.common.service;

import com.scscyber.fur.common.service.Interface.IHandleErrors;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

@Service
public class HandleErrors implements IHandleErrors {
    public List<String> ErrorBindingResults(BindingResult result) {
        List<String> err = new ArrayList<>();
        if (result.hasErrors()) {
            for (ObjectError ob : result.getAllErrors()) {
                err.add(ob.getDefaultMessage());
            }
            return err;
        }
        return err;
    }
}
