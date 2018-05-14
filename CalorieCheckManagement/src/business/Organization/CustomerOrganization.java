/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.CustomerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class CustomerOrganization extends Organization{

    public CustomerOrganization() {
        super(Type.Customer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
