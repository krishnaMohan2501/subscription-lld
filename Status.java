package com.krishna;

public enum Status {
    START("start"),
    STOP("stop");

    private String status;
    private Status(String s) {
        status = s;
    }

    public String getStatus() {
        return status;
    }

}
