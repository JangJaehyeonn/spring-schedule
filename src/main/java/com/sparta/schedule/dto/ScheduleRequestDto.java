package com.sparta.schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String username;
    private String contents;
    private String title;
    private int password;
    private String scheduleDate;
}