package com.wur3.yearly.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EventModel {
    private int month;
    private int day;
    private String desc;

    public EventModel(int month, int day, String desc) {
        this.month=month;
        this.day=day;
        this.desc=desc;
    }
}
