/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;
import business.Employee.Employee;
import business.Role.AdminRole;
import business.Role.Role;

/**
 *
 * @author kruts
 */
public class ConfigureSystem {
  
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
       
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Krutika");
        
        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin",employee, new SystemAdminRole(Role.RoleType.Admin));
        
        return system;
    }
    
}
    

