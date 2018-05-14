/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Ecosystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Organization.ProductManufacturerOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManufactureWorkArea.ProductManagerWorkAreaJPanel;
import userinterface.ManufactureWorkArea.ProductManufacturerWorkAreaJPanel;
import business.WorkQueue.ManufacturerWorkRequest;
import business.WorkQueue.ProductWorkRequest;
/**
 *
 * @author kruts
 */
public class ProductManufacturerRole  extends Role{

    public ProductManufacturerRole(RoleType type) {
        super(RoleType.ProductManufacturer);
    }

    

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business,Network network) {
       return new ProductManufacturerWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

    

    
    
}
