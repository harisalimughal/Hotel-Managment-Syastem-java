package hotel.management.system.project;

import java.util.Scanner;

public class Room {
    
    private String roomID;
    private String roomType;
    
    Scanner input = new Scanner(System.in);
    String choice;
    
    public Room()
    {
        this.menu();
    }
    
    public void menu()
    {
        System.out.println("Choose from the following : ");
        System.out.println("1- Add a Room");
        System.out.println("2- Delete a Room");
        System.out.println("3- Reserve a Room");
        System.out.println("4- Leave a Room");
        System.out.println("5- Back");
        choice = input.nextLine();
        
        if (choice.equals("1"))
        {
            this.addRoom();
            this.menu();
        }
        else if (choice.equals("2"))
        {
            this.deleteRoom();
            this.menu();
        }
        else if (choice.equals("3"))
        {
            this.reserveRoom();
            this.menu();
        }
        else if (choice.equals("4"))
        {
            this.leaveRoom();
            this.menu();
        }
        else if (choice.equals("5"))
        {
            System.out.println("In case 5");
        }
        else 
        {
            System.out.println("Invalid Input........Please choose from the above options");
            this.menu();
        }
    }
    
    public void addRoom()
    {
        System.out.println("In addRoom method");
    }
    
    public void deleteRoom()
    {
        System.out.println("In deleteRoom method");
    }
    
    public void reserveRoom()
    {
        System.out.println("In reserveRoom method");
    }
    
    public void leaveRoom()
    {
        System.out.println("In leaveRoom method");
    }
    
}
