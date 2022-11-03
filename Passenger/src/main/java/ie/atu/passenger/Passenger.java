package ie.atu.passenger;
import java.util.Scanner;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public String getTitle(String title){
        switch(title){
            case "Mr":
            case "Mrs":
            case "Ms":
                System.out.println("Your title is " + title); break;
            default:
                System.out.println("Invalid title"); break;
        }
        return title;
    }


}
