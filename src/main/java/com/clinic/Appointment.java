package com.clinic;

public class Appointment {

    private String patientName;
    private String timeSlot;

    public Appointment(String patientName, String timeSlot) {
        this.patientName = patientName;
        this.timeSlot = timeSlot;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
}