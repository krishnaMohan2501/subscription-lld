package com.krishna;
import com.krishna.storage.SubscriptionPlanTypeRate;

import java.time.LocalDate;

abstract class SubscriptionPlan{

    private double ratePerDay;
    private LocalDate date;
    private String status;

    public SubscriptionPlan(LocalDate date, String status, double ratePerDay){
        this.date = date;
        this.status = status;
        this.ratePerDay = ratePerDay;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    abstract String getPlanType();
}