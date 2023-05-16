// Meghan Flaherty
// CS 145
/* this program creates a puzzle in which a person is trying to move four disks 
 * between three pegs with some contraints on the order that they are allowed to be placed
 */ 
package HanoiTowers.src;

public class hanoiMain {
    
    // main method 
    public static void main(String[] args) {
        // initializing values for towers + disks
        char towerA = 'A';
        char towerB = 'B';
        char towerC = 'C';
        int i = 4;
        // calling hanoi method
        hanoi(i, towerA, towerC, towerB);
    } // end main method

    // method instructing how to solve disk -> B
    public static void hanoi (int i, char towerA, char towerC, char towerB) {
        
        // one disk 
        if (i == 1) {
            System.out.println("disk 1 moves from tower " + towerA + " to tower " + towerC);
            return;
        } // end if
        
        // recursion by calling method disk A -> C
        hanoi(i - 1, towerA, towerB, towerC);
        System.out.println("disk " + i + " moves from tower " + towerA + " to tower " + towerC);
        // move disk tower B -> tower C
        hanoi(i - 1, towerB, towerC, towerA);
    } // end hanoi method
} // end class