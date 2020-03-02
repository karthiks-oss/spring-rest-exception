package com.seenukarthi.so;

public class Error {
    private String message;
    private String detail;

    public Error(String message, String detail) {
        this.message = message;
        this.detail = detail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Error{" +
                "message='" + message + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
