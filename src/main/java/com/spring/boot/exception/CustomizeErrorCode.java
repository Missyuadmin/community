package com.spring.boot.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOTFOUND("问题找不到，换一个");

    @Override
    public String getMessage(){
        return message;
    }

    private String message;

    CustomizeErrorCode(String message){
        this.message=message;
    }
}
