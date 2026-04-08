package com.clinic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {

    AppointmentService service = new AppointmentService();

    @Test
    void testDoubleBookingPrevention() {
        service.bookAppointment("John", "10:00AM");
        String result = service.bookAppointment("Alice", "10:00AM");

        assertEquals("Slot already booked", result);
    }

    @Test
    void testInvalidTimeSlot() {
        String result = service.bookAppointment("Bob", "");

        assertEquals("Invalid time slot", result);
    }

    @Test
    void testSuccessfulBooking() {
        String result = service.bookAppointment("John", "11:00AM");

        assertEquals("Appointment booked", result);
    }
}