// Meghan Flaherty
// CS 145
/* this program creates a puzzle in which a person is trying to move four disks 
 * between three pegs with some contraints on the order that they are allowed to be placed
 */ 
package HanoiTowers.src;

public class hanoiMain {
    
    // method instructing how to solve the puzzle
    public static void hanoi (int i, char towerA, char towerC, char towerB) {
        
        // one disk 
        if (i == 1) {
            System.out.println("move disk 1 from tower " + towerA + " to tower " + towerC);
            return;
        } // end if
        
        // storing on tower B in order to move disk 4 -> tower C
        hanoi(i - 1, towerA, towerB, towerC);
        System.out.println("move disk " + i + " from tower " + towerA + " to tower " + towerC);
        // move disks from tower B -> tower C
        hanoi(i - 1, towerB, towerC, towerA);
    }
    // main method
    public static void main(String args[]) {
        char towerA = 'A';
        char towerB = 'B';
        char towerC = 'C';
        int i = 4;
        // calling hanoi method
        hanoi(i, towerA, towerC, towerB);
    }

}