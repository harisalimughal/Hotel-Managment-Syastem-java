package hotel.management.system.project;

public class Hotel 
{
    
    private String hotelName;
    private String ownerName;
    
    public Hotel()
    {
        this.hotelName = "Saad's Hotel";
        this.ownerName = "Saad Ali";
    }
    
    public void display()
    {
        System.out.println(this.hotelName);
        System.out.println(this.ownerName);
        Admin objAdmin = new Admin();
    }
    
}
