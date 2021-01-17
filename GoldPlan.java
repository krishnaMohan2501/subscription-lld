package com.krishna;

import java.time.LocalDate;

public class GoldPlan extends SubscriptionPlan {


    public GoldPlan(LocalDate date, String status, double ratePerDay) {
        super(date, status, ratePerDay);
    }

    @Override
    public String getPlanType(){
        return Plan.GOLD.getPlan();
    }

}
