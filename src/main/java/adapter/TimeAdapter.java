package main.java.adapter;

public class TimeAdapter {
    public String processTime(String rawTime) {
        // Assume a simple time processing logic for demonstration purposes
        // In a real-world scenario, you might have more complex logic

        // Split the raw time into hours and minutes
        String[] timeParts = rawTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Convert 24-hour format to 12-hour format
        String period = (hours >= 12) ? "PM" : "AM";
        hours = (hours > 12) ? hours - 12 : hours;

        // Format the processed time
        return String.format("%02d:%02d %s", hours, minutes, period);
    }
}
