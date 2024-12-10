import java.util.Random;

class person {
    String name;
    String year;
    double gpa;
    int id;
//----------------------------------------------------------------------------------------------------------------------
    // created object:
    public person(String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
//----------------------------------------------------------------------------------------------------------------------

    //Checks:
    // if the student is on the honor roll
    public boolean is_on_honor_role() {
        return gpa > 3.6;
    }

    // if the student gets free lunch
    public boolean getsFreeLunch(int randomId) {
        return id == randomId;
    }

    // if the student gets free lunch (alternative name)
    public boolean free_lunch_allowed(int randomId) {
        return id == randomId;
    }
}
