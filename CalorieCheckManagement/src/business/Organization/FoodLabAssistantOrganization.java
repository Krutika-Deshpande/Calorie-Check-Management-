/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.FoodLabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class FoodLabAssistantOrganization extends Organization {

    public FoodLabAssistantOrganization() {
        super(Type.FoodLabAssistant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodLabAssistantRole(Role.RoleType.FoodLabAssistant));
        return roles;
    }

   
    
}
