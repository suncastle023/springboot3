package com.example.auction.model;

import java.util.List;

public class ErrorResponse {
    private int status;
    private List<String> messages;

    public ErrorResponse(int status, List<String> messages) {
        this.status = status;
        this.messages = messages;
    }

    // Getters and setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
