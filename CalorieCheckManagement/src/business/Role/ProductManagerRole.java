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
import business.Organization.ProductManagerOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManufactureWorkArea.ProductManagerWorkAreaJPanel;
import business.WorkQueue.ProductWorkRequest;

/**
 *
 * @author kruts
 */
public class ProductManagerRole  extends Role{

    public ProductManagerRole(RoleType type) {
        super(RoleType.ProductManager);
    }

   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business, Network network) {
        return new ProductManagerWorkAreaJPanel(userProcessContainer, account, organization,enterprise, network, business);
    }
}
