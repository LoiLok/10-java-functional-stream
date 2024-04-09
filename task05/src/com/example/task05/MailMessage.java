package com.example.task05;

import jdk.javadoc.internal.doclint.Messages;

public class MailMessage extends Message <String> {
    public MailMessage(String from, String to, String content){
        super(from, to, content);
    }
}
