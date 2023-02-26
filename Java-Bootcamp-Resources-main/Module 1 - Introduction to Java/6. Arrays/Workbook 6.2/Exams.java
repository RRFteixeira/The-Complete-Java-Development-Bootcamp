public class Exams {
    public static void main(String[] args) {
        
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        //Task 1: Create an array that stores 5 students: "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"

        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        for (int i = 0 ; i< students.length ; i++){

            System.out.println(students[i] + ", you will take seat " + i);
        }
    }
}