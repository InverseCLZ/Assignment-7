import java.util.Random;

public class Main_M {
    public static void main(String[] args) {

        person person1 = new person("Melissa", "Senior", 3.4, 1343);
        person person2 = new person("John", "Junior", 3.8, 1456);
        person person3 = new person("Izzy", "Sophomore", 3.7, 1678);
        person person4 = new person("Mol", "Freshman", 2.9, 1234);
        person person5 = new person("Gabby", "Senior", 4.0, 1567);


        // Block of 5 studnets
//----------------------------------------------------------------------------------------------------------------------

        // person makes honor roll?
        System.out.println("Honor Roll Condition:");





        for (person x : new person[]{person1, person2, person3, person4, person5}) {
            System.out.println(x.name + "is on honor roll: " + x.is_on_honor_role());
        }
//----------------------------------------------------------------------------------------------------------------------


        // Random id for lunch check
        Random random = new Random();
        int random_id = random.nextInt(2000); // students should prob be in 2000s

        System.out.println("\nFree Lunch Check (Student ID: " + random_id + "):");
        for (person y : new person[]{person1, person2, person3, person4, person5}) {
            if (y.free_lunch_allowed(random_id)) {
                System.out.println(y.name + " wins a free lunch today! :) ");
            } else {
                System.out.println(y.name + " not eligible for a free lunch today. :( ");
            }
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
