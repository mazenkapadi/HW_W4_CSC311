package com.mycompany.agency;

/**
 * An abstract class representing a staff member.
 * This class serves as a base class for different types of employees.
 */
public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    /**
     * Constructor: Initializes a staff member with the specified information.
     *
     * @param eName    The name of the staff member.
     * @param eAddress The address of the staff member.
     * @param ePhone   The phone number of the staff member.
     */
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    /**
     * Returns a string representation including the basic employee information.
     *
     * @return A string containing the name, address, and phone number of the staff member.
     */
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }

    /**
     * Derived classes must define the pay method for each type of employee.
     *
     * @return The pay amount for the staff member.
     */
    public abstract double pay();
}
