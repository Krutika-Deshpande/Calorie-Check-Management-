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
import business.WorkQueue.ProductWorkRequest;
import userinterface.FoodLabWorkArea.FoodLabAssistantWorkAreaJPanel;

/**
 *
 * @author kruts
 */
public class FoodLabAssistantRole extends Role {

    public FoodLabAssistantRole(RoleType type) {
        super(RoleType.FoodLabAssistant);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, Network network) {
        return new FoodLabAssistantWorkAreaJPanel(userProcessContainer, account, organization,system);
                
    }
    
}
