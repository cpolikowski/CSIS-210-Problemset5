
/**
 * Write a description of class TreeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeTest
{
    public static void main(String[] args) {
        Tree test1 = new Tree();
        Tree test2 = new Tree();
        Tree test3 = new Tree();
        
        test1.add(4);
        test1.add(3);
        test1.add(6);
        test1.add(5);
        
        test2.add(6);
        test2.add(3);
        test2.add(4);
        test2.add(5);
        
        test3.add(4);
        test3.add(3);
        test3.add(6);
        test3.add(5);
        
        System.out.println(test1.equals(test2));
        System.out.println(test1.shapeEquals(test2));
        System.out.println(test1.shapeEquals(test3));
        
    }

}