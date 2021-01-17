package com.krishna;

public enum Plan {
    GOLD("gold"),
    SILVER("silver"),
    BRONZE("bronze");

    private String plan;

    private Plan(String s) {
        plan = s;
    }

    public String getPlan() {
        return plan;
    }
}
