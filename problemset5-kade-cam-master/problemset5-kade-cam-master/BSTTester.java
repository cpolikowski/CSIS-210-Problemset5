
/**
 * Write a description of class BSTTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BSTTester
{
    public static void main(String[] args) {
        // Integer Tests
        
        System.out.println("*******************");
        System.out.println("***Integer Tests***");
        System.out.println("*******************");
        System.out.println();
        
        // Testing Empty
        BST testIntEmpty1 = new BST();
        BST testIntEmpty2 = new BST();
        
        System.out.println("** Testing 2 empty Integer Trees **");
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testIntEmpty1.equals(testIntEmpty2));
        System.out.println(testIntEmpty1.shapeEquals(testIntEmpty2));
        System.out.println();
        
        //Testing Add method
        
        BST testIntAdd = new BST();
        System.out.println("** Testing add Method **");
        System.out.println("Add 2");
        testIntAdd.add(2);
        System.out.println("Tree Output: " + testIntAdd.toString());
        System.out.println("Add 1 and 6");
        testIntAdd.add(1);
        testIntAdd.add(6);
        System.out.println("Tree Output: " + testIntAdd.toString());
        System.out.println("Add 5");
        testIntAdd.add(5);
        System.out.println("Tree Output: " + testIntAdd.toString());
        System.out.println();
        
        // Testing Contains Method
        BST testContains = new BST();
        testContains.add(3);
        testContains.add(2);
        testContains.add(5);
        testContains.add(1);
        testContains.add(4);
        System.out.println("** Testing contains Method **");
        System.out.println("Tree: " + testContains.toString());
        System.out.println("Contains 5");
        System.out.println("Expected: true");
        System.out.println("Actual: " + testContains.contains(5) + "\n");
        System.out.println("Tree: " + testContains.toString());
        System.out.println("Contains 6");
        System.out.println("Expected: false");
        System.out.println("Actual: " + testContains.contains(6));
        System.out.println();
        
        // Testing Equals Method and Shape Equals
        BST testEquals1 = new BST();
        BST testEquals2 = new BST();
        testEquals1.add(4);
        testEquals1.add(6);
        testEquals1.add(7);
        testEquals1.add(3);
        testEquals1.add(1);
        testEquals2.add(4);
        testEquals2.add(6);
        testEquals2.add(7);
        testEquals2.add(3);
        testEquals2.add(1);
        System.out.println("** Testing equals Method and Shape Equals **");
        System.out.println("Adding 4,6,7,3,1 to both Trees");
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println("Actual:");
        System.out.println(testEquals1.equals(testEquals2));
        System.out.println(testEquals1.shapeEquals(testEquals2));
        BST testEquals3 = new BST();
        testEquals3.add(6);
        testEquals3.add(4);
        testEquals3.add(7);
        testEquals3.add(1);
        testEquals3.add(3);
        System.out.println();
        System.out.println("Adding 4,6,7,3,1 to One Tree and 6,4,7,1,3 to Other Tree");
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println("Actual:");
        System.out.println(testEquals1.equals(testEquals3));
        System.out.println(testEquals1.shapeEquals(testEquals3));
        System.out.println();
        
        // Testing Equals and Shape Equals with only left subtree
        BST testLeftEquals1 = new BST();
        BST testLeftEquals2 = new BST();
        BST testLeftEquals3 = new BST();
        
        testLeftEquals1.add(8);
        testLeftEquals1.add(6);
        testLeftEquals1.add(5);
        testLeftEquals1.add(3);
        testLeftEquals1.add(1);
        testLeftEquals2.add(8);
        testLeftEquals2.add(6);
        testLeftEquals2.add(5);
        testLeftEquals2.add(3);
        testLeftEquals2.add(1);
        testLeftEquals3.add(8);
        testLeftEquals3.add(5);
        testLeftEquals3.add(3);
        testLeftEquals3.add(6);
        testLeftEquals3.add(1);
        
        System.out.println("** Testing Trees With Only Left Subtree **");
        System.out.println("Testing with Equal Tree");
        System.out.println("Tree 1: " + testLeftEquals1.toString());
        System.out.println("Tree 2: " + testLeftEquals2.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testLeftEquals1.equals(testLeftEquals2));
        System.out.println(testLeftEquals1.shapeEquals(testLeftEquals2));
        System.out.println();
        System.out.println("Testing with Same Values Different Structure (Adding in a different way)");
        System.out.println("Tree 1: " + testLeftEquals1.toString());
        System.out.println("Tree 2: " + testLeftEquals3.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testLeftEquals1.equals(testLeftEquals3));
        System.out.println(testLeftEquals1.shapeEquals(testLeftEquals3));
        System.out.println();
        
        BST testDuplicate1 = new BST();
        BST testDuplicate2 = new BST();
        BST testDuplicate3 = new BST();
        
        testDuplicate1.add(5);
        testDuplicate1.add(6);
        testDuplicate1.add(5);
        testDuplicate1.add(3);
        testDuplicate1.add(4);
        testDuplicate2.add(5);
        testDuplicate2.add(6);
        testDuplicate2.add(5);
        testDuplicate2.add(3);
        testDuplicate2.add(4);
        testDuplicate3.add(6);
        testDuplicate3.add(5);
        testDuplicate3.add(3);
        testDuplicate3.add(5);
        testDuplicate3.add(4);
        
        System.out.println("** Testing Duplicate Values **");
        System.out.println("Tree 1: " + testDuplicate1.toString());
        System.out.println("Tree 2: " + testDuplicate2.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDuplicate1.equals(testDuplicate2));
        System.out.println(testDuplicate1.shapeEquals(testDuplicate2));
        System.out.println();
        System.out.println("Testing with Same Values Different Structure (Adding in a different way)");
        System.out.println("Tree 1: " + testDuplicate1.toString());
        System.out.println("Tree 2: " + testDuplicate3.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDuplicate1.equals(testDuplicate3));
        System.out.println(testDuplicate1.shapeEquals(testDuplicate3));
        System.out.println();
        
        
        
        
        // Double Tests
        
        System.out.println("******************");
        System.out.println("***Double Tests***");
        System.out.println("******************");
        System.out.println();
        
        // Testing Empty
        BST testDoubEmpty1 = new BST();
        BST testDoubEmpty2 = new BST();
        
        System.out.println("** Testing 2 empty Double Trees **");
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDoubEmpty1.equals(testDoubEmpty2));
        System.out.println(testDoubEmpty1.shapeEquals(testDoubEmpty2));
        System.out.println();
        
        //Testing Add method
        
        BST testDoubAdd = new BST();
        System.out.println("** Testing add Method **");
        System.out.println("Add 2.6");
        testDoubAdd.add(2.6);
        System.out.println("Tree Output: " + testDoubAdd.toString());
        System.out.println("Add 1.1 and 8.99");
        testDoubAdd.add(1.1);
        testDoubAdd.add(8.99);
        System.out.println("Tree Output: " + testDoubAdd.toString());
        System.out.println("Add 4.7");
        testDoubAdd.add(4.7);
        System.out.println("Tree Output: " + testDoubAdd.toString());
        System.out.println();
        
        // Testing Contains Method
        BST testDoubContains = new BST();
        testDoubContains.add(2.4);
        testDoubContains.add(1.5);
        testDoubContains.add(0.9);
        testDoubContains.add(1.1);
        testDoubContains.add(4.7);
        System.out.println("** Testing contains Method **");
        System.out.println("Tree: " + testDoubContains.toString());
        System.out.println("Contains 1.1");
        System.out.println("Expected: true");
        System.out.println("Actual: " + testDoubContains.contains(1.1) + "\n");
        System.out.println("Tree: " + testDoubContains.toString());
        System.out.println("Contains 5.7");
        System.out.println("Expected: false");
        System.out.println("Actual: " + testDoubContains.contains(5.7));
        System.out.println();
        
        // Testing Equals Method and Shape Equals
        BST testDoubEquals1 = new BST();
        BST testDoubEquals2 = new BST();
        testDoubEquals1.add(4.66);
        testDoubEquals1.add(6.897);
        testDoubEquals1.add(7.99999);
        testDoubEquals1.add(3.34);
        testDoubEquals1.add(1.12345);
        testDoubEquals2.add(4.66);
        testDoubEquals2.add(6.897);
        testDoubEquals2.add(7.99999);
        testDoubEquals2.add(3.34);
        testDoubEquals2.add(1.12345);
        System.out.println("** Testing equals Method and Shape Equals **");
        System.out.println("Adding 4.66,6.897,7.99999,3.34,1.12345 to both Trees");
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println("Actual:");
        System.out.println(testDoubEquals1.equals(testDoubEquals2));
        System.out.println(testDoubEquals1.shapeEquals(testDoubEquals2));
        BST testDoubEquals3 = new BST();
        testDoubEquals3.add(6.897);
        testDoubEquals3.add(4.66);
        testDoubEquals3.add(7.99999);
        testDoubEquals3.add(1.12345);
        testDoubEquals3.add(3.34);
        System.out.println();
        System.out.println("Adding 4.66,6.897,7.99999,3.34,1.12345 to One Tree and 6.897,4.66,7.99999,1.12345,3.34 to Other Tree");
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println("Actual:");
        System.out.println(testDoubEquals1.equals(testDoubEquals3));
        System.out.println(testDoubEquals1.shapeEquals(testDoubEquals3));
        System.out.println();
        
        // Testing Equals and Shape Equals with only left subtree
        BST testDoubLeftEquals1 = new BST();
        BST testDoubLeftEquals2 = new BST();
        BST testDoubLeftEquals3 = new BST();
        
        testDoubLeftEquals1.add(8.11);
        testDoubLeftEquals1.add(6.999);
        testDoubLeftEquals1.add(5.545);
        testDoubLeftEquals1.add(3.2);
        testDoubLeftEquals1.add(1.123);
        testDoubLeftEquals2.add(8.11);
        testDoubLeftEquals2.add(6.999);
        testDoubLeftEquals2.add(5.545);
        testDoubLeftEquals2.add(3.2);
        testDoubLeftEquals2.add(1.123);
        testDoubLeftEquals3.add(8.11);
        testDoubLeftEquals3.add(5.545);
        testDoubLeftEquals3.add(3.2);
        testDoubLeftEquals3.add(6.999);
        testDoubLeftEquals3.add(1.123);
        
        System.out.println("** Testing Trees With Only Left Subtree **");
        System.out.println("Testing with Equal Tree");
        System.out.println("Tree 1: " + testDoubLeftEquals1.toString());
        System.out.println("Tree 2: " + testDoubLeftEquals2.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDoubLeftEquals1.equals(testDoubLeftEquals2));
        System.out.println(testDoubLeftEquals1.shapeEquals(testDoubLeftEquals2));
        System.out.println();
        System.out.println("Testing with Same Values Different Structure (Adding in a different way)");
        System.out.println("Tree 1: " + testDoubLeftEquals1.toString());
        System.out.println("Tree 2: " + testDoubLeftEquals3.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDoubLeftEquals1.equals(testDoubLeftEquals3));
        System.out.println(testDoubLeftEquals1.shapeEquals(testDoubLeftEquals3));
        System.out.println();
        
        BST testDoubDuplicate1 = new BST();
        BST testDoubDuplicate2 = new BST();
        BST testDoubDuplicate3 = new BST();
        
        testDoubDuplicate1.add(5.55);
        testDoubDuplicate1.add(6.98);
        testDoubDuplicate1.add(5.55);
        testDoubDuplicate1.add(3.1234);
        testDoubDuplicate1.add(4.45);
        testDoubDuplicate2.add(5.55);
        testDoubDuplicate2.add(6.98);
        testDoubDuplicate2.add(5.55);
        testDoubDuplicate2.add(3.1234);
        testDoubDuplicate2.add(4.45);
        testDoubDuplicate3.add(6.98);
        testDoubDuplicate3.add(5.55);
        testDoubDuplicate3.add(3.1234);
        testDoubDuplicate3.add(5.55);
        testDoubDuplicate3.add(4.45);
        
        System.out.println("** Testing Duplicate Values **");
        System.out.println("Tree 1: " + testDoubDuplicate1.toString());
        System.out.println("Tree 2: " + testDoubDuplicate2.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDoubDuplicate1.equals(testDoubDuplicate2));
        System.out.println(testDoubDuplicate1.shapeEquals(testDoubDuplicate2));
        System.out.println();
        System.out.println("Testing with Same Values Different Structure (Adding in a different way)");
        System.out.println("Tree 1: " + testDoubDuplicate1.toString());
        System.out.println("Tree 2: " + testDoubDuplicate3.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testDoubDuplicate1.equals(testDoubDuplicate3));
        System.out.println(testDoubDuplicate1.shapeEquals(testDoubDuplicate3));
        System.out.println();
        
        // String Tests
        
        System.out.println("******************");
        System.out.println("***String Tests***");
        System.out.println("******************");
        System.out.println();
        
        // Testing Empty
        BST testStringEmpty1 = new BST();
        BST testStringEmpty2 = new BST();
        
        System.out.println("** Testing 2 empty String Trees **");
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testStringEmpty1.equals(testStringEmpty2));
        System.out.println(testStringEmpty1.shapeEquals(testStringEmpty2));
        System.out.println();
        
        //Testing Add method
        
        BST testStringAdd = new BST();
        System.out.println("** Testing add Method **");
        System.out.println("Add B");
        testStringAdd.add("B");
        System.out.println("Tree Output: " + testStringAdd.toString());
        System.out.println("Add A and F");
        testStringAdd.add("A");
        testStringAdd.add("F");
        System.out.println("Tree Output: " + testStringAdd.toString());
        System.out.println("Add D");
        testStringAdd.add("D");
        System.out.println("Tree Output: " + testStringAdd.toString());
        System.out.println();
        
        // Testing Contains Method
        BST testStringContains = new BST();
        testStringContains.add("C");
        testStringContains.add("B");
        testStringContains.add("E");
        testStringContains.add("A");
        testStringContains.add("D");
        System.out.println("** Testing contains Method **");
        System.out.println("Tree: " + testStringContains.toString());
        System.out.println("Contains E");
        System.out.println("Expected: true");
        System.out.println("Actual: " + testStringContains.contains("E") + "\n");
        System.out.println("Tree: " + testStringContains.toString());
        System.out.println("Contains F");
        System.out.println("Expected: false");
        System.out.println("Actual: " + testStringContains.contains("F"));
        System.out.println();
        
        // Testing Equals Method and Shape Equals
        BST testStringEquals1 = new BST();
        BST testStringEquals2 = new BST();
        testStringEquals1.add("D");
        testStringEquals1.add("F");
        testStringEquals1.add("G");
        testStringEquals1.add("C");
        testStringEquals1.add("A");
        testStringEquals2.add("D");
        testStringEquals2.add("F");
        testStringEquals2.add("G");
        testStringEquals2.add("C");
        testStringEquals2.add("A");
        System.out.println("** Testing equals Method and Shape Equals **\n");
        System.out.println("Adding D,F,G,C,A to both Trees");
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println("Actual:");
        System.out.println(testStringEquals1.equals(testStringEquals2));
        System.out.println(testStringEquals1.shapeEquals(testStringEquals2));
        BST testStringEquals3 = new BST();
        testStringEquals3.add("F");
        testStringEquals3.add("D");
        testStringEquals3.add("G");
        testStringEquals3.add("A");
        testStringEquals3.add("C");
        System.out.println();
        System.out.println("Adding D,F,G,C,A to One Tree and F,D,G,A,C to Other Tree\n");
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println("Actual:");
        System.out.println(testStringEquals1.equals(testStringEquals3));
        System.out.println(testStringEquals1.shapeEquals(testStringEquals3));
        System.out.println();
        
        // Testing Equals and Shape Equals with only left subtree
        BST testStringLeftEquals1 = new BST();
        BST testStringLeftEquals2 = new BST();
        BST testStringLeftEquals3 = new BST();
        
        testStringLeftEquals1.add("H");
        testStringLeftEquals1.add("F");
        testStringLeftEquals1.add("E");
        testStringLeftEquals1.add("C");
        testStringLeftEquals1.add("A");
        testStringLeftEquals2.add("H");
        testStringLeftEquals2.add("F");
        testStringLeftEquals2.add("E");
        testStringLeftEquals2.add("C");
        testStringLeftEquals2.add("A");
        testStringLeftEquals3.add("H");
        testStringLeftEquals3.add("E");
        testStringLeftEquals3.add("C");
        testStringLeftEquals3.add("F");
        testStringLeftEquals3.add("A");
        
        System.out.println("** Testing Trees With Only Left Subtree **");
        System.out.println("Testing with Equal Tree");
        System.out.println("Tree 1: " + testStringLeftEquals1.toString());
        System.out.println("Tree 2: " + testStringLeftEquals2.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testStringLeftEquals1.equals(testStringLeftEquals2));
        System.out.println(testStringLeftEquals1.shapeEquals(testStringLeftEquals2));
        System.out.println();
        System.out.println("Testing with Same Values Different Structure (Adding in a different way)");
        System.out.println("Tree 1: " + testStringLeftEquals1.toString());
        System.out.println("Tree 2: " + testStringLeftEquals3.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testStringLeftEquals1.equals(testStringLeftEquals3));
        System.out.println(testStringLeftEquals1.shapeEquals(testStringLeftEquals3));
        System.out.println();
        
        BST testStringDuplicate1 = new BST();
        BST testStringDuplicate2 = new BST();
        BST testStringDuplicate3 = new BST();
        
        testStringDuplicate1.add("E");
        testStringDuplicate1.add("F");
        testStringDuplicate1.add("E");
        testStringDuplicate1.add("C");
        testStringDuplicate1.add("D");
        testStringDuplicate2.add("E");
        testStringDuplicate2.add("F");
        testStringDuplicate2.add("E");
        testStringDuplicate2.add("C");
        testStringDuplicate2.add("D");
        testStringDuplicate3.add("F");
        testStringDuplicate3.add("E");
        testStringDuplicate3.add("C");
        testStringDuplicate3.add("E");
        testStringDuplicate3.add("D");
        
        System.out.println("** Testing Duplicate Values **");
        System.out.println("Tree 1: " + testStringDuplicate1.toString());
        System.out.println("Tree 2: " + testStringDuplicate2.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\ntrue");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testStringDuplicate1.equals(testStringDuplicate2));
        System.out.println(testStringDuplicate1.shapeEquals(testStringDuplicate2));
        System.out.println();
        System.out.println("Testing with Same Values Different Structure (Adding in a different way)");
        System.out.println("Tree 1: " + testStringDuplicate1.toString());
        System.out.println("Tree 2: " + testStringDuplicate3.toString());
        System.out.println();
        System.out.println("Expected:");
        System.out.println("true\nfalse");
        System.out.println();
        System.out.println("Actual:");
        System.out.println(testStringDuplicate1.equals(testStringDuplicate3));
        System.out.println(testStringDuplicate1.shapeEquals(testStringDuplicate3));
        System.out.println();
    }
}
