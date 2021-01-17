package com.krishna;

import com.krishna.storage.SubscriptionPlanTypeRate;

import java.time.LocalDate;

public class GetPlanFactory {
    //use getPlan method to get object of type Plan
    private static SubscriptionPlanTypeRate subscriptionPlanTypeRate = SubscriptionPlanTypeRate.getInstance();

    public static SubscriptionPlan getPlan(String planType, LocalDate date, String status){
        if(planType == null){
            return null;
        }
        if(Plan.GOLD.getPlan().equalsIgnoreCase(planType)) {
            double ratePerDay = subscriptionPlanTypeRate.getSubscription().get(planType);
            return new GoldPlan(date, status, ratePerDay);
        }
        else if(Plan.SILVER.getPlan().equalsIgnoreCase(planType)){
            double ratePerDay = subscriptionPlanTypeRate.getSubscription().get(planType);
            return new SilverPlan(date, status, ratePerDay);
        }
        else if(Plan.BRONZE.getPlan().equalsIgnoreCase(planType)) {
            double ratePerDay = subscriptionPlanTypeRate.getSubscription().get(planType);
            return new BronzePlan(date, status, ratePerDay);
        }
        return null;
    }
}
