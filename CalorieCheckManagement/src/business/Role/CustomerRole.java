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
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerWorkArea.CustomerCreateAccountJPanel;

/**
 *
 * @author kruts
 */
public class CustomerRole extends Role {

    public CustomerRole() {
        super(RoleType.Customer);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business, Network network) {
        return new CustomerCreateAccountJPanel(userProcessContainer,account, organization,enterprise, network,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
