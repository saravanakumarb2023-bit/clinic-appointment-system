package com.clinic;

import java.util.*;

public class AppointmentService {

    private List<Appointment> appointments = new ArrayList<>();

    // Book appointment
    public String bookAppointment(String patientName, String timeSlot) {

        // ❌ Invalid slot
        if (timeSlot == null || timeSlot.isEmpty()) {
            return "Invalid time slot";
        }

        // ❌ Double booking check
        for (Appointment a : appointments) {
            if (a.getTimeSlot().equals(timeSlot)) {
                return "Slot already booked";
            }
        }

        // ✅ Book appointment
        appointments.add(new Appointment(patientName, timeSlot));
        return "Appointment booked";
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}