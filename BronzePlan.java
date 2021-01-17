package com.krishna;

import java.time.LocalDate;

public class BronzePlan extends SubscriptionPlan {
    public BronzePlan(LocalDate date, String status, double ratePerDay) {
        super(date, status, ratePerDay);
    }

    @Override
    public String getPlanType(){
        return Plan.BRONZE.getPlan();
    }
}
