package com.mycast.mycastspring.model;

/**
 * MyEmail
 */
public class MyEmail {

    
    private String body;
    private String subject;
    private String from;
    private String to;

    public String getBody() {
        return body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }



    
        




}