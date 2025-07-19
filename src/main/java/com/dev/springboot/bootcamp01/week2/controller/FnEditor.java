package com.dev.springboot.bootcamp01.week2.controller;

import org.springframework.stereotype.Component;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

@Component
public class FnEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        setValue(text.trim().toLowerCase());
    }
}
