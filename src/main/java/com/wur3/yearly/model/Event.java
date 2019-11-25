package com.wur3.yearly.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Builder
@Data
@Table(name="events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int month;

    private int day;

    private String desc;

    public Event() {}

    public Event(long id, int month, int day, String desc) {
        this.id=id;
        this.month=month;
        this.day=day;
        this.desc=desc;
    }

}
