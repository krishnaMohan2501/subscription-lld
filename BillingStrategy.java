package com.krishna;

import com.krishna.storage.SubscriptionPlanTypeRate;

import java.util.List;

public class BillingStrategy {
        public static void simpleBillingStrategy(List<List<SubscriptionPlan>> intervals){

            for(List<SubscriptionPlan> interval: intervals){
                SubscriptionPlan start = interval.get(0);
                SubscriptionPlan stop = interval.get(1);

                double rate = start.getRatePerDay();

                if(start.getPlanType().equalsIgnoreCase("gold")){

                    double totalBill = calulateBill(start, stop, rate);
                    System.out.println(start.getDate().getDayOfMonth() + "-" + stop.getDate().getDayOfMonth() + "gold"+
                            "-" + totalBill);
                }else if(start.getPlanType().equalsIgnoreCase("silver")){

                    double totalBill = calulateBill(start, stop, rate);
                    System.out.println(start.getDate().getDayOfMonth() + "-" + stop.getDate().getDayOfMonth() +
                            "silver" +
                            "-" + totalBill);
                }else if(start.getPlanType().equalsIgnoreCase("bronze")){

                    double totalBill = calulateBill(start, stop, rate);
                    System.out.println(start.getDate().getDayOfMonth() + "-" + stop.getDate().getDayOfMonth() +
                            "bronze" +
                            "-" + totalBill);
                }

            }
    }

    private static double calulateBill(SubscriptionPlan start, SubscriptionPlan stop, double rate) {
            double totalBill = 0.0;
            int noOfDays = stop.getDate().getDayOfMonth() - start.getDate().getDayOfMonth() +1;
            totalBill = noOfDays * rate;
            return totalBill;


    }
}
