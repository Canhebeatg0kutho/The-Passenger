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
                throw new IllegalArgumentException("This title is not valid");
        }
        return title;
    }

    public String getName(String name){
      if(name.length()>=3){
          System.out.println("Your name is "+name);
      }
      else{
          throw new IllegalArgumentException("This name is too short");
      }
      return name;
    }



}
