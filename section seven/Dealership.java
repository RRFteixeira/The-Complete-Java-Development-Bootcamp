

public class Dealership {

    private Car[] cars ;
    

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car (cars[i]);
        }
    }


    public void setCar(Car car, int index){

        this.cars[index] = new Car(car);

    }

    public Car getCar(int index){
        return new Car (this.cars[index]);
    }

    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;

    }

    public int search(String make, double budget){

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null){
                continue;
            }
            else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice()<= budget){
                System.out.println("\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested?");
                System.out.print("If you're interested, type 'yes':");
                return i;
            }
        }
        System.out.println("Sorry, couldnt find any car.");
        return 404;
    }


    public String toString (){
        String temp = "";

        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null){
                temp += "Parking spot: 2 \nEmpty \n";
                continue;
            }            
            temp += "Parking spot: " + i + "\n";
            temp += this.cars[i].toString() + "\n";
        }
        return temp;
    }

}