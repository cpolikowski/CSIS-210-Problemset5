import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Write a description of class USHighwaysByLength here.
 *
 * @author Cam Polikowski, Kade Garrison
 * @version 5/5/22
 */
public class USHighwaysByLength
{
    
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(new File("ushwys.dat"));
            BST<USHighway> tree = new BST<USHighway>();
            
            while(scan.hasNext()){
                String routeNum = scan.nextLine();
                String startingLocation = scan.nextLine();
                String[] statesThrough = scan.nextLine().split(" ");
                String endLocation = scan.nextLine();
                int lengthInMiles = Integer.valueOf(scan.nextLine().trim());
                
                USHighway high = new USHighway(routeNum, startingLocation, statesThrough, endLocation, lengthInMiles);
                tree.add(high);
            }
            
            System.out.println(tree.toString());
        }catch(IOException io){
            System.out.println("File not found");
        }

    }
}
