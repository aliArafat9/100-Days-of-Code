package day91;

public class RotateString {
    public static boolean rotateString(String s, String goal) {

        // find length of start string
        int n1 = s.length();

        // find length of goal string
        int n2 = goal.length();

        // Step1:
        // if they are unequal then, start cannot be converted to goal
        if(n1 != n2)
        {
            return false;
        }

        // We use StringBuilder as we are modifying the string
        // String cannot be used as they are immutable.
        StringBuilder str = new StringBuilder(goal);

        // Step2:
        // repeat the goal string.
        str=str.append(str);

        // Step3 and Step4:
        // if start string is present in it then return true.
        // otherwise return false

        return (str.indexOf(s)!=-1);

        /*
        The return statement can be expanded as:
                if(str.indexOf(s)!=-1)
                {
                     return true;
                }
                else
                {
                     return false;
                }
        */
    }
    public static void main (String [] args){
        String s = "your_start_string_here";
        String goal = "your_goal_string_here";

        boolean result = rotateString(s, goal);

        // Printing the result
        if (result) {
            System.out.println("The start string can be converted to the goal string by rotation.");
        } else {
            System.out.println("The start string cannot be converted to the goal string by rotation.");
        }
    }
}
