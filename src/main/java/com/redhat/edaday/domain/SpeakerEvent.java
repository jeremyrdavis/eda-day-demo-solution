package com.redhat.edaday.domain;

public class SpeakerEvent {

    private String message;

    public SpeakerEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
