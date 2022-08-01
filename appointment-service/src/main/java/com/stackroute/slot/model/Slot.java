package com.stackroute.slot.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slot {
    @Id
    private String scheduleId;
    private String expertId;
    private Date scheduleDate;
    private String startTime;
    private  String endTime;
    private Status Status;

}
