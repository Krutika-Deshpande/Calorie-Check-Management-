/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kruts
 */
public class CustomerDirectory {

    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

//     public Customer createE(String name){
//        Employee employee = new Employee();
//        employee.setName(name);
//        employeeList.add(employee);
//        return employee;
//    }
    public Customer addCustomer() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }

    public int Calculateage(String date)  {

        SimpleDateFormat dob = new SimpleDateFormat("dd/mm/yyyy");
        Date udob = null;
        try {
            udob = dob.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(CustomerDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }

        //get system date
        Date sysdate = new Date();
        //calculate age
        long ms = System.currentTimeMillis() - udob.getTime();
        long age = (long) (((long) ms) / (1000.0 * 60 * 60 * 24 * 365));
        return (int) age;
    }

    public double calorieIntake(int heightInches, int heightFeet, int weight, int age, String gender, Customer.ActivityLevel type,Customer customer) {
        //Customer customer = new Customer();
        double calories = 0;
        if (customer.getGender().equals("Female")) {
            double totalheightInches = (heightFeet * 12) + heightInches;
            double bMR = 655 + (4.7 * totalheightInches) + (4.35 * weight) - (4.7 * age);
            if (customer.getActivityLevel().equals(Customer.ActivityLevel.sedentary)) {
                calories = 1.2 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.lightlyActive)){
                 calories = 1.375 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.moderatelyActive)) {
                calories = 1.55 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.veryActive)) {
                calories = 1.725 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.extraActive)) {
                 calories = 1.9 * bMR;
            }

        } else {
            double totalheightInches = (heightFeet * 12) + heightInches;
            double bMR = 66 + ((12.7 * totalheightInches) + (6.23 * weight) - (6.8 * age));
            if (customer.getActivityLevel().equals(Customer.ActivityLevel.sedentary)) {
                calories = 1.2 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.lightlyActive)) {
                calories = 1.375 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.moderatelyActive)) {
                 calories = 1.55 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.veryActive)) {
              calories = 1.725 * bMR;
            } else if (customer.getActivityLevel().equals(Customer.ActivityLevel.extraActive)) {
              calories = 1.9 * bMR;
            }
            
        }
       
    
    return calories ;
}

}
