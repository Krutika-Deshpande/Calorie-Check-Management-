
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Customer.CustomerDirectory;
import business.Market.ManufacturedProductDirectory;
import business.Market.MasterOrderList;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import business.WorkQueue.ProductWorkQueue;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author kruts
 */
public abstract class Organization {
    

    private String name;
    private WorkQueue workQueue; 
    private WorkQueue workQueueenterprise;
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
   
    private int organizationID;
    private static int counter;
    
    
    public enum Type{
        Admin("Admin Organization"),
        ProductManufacturer("Product Manufacturer Organization"), 
        ProductManager("Product Manager Organization"),
        FoodLabManager("FoodLab Manager Organization"),
        FoodLabAssistant("FoodLab Assistant Organization"),
        Customer("Customer Organization");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        
    }
    
    public Organization(String name){
        
       this.name = name;
       workQueue = new WorkQueue();
       workQueueenterprise = new WorkQueue();
       customerDirectory = new CustomerDirectory();
       userAccountDirectory = new UserAccountDirectory();
       employeeDirectory = new EmployeeDirectory();
       
       organizationID = counter;
       counter++;
       
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

   
   
    
}
