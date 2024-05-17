package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String title;
    private String username;
    private String contents;
    private int password;
    private String scheduleDate;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.username = schedule.getUsername();
        this.contents = schedule.getContents();
        this.password = schedule.getPassword();
        this.scheduleDate = schedule.getScheduleDate();

    }

    public ScheduleResponseDto(Long id, String title, String username, String contents, int password, String scheduleDate) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.contents = contents;
        this.password = password;
        this.scheduleDate = scheduleDate;

    }
}