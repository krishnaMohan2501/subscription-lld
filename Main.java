package com.krishna;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<List<SubscriptionPlan>> subscriptionPlans = new ArrayList<>();

        SubscriptionPlan goldPlanStart =  GetPlanFactory.getPlan("gold", LocalDate.of(2021,01,1),
                Status.START.getStatus());
        SubscriptionPlan goldPlanStop =  GetPlanFactory.getPlan("gold", LocalDate.of(2021,01,10),
                Status.STOP.getStatus());

        List<SubscriptionPlan> interval1= new ArrayList<>();
        interval1.add(goldPlanStart);
        interval1.add(goldPlanStop);
        subscriptionPlans.add(interval1);

        SubscriptionPlan silverPlanStart =  GetPlanFactory.getPlan("silver", LocalDate.of(2021,01,15),
                Status.START.getStatus());
        SubscriptionPlan silverPlanStop =  GetPlanFactory.getPlan("silver", LocalDate.of(2021,01,21),
                Status.STOP.getStatus());

        List<SubscriptionPlan> interval2= new ArrayList<>();
        interval2.add(silverPlanStart);
        interval2.add(silverPlanStop);
        subscriptionPlans.add(interval1);

        SubscriptionPlan bronzePlanStart =  GetPlanFactory.getPlan("bronze", LocalDate.of(2021,01,21),
                Status.START.getStatus());
        SubscriptionPlan bronzePlanStop =  GetPlanFactory.getPlan("bronze", LocalDate.of(2021,03,1),
                Status.STOP.getStatus());

        List<SubscriptionPlan> interval3= new ArrayList<>();
        interval3.add(bronzePlanStart);
        interval3.add(bronzePlanStop);
        subscriptionPlans.add(interval3);


        List<SubscriptionPlan> interval4= new ArrayList<>();
        interval4.add(GetPlanFactory.getPlan("silver", LocalDate.of(2021,03,1),
                Status.START.getStatus()));
        interval4.add(GetPlanFactory.getPlan("silver", LocalDate.of(2021,03,10),
                Status.STOP.getStatus()));
        subscriptionPlans.add(interval4);

        List<SubscriptionPlan> interval5= new ArrayList<>();
        interval5.add(GetPlanFactory.getPlan("gold", LocalDate.of(2021,03,11),
                Status.START.getStatus()));
        interval5.add(GetPlanFactory.getPlan("gold", LocalDate.of(2021,03,20),
                Status.STOP.getStatus()));
        subscriptionPlans.add(interval5);

        BillingStrategy.simpleBillingStrategy(subscriptionPlans);

        System.out.println("test");


    }
}
