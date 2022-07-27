package com.example.demo.exception;

import java.util.Date;

public class ErrorMessage {

    private int sourceCode;
    private Date timeStamp;
    private String message;
    private  String Description;

    public ErrorMessage(int sourceCode, Date timeStamp, String message, String description) {
        this.sourceCode = sourceCode;
        this.timeStamp = timeStamp;
        this.message = message;
        Description = description;
    }

    public int getSourceCode() {
        return sourceCode;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return Description;
    }
}
