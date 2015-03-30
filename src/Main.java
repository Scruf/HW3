
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egor
 */
public class Main {

   
    public  static UserAccountList arrUserAccountList = new UserAccountList();
        public static boolean Authentication(String userrName,String password)
    {
        return arrUserAccountList.authenticate(userrName, password) ? true : false;
    }
        public static void backEndScreen()
        {
            System.out.print("Welcome to the Back-end & Maintance Management Portal");
            System.out.print("\n\n1. User Account Management"
                                +"\n0.Exit & Save (return to Main Screen)"
                                +"\n\nPlease select a menu option(1, or 0)");
            Scanner choice = new Scanner (System.in);
            int ch=choice.nextInt();
            switch (ch)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "Something really funny");
                    break;
                case 0:
                    mainScreen();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input");
                    break;
            }
        }
        public static void mainScreen()
        {
          
               System.out.print("\nWelcome to the Small Business Application");
               System.out.print("\n\n\t1. Back end Management Screen\n"
                                    +"\t2. Retail Point-Of-Sales Screen\n"
                                    +"\t3. Exit(return to Login screen)"
                                    +"\n\n Please select a menu option (1,2 or 0)");
               Scanner scan = new Scanner (System.in);
               int ch=scan.nextInt();
               switch(ch)
               {
                   case 1:
                       backEndScreen();
                       break;
               }
        }
        public static void userAccountManagementScreen()
        {
            System.out.print("Welcome to the User Account Management Portal");
            System.out.print("\n\n"
                    + "\t1. Search for a User Account Record\n"
                    + "\t2. Add a User Account Record\n"
                    + "\t3. Edit a User Account Record\n"
                    + "\t4. Remove a User Account Record\n"
                    + "\t5. Change a Username\n"
                    + "t6. Change a Password\n"
                    + "t7. Change an Email\n"
                    + "t0. Exit & Save(Save & return to Back-end Mgt Screen)");
            System.out.print("\n\nPlease select a menu option(1,2,3,4,5,6 or 0)");
            Scanner scan = new Scanner (System.in);
        }
    public static void main (String []args)
    {
    
       Scanner scan = new Scanner (System.in);
       String user;
       String pass;
       System.out.print("Welcome to authenticaton portal");
       System.out.print("\n\tPlease enter username: ");
       user=scan.next();
       System.out.print("\n\tPlease enter password: ");
       pass=scan.next();
       
     while(!user.equals("-1")||!pass.equals("-1"))
       {
           if(Authentication(user,pass))
           {
               System.out.print("\nAccess granted");
              mainScreen();
               Scanner choice = new Scanner (System.in);
               int ch=choice.nextInt();
               switch(ch)
               {
                   case 1: 
                       backEndScreen();
                       break;
                   default:
                       break;
               }
           }
           else
               System.out.print("Access denied! ");
          System.out.print("\nWelcome to authenticaton portal");
            System.out.print("\n\tPlease enter username: ");
            user=scan.next();
            System.out.print("\n\tPlease enter password: ");
            pass=scan.next();              
       }
    }
}
