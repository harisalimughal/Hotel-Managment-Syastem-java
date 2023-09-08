package hotel.management.system.project;

import static java.lang.System.exit;
import java.util.Scanner;

public class Admin 
{
    
    private final String username = "Saad Ali";
    private final String password = "Saad123";
    private String inputUsername;
    private String inputPassword;
    
    CleaningEmployee objCleaningEmployee = new CleaningEmployee();
    Chef objChef = new Chef();
    Waiter objWaiter = new Waiter();
    RoomService objRoomService = new RoomService();
                
    
    Scanner input = new Scanner(System.in);
    
    public Admin()
    {
//        Customer objCustomer = new Customer();
        this.adminLogin();
    }
    
    public void adminLogin()
    {
        String choice;
        do
        {
            System.out.print("USERNAME : ");
            this.inputUsername = input.nextLine();
            System.out.print("PASSWORD : ");
            this.inputPassword = input.nextLine();

            if ((this.username.equals(this.inputUsername)) && (this.password.equals(this.inputPassword)))
            {
                this.menu();
                break;
            }

            else
            {
                System.out.println("INVALID USERNAME OR PASSWORD......\n");
                do
                {
                    System.out.print("Do you want to try again (y/n) : ");
                    choice = input.nextLine();
                    choice.toLowerCase();
                    switch(choice)
                    {
                        case "y":
                        {
                            break;
                        }
                        case "n":
                        {
                            exit(0);
                        }
                        default:
                        {
                            System.out.println("Invalid input............PLEASE PRESS y / n");
                            continue;
                        }
                    }
                    break;
                }while(true);

            }
        }while(true);
        
    }
    
    public void menu()
    {
        String choice;
        System.out.println("Choose from the following : ");
        System.out.println("1- Customer");
        System.out.println("2- Employee");
        System.out.println("3- Room");
        System.out.println("4- Exit");
        choice = input.nextLine();
        
        switch(choice)
        {
            case "1":
            {
                Customer objCustomer = new Customer();
                this.menu();
            }
            case "2":
            {
                Employee objEmployee = new Employee();
                objEmployee.objects(objCleaningEmployee, objChef, objWaiter, objRoomService);
                objEmployee.menu();
                menu();
            }
            case "3":
            {
                Room objRoom = new Room();
                this.menu();
            }
            case "4":
            {
                System.out.println("-------------Thanks For Using Hotel Management System-------------");
                exit(0);
            }
            default:
            {
                System.out.println("Invalid Input........Please choose from the above options");
                this.menu();
            }
        }
            
    }
    
}
