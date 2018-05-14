/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import java.util.ArrayList;
import business.WorkQueue.ProductWorkQueue;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author kruts
 */
public abstract class Enterprise  extends Organization{
    private EnterpriseType enterpriseType;
    private WorkQueue workQueue;
    
    private OrganizationDirectory  organizationDirectory;
    
    public enum EnterpriseType{
        
        Manufacturing("Manufacturer"),
        FoodLaboratory("FoodLaboratory");
       
        
        
        private String value;

        public String getValue() {
            return value;
        }
        
        private EnterpriseType(String value){
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
         
        @Override
        public String toString(){
            return value;
        } 
    }
    
    public Enterprise(String name, EnterpriseType type){
        super(name);
        workQueue = new WorkQueue();
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

   
    
    

    public abstract ArrayList<Organization.Type> OrganizationType();
    
}
