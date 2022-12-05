import java.io.*;
import java.util.Arrays;

/**
 * Write a description of class USHighway here.
 *
 * @author Cam Polikowski, Kade Garrison
 * @version 5/5/22
 */

// final to make it immutable
public class USHighway implements Comparable<USHighway>
{
    private String routeNum;
    private String startingLocation;
    private String[] statesThrough;
    private String endLocation;
    private int lengthInMiles;
    
    // constructor with imput parameters
    public USHighway(String routeNum, String start, String[] statesThrough, String endLoc, int length){
        this.routeNum = routeNum;
        this.startingLocation = start;
        this.statesThrough = statesThrough;
        this.endLocation = endLoc;
        this.lengthInMiles = length;
    }
    
    // Constructor with no input parameters
    public USHighway(){
        this.routeNum = "";
        this.startingLocation = "";
        this.statesThrough = null;
        this.endLocation = "";
        this.lengthInMiles = -1;
    }
    
    
    // getters
    public String getRouteNum(){
        return routeNum;
    }
    
    public String getStartingLocation(){
        return startingLocation;
    }
    
    public String[] getStatesThrough(){
        return statesThrough;
    }
    
    public String getEndLocation(){
        return endLocation;
    }
    
    public int getLengthInMiles(){
        return lengthInMiles;
    }
    
    
    // methods
    public String toString(){
        String out = "";
        out = out + "Route number: " + routeNum + " \n";
        out = out + "Starting Location: " + startingLocation + " \n";
        out = out + "States the route goes through: " + Arrays.toString(statesThrough) + " \n";
        out = out + "End location: " + endLocation + " \n";
        out = out + "Length of route in miles: " + lengthInMiles + " \n";
        return out;
    }
    
    
    
    public int compareTo(USHighway high){
        if(lengthInMiles > high.lengthInMiles){
            return 1;
        }else if(lengthInMiles < high.lengthInMiles){
            return -1;
        }else{
            return 0;
        }
    }
    
    public boolean equals(USHighway high){
        if (routeNum.equals(high.routeNum)){
            return true;
        }
        return false;
    }
}
