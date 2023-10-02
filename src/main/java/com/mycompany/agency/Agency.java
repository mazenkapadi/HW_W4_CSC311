package com.mycompany.agency;

/**
 * A class representing an agency that creates a staff of employees and pays them.
 */
public class Agency {
    /**
     * The main method that creates a staff of employees and pays them.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a staff of employees
        Staff personnel = new Staff();

        // Perform payday processing for the staff
        personnel.payday();
    }
}
