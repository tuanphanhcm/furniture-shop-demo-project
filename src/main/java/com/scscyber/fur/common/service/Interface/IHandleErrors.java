package com.scscyber.fur.common.service.Interface;

import org.springframework.validation.BindingResult;

import java.util.List;

public interface IHandleErrors {
    List<String> ErrorBindingResults(BindingResult result);
}
