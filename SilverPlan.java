package com.krishna;

import java.time.LocalDate;

public class SilverPlan extends SubscriptionPlan {
    public SilverPlan(LocalDate date, String status, double ratePerDay) {
        super(date, status, ratePerDay);
    }

    @Override
    public String getPlanType(){
        return Plan.SILVER.getPlan();
    }
}
