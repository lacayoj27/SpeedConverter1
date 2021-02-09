


public class SpeedConverter {

    public static void main(String[] args) {


        //1.Write a method called toMilesPerHour that has 1 parameter of type double with the name
        //kilometersPerHour. This method needs to return the rounded value of the calculation
        //of type long.

        //If the parameter kilometerPerHour is less than 0, the method needs to return a -1 to indicate
        // an invalid value
        //Otherwise, if it is positive, calculate the value of miles per hour, round it and return it

        //toMilesPerHour(1.5) should return the value 1
        //toMilesPerHour(10.25) should return the value 6
        //toMilesPerHour(-5.6) should return the value -1
        //toMilesPerHour(25.42) should return the value 16
        //toMilesPerHour(75.114) should return the value 47

        //2.Write another method called printConversion with 1 parameter of type double with
        //the name kilometerPerHour. This method should not return anything(void) and it
        //needs to calculate milesPerHour from kilometersPerHour parameter.
        //Then it needs to print the message in the format "XX km/h = YY mi/h"

        //XX represents the original value kilometersPerHour
        //YY represents the rounded milesPerHour from kilometerPerHour parameter

        //If the parameter kilometerPerHour is < 0 then print the text "Invalid Value"
        //1 mile per hour = 1.609km per hour


    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {

            return -1;

        }

        return Math.round(kilometersPerHour / 1.609);


    }

    public void printConversion(double kilometersPerHour) {


    }


}
