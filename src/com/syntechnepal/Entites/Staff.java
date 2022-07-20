package com.syntechnepal.Entites;

/**
 *
 * @author mrg1813
 */
public class Staff {

    private Long staffId;
    private String name;
    private String email;

    public Staff() {
    }

    public Staff(String name) {
        this.name = name;
    }
    

    public Staff(Long staffId, String name, String email) {
        this.staffId = staffId;
        this.name = name;
        this.email = email;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" + "staffId=" + staffId + ", name=" + name + ", email=" + email + '}';
    }

}
