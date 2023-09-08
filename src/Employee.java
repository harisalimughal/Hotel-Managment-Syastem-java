
package hotel.management.system.project;

import java.util.Scanner;

public class Employee extends Person 
{
//    staffCategory main sweeper, chef ya driver ki category likhni hy 
    private String staffcategory;
    private String salary;
    
    private CleaningEmployee objCleaningEmployee;
    private Chef objChef;
    private Waiter objWaiter;
    private RoomService objRoomService;
    
    Scanner input = new Scanner(System.in);
    String choice;
    
    public Employee()
    {
//        this.menu();
    }
    
    public void objects(CleaningEmployee Employee1, Chef Employee2, Waiter Employee3, RoomService Employee4)
    {
        this.objCleaningEmployee = Employee1;
        this.objChef = Employee2;
        this.objWaiter = Employee3;
        this.objRoomService = Employee4;
    }
    
    public void menu()
    {
        System.out.println("Choose from the following : ");
        System.out.println("1- Add an Employee");
        System.out.println("2- Delete an Employee");
        System.out.println("3- Update an Employee data");
        System.out.println("4- Back");
        choice = input.nextLine();
        
        if (choice.equals("1"))
        {
            this.addEmployee();
        }
        else if (choice.equals("2"))
        {
            this.deleteEmployee();
        }
        else if (choice.equals("3"))
        {
            this.updateEmployeeData();
        }
        else if (choice.equals("4"))
        {
            System.out.println("In case 4");
        }
        else 
        {
            System.out.println("Invalid Input........Please choose from the above options");
            this.menu();
        }
        
//        switch(choice)
//        {
//            case "1":
//            {
//                this.addStaffMember();
//                this.menu();
//            }
//            case "2":
//            {
//                this.deleteStaffMember();
//                this.menu();
//            }
//            case "3":
//            {
//                this.updateStaffMemberData();
//                this.menu();
//            }
//            case "4":
//            {
//                break;
//            }
//            default:
//            {
//                System.out.println("Invalid Input........Please choose from the above options");
//                this.menu();
//            }
//        }
    }
    
    
    
    public void addEmployee()
    {
        System.out.println("Which type of Employee you want to add : ");
        System.out.println("1- Cleaning Employee");
        System.out.println("2- Chef");
        System.out.println("3- Waiter");
        System.out.println("4- Room Service");
        System.out.println("- Back");
        choice = input.nextLine();
        
        if (choice.equals("1"))
        {
            this.objCleaningEmployee.addCleaningEmployee();
            this.menu();
        }
        else if (choice.equals("2"))
        {
            this.objChef.addChef();
            this.menu();
        }
        else if (choice.equals("3"))
        {
            this.objWaiter.addWaiter();
            this.menu();
        }
        else if (choice.equals("4"))
        {
            this.objRoomService.addRoomService();
            this.menu();
        }
        else if (choice.equals("5"))
        {
            this.menu();
        }
        else 
        {
            System.out.println("Invalid Input........Please choose from the above options");
            this.menu();
        }
        
    }
    
    public void deleteEmployee()
    {
        System.out.println("Which type of Employee you want to delete : ");
        System.out.println("1- Cleaning Employee");
        System.out.println("2- Chef");
        System.out.println("3- Waiter");
        System.out.println("4- Room Service");
        System.out.println("5- Back");
        choice = input.nextLine();
        
        if (choice.equals("1"))
        {
            this.objCleaningEmployee.deleteCleaningEmployee();
            this.menu();
        }
        else if (choice.equals("2"))
        {
            this.objChef.deleteChef();
            this.menu();
        }
        else if (choice.equals("3"))
        {
            this.objWaiter.deleteWaiter();
            this.menu();
        }
        else if (choice.equals("4"))
        {
            this.objRoomService.deleteRoomService();
            this.menu();
        }
        else if (choice.equals("5"))
        {
            this.menu();
        }
        else 
        {
            System.out.println("Invalid Input........Please choose from the above options");
            this.menu();
        }
    }
    
    public void updateEmployeeData()
    {
        System.out.println("Which type of Employee you want to update : ");
        System.out.println("1- Cleaning Employee");
        System.out.println("2- Chef");
        System.out.println("3- Waiter");
        System.out.println("4- Room Service");
        System.out.println("5- Back");
        choice = input.nextLine();
        
        if (choice.equals("1"))
        {
            this.objCleaningEmployee.updateCleaningEmployee();
            this.menu();
        }
        else if (choice.equals("2"))
        {
            this.objChef.updateChef();
            this.menu();
        }
        else if (choice.equals("3"))
        {
            this.objWaiter.updateWaiter();
            this.menu();
        }
        else if (choice.equals("4"))
        {
            this.objRoomService.updateRoomService();
            this.menu();
        }
        else if (choice.equals("5"))
        {
            this.menu();
        }
        else 
        {
            System.out.println("Invalid Input........Please choose from the above options");
            this.menu();
        }
    }
}
