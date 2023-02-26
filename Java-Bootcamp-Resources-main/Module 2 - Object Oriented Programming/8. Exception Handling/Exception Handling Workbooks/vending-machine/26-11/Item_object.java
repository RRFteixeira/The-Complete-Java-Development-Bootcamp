public class Item_object{
    private String name_field;
    private double price_field;
    private int quantity_field;

    public Item_object (String name, double price, int quantity){
        if (name == null || name.isBlank() ){
            throw new IllegalArgumentException("name cannot be null or blank") ;    
        }
        if (price<0){
            throw new IllegalArgumentException("price cannot be lower than 0") ;    
        }
        if (quantity<0){
            throw new IllegalArgumentException("quantity cannot be lower than 0") ;    
        }
        this.name_field = name;
        this.price_field = price;
        this.quantity_field = quantity;
    }

    public Item_object(Item_object source){
        this.name_field = source.name_field;
        this.price_field = source.price_field;
        this.quantity_field = source.quantity_field;
    }

    public String getName() {
        return name_field;
    }

    public double getPrice() {
        return price_field;
    }

    public int getQuantity() {
        return quantity_field;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() ){
            throw new IllegalArgumentException("name cannot be null or blank") ;    
        }
        this.name_field = name;
    }
    
    public void setPrice(double price) {
        if (price<0){
            throw new IllegalArgumentException("price cannot be lower than 0") ;    
        }
        this.price_field = price;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            throw new IllegalArgumentException("quantity cannot be lower than 0") ;    
        }
        this.quantity_field = quantity;
    }


    public String toString(){
        return this.name_field + ":" + this.price_field + " " + "(" + this.quantity_field + ")";
    }

}