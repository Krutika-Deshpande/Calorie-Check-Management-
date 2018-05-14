/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class EnterpriseDirectory {
   
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise  = null; 
        
        if(type == Enterprise.EnterpriseType.FoodLaboratory ){
            enterprise = new FoodLabEnterprise(name);
        }
        else
        {
            enterprise = new ManufacturingEnterprise(name);
        }     
            
            enterpriseList.add(enterprise);
            return enterprise;
        }
        
    }
    
    

