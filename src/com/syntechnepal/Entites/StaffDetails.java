package com.syntechnepal.Entites;

import java.util.List;

/**
 *
 * @author mrg1813
 */
public class StaffDetails {

    private Long id;
    private String schoolName;
    private int age;
   private List<Staff> staff;
    

    public StaffDetails() {
    }

    public StaffDetails(Long id, String schoolName, int age, List<Staff> staff) {
        this.id = id;
        this.schoolName = schoolName;
        this.age = age;
        this.staff = staff;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

   
    @Override
    public String toString() {
        return "StaffDetails{" + "id=" + id + ", schoolName=" + schoolName + ", age=" + age + ", staff=" + staff + '}';
    }

}
