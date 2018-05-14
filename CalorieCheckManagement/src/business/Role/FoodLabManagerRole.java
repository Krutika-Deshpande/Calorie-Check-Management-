/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Ecosystem;
import business.Enterprise.Enterprise;
import business.Enterprise.ManufacturingEnterprise;
import business.Network.Network;
import business.Organization.FoodLabManagerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import business.WorkQueue.ProductWorkRequest;
import userinterface.FoodLabWorkArea.FoodManagerWorkAreaJPanel;

/**
 *
 * @author kruts
 */
public class FoodLabManagerRole extends Role {

    public FoodLabManagerRole(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business, Network network) {
        return new FoodManagerWorkAreaJPanel(userProcessContainer, account, organization,enterprise,business );
    }
    
}
