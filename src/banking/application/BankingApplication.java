/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

/**
 *
 * @author DouglasD
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount bankAccountOfAUser = new BankAccount("Daneel", "B00X1");
        bankAccountOfAUser.showMenu();
        
    }
    
}
