package com.example.myduty.ui.assignment;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Assignment {
    private String course;
    private String topic;
    private String deadline;
    private int priority;
    private String description;

    public Assignment(String course, String topic, String deadline, int priority, String description)
    {
        this.course = course;
        this.topic = topic;
        this.deadline = deadline;
        this.priority = priority;
        this.description = description;
    }


    public static String deadlineToString(GregorianCalendar calendar) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());

        return dateFormatted;
    }

    public String getCourse() {
        return course;
    }

    public String getTopic() {
        return topic;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}



