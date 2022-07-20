package com.syntechnepal.Controller;

import com.syntechnepal.Entites.Staff;
import com.syntechnepal.Entites.StaffDetails;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrg1813
 */
public class MainController {

    public static void main(String args[]) {

       
        List<Staff> st = new ArrayList<>();
        st.add(new Staff(1L,"moon" ,"gmail.com"));

        List<StaffDetails> list = new ArrayList<>();
        list.add(new StaffDetails(1L, "school1", 20, st));
        list.add(new StaffDetails(2L, "school2", 21, st));
        list.add(new StaffDetails(3L, "school3", 22, st));
        list.add(new StaffDetails(4L, "school4", 23, st));
        list.add(new StaffDetails(5L, "school5", 24, st));

        System.out.println("*********************************************************");

        for (StaffDetails details : list) {
            System.out.println("Staff informatin " + details.getStaff());
            System.out.println("*********************************************************");

            System.out.println("Staff details age: " + details.getAge());
            System.out.println("*********************************************************");

            System.out.println("Staff details schoolname: " + details.getSchoolName());

        }

    }

}
