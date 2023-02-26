import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

public class Machine_class {

    private Item_object machine[][];

    public Machine_class (Item_object[][] vending_machine){
        this.machine = new Item_object[vending_machine.length][vending_machine[0].length];
        for (int i = 0; i < machine.length; i++) {
            for ( int j = 0; j < machine[i].length; j++) {
                this.machine [i][j] = new Item_object (vending_machine[i][j]);
            }
        }
    }

    public Item_object getItem(int row, int spot){
        return new Item_object (this.machine[row][spot]);
    }

    public void setItem(Item_object item , int row, int spot){

        this.machine[row][spot] = item;

    }


        /**
     * Function name -- dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     * - if so: decreases its quantity by one and returns true.
     * - otherwise: returns false.
     */

     public boolean dispense (int row, int spot){
        
        if (this.machine[row][spot].getQuantity()>0) {
            this.machine[row][spot].setQuantity(this.machine[row][spot].getQuantity()-1);
            return true;            
        }
        else {
            return false;
        }
     }

     public String toString(){
        String temp ="\n";
        for (int i = 0; i < this.machine.length; i++) {
            temp = temp + "\t";
            for (int j = 0; j < machine[i].length; j++) {
                temp = temp + this.machine[i][j].toString() + "  ";
            }
            temp = temp + "\n\n";
        }
        temp += "\t************************************************";
        return temp;
     }

     public int getLength(){
        return this.machine.length;
     }
     public int getRowLength(){
        return this.machine[0].length;
     }


}
