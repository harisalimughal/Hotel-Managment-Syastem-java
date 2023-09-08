package hotel.management.system.project;

import java.util.Scanner;

public class Customer extends Person {
    
    private String customerID;
    
    Scanner input = new Scanner(System.in);
    String choice;
    
    public Customer()
    {
        this.menu();
    }
    
    public void menu()
    {
        System.out.println("Choose from the following : ");
        System.out.println("1- Add a Customer");
        System.out.println("2- Delete a Customer");
        System.out.println("3- Update a Customer data");
        System.out.println("4- Update a Customer data");
        System.out.println("3- Update a Customer data");
        System.out.println("4- Back");
        choice = input.nextLine();
        
        if (choice.equals("1"))
        {
            this.addCustomer();
            this.menu();
        }
        else if (choice.equals("2"))
        {
            this.deleteCustomer();
            this.menu();
        }
        else if (choice.equals("3"))
        {
            this.updateCustomer();
            this.menu();
        }
        else if (choice.equals("4"))
        {
            
        }
        else 
        {
            System.out.println("Invalid Input........Please choose from the above options");
            this.menu();
        }
//     switch(choice)
//        {
//            case "1":
//            {
//                this.addCustomer();
//                this.menu();
//            }
//            case "2":
//            {
//                this.deleteCustomer();
//                this.menu();
//            }
//            case "3":
//            {
//                this.updateCustomer();
//                this.menu();
//            }
//            case "4":
//            {
//                System.out.println("In case 4");
//                break;
//            }
//            default:
//            {
//                System.out.println("Invalid Input........Please choose from the above options");
//                this.menu();
//            }
//            
//        }
        
    }
    
    public void addCustomer()
    {
        System.out.println("In addCustomer method");
    }
    
    public void deleteCustomer()
    {
        System.out.println("In deleteCustomer method");
    }
    
    public void updateCustomer()
    {
        System.out.println("In updateCustomer method");
    }
    
    public void checkIn()
    {
        System.out.println("In checkIn method");
    }
    
    public void checkOut()
    {
        System.out.println("In checkOut method");
    }
    
}
