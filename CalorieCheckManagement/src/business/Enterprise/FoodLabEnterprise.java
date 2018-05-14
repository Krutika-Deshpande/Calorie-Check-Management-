/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class FoodLabEnterprise extends Enterprise {
    
  private ArrayList<Type> organizationTypes;
  
  
    public FoodLabEnterprise(String name) {
        super(name, EnterpriseType.FoodLaboratory);
        organizationTypes = new ArrayList<Type>();
        organizationTypes.add(Type.FoodLabManager);
        organizationTypes.add(Type.FoodLabAssistant);
    }

    public ArrayList<Type> getOrganizationTypes() {
        return organizationTypes;
    }

    public void setOrganizationTypes(ArrayList<Type> organizationTypes) {
        this.organizationTypes = organizationTypes;
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Type> OrganizationType() {
        return organizationTypes; //To change body of generated methods, choose Tools | Templates.
    }

    
     
    
    
}
