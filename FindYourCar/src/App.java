import java.util.*;
import java.util.Scanner;
import java.util.Iterator;
public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> cars = new HashMap<String, String>();

        cars.put("Soul", "Kia");
        cars.put("Camary", "Toyota");
        cars.put("Acura", "Honda");
        cars.put("Civic", "Honda");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the model of the car that you are looking for:");
        String selModel = input.nextLine();

        boolean found = false;
        
        Iterator carsIterator = cars.entrySet().iterator();
        
        while (carsIterator.hasNext()) {
 
             Map.Entry mapElement
                = (Map.Entry)carsIterator.next();
            String model = (String)mapElement.getKey();
           
            if(model.equalsIgnoreCase(selModel))
            {
                String maker = (String)mapElement.getValue();
                System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...\n\n", model, maker);
                found = true;
                break;
            }       
        }    
   
        if (found == false)
        {
           System.out.printf("Oh, you're looking for a %s? but currently we sold out this model.\n\n", selModel);  
        }       
    }
}
