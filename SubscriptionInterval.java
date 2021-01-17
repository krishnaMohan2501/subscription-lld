package com.krishna;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SubscriptionInterval {
    public List<SubscriptionPlan> intervals= new ArrayList<>();

    public SubscriptionInterval( SubscriptionPlan start, SubscriptionPlan stop){
        intervals.add(start);
        intervals.add(stop);
    }

}
