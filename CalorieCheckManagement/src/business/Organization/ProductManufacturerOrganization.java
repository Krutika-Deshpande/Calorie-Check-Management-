/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ProductManufacturerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class ProductManufacturerOrganization  extends Organization{

    public ProductManufacturerOrganization() {
        super(Type.ProductManufacturer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProductManufacturerRole(Role.RoleType.ProductManufacturer));
        return roles;
        
        
    }

   
    
}
