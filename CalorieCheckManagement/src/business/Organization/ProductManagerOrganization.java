/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ProductManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class ProductManagerOrganization extends Organization{

    public ProductManagerOrganization() {
        super(Type.ProductManager.getValue());
       
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new ProductManagerRole(Role.RoleType.ProductManager));
        return roles;
    } 

    
    
}
