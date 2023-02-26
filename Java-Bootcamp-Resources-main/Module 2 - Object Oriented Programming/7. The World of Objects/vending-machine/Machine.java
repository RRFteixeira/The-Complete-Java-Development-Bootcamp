public class Machine {
    
    private Item[][] items;

    public Machine( Item[][] items){
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j]=new Item (items[i][j]);
            }
        }    
    }
    

    public void setItem(Item item, int row, int collum) {
        this.items[row][collum] = new Item (item);
    }

    public Item getItem(int row, int collum) {
        return new Item(this.items[row][collum]);
    }


    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */

     public boolean dispense (int row, int collum){
        if (items[row][collum].getQuantity() > 0){
            items[row][collum].setQuantity(items[row][collum].getQuantity()-1);
            return true;
        }

        return false;
     }


     public String toString(){
        String temp = "";
        
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items.length; j++) {
                temp += items[i][j].toString() ;
            }
            temp += "\n";            
        }
        temp += "\t************************************************";
        return temp;
     }
}
