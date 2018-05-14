/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;


import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;
     
     public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }


    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.FoodLabAssistant.getValue())){
            organization = new FoodLabAssistantOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.FoodLabManager.getValue())){
            organization = new FoodLabManagerOrganization();
            organizationList.add(organization);   
        }
        
        else if (type.getValue().equals(Type.ProductManager.getValue())){
            organization = new ProductManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ProductManufacturer.getValue())){
            organization = new ProductManufacturerOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
            
        }
       
        return organization;
    }
    
    
}
