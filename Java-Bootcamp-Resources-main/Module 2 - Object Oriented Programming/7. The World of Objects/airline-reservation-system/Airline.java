public class Airline {

    private Person[] seats;

    public Airline(){
        this.seats = new Person[11];
    }

    public Person getPerson(int index){
        return new Person (this.seats[index]);
    }

    public void setPerson(Person person){
        this.seats[person.getSeatNumber()-1] = new Person(person);
    }

    public void createReservation(Person person){
        while (this.seats[person.getSeatNumber()-1] != null){
          System.out.println("\n" + person.getName() + ", seat: " +person.getSeatNumber()+ " is already taken. Please choose another one. \n.");  
          person.chooseSeat();
        }
        this.seats[person.getSeatNumber()-1] = new Person(person);
        System.out.println("Thank you " + person.getName() +" for flying with Java airlines. Your seat number is " + person.getSeatNumber() +". \n");
    }
    
    public String toString(){

        String temp = "";
        for (int i = 0; i < seats.length; i++) {
            if (this.seats[i] == null){
                temp += "\nSeat "+ (i+1) +" is empty\n";
                continue;
            } else{
                temp += "\n\n";
                temp += seats[i].toString();
            }
        }

        return temp;
    }
}
