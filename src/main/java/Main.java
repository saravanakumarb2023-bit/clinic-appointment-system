package com.clinic;

public class Main {

    public static void main(String[] args) {

        AppointmentService service = new AppointmentService();

        System.out.println(service.bookAppointment("John", "10:00AM"));
        System.out.println(service.bookAppointment("Alice", "10:00AM")); // double booking
        System.out.println(service.bookAppointment("Bob", "")); // invalid
    }
}