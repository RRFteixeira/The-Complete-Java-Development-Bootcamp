package models;


import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Contact_object {
  
  private String name_field;
  private int age_field;
  private String phoneNumber_field;
  private String birthDate_field;

 

  public Contact_object (String name, String birthDate, String phoneNumber) throws ParseException {


  if (name == null || name.isBlank() ){
      throw new IllegalArgumentException("name cannot be null or blank") ; 
    }  

  if (phoneNumber.length()>=10){
      throw new IllegalArgumentException("invalid phone number") ;    
  }
    this.name_field = name;
    this.birthDate_field = birthDate;
    this.phoneNumber_field = phoneNumber;

     // Birthdate to age
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    formatter.setLenient(false); 
    long age_ms = new Date().getTime() - formatter.parse(birthDate).getTime(); 
    this.age_field = (int) TimeUnit.MILLISECONDS.toDays(age_ms) / 365;

  }

  
  public String getName_field() {
      return name_field;
  }
  public String getPhoneNumber_field() {
      return phoneNumber_field;
  }
  public String getBirthDate_field() {
    return birthDate_field;
  }
  public int getAge_field() {
      return age_field;
  }

  public void setName_field(String name_field) {
    this.name_field = name_field;
  }
  public void setPhoneNumber_field(String phoneNumber_field) {
      this.phoneNumber_field = phoneNumber_field;
  }
  public void setBirthDate_field(String birthDate_field) {
      this.birthDate_field = birthDate_field;
  }
  private void setAge_field(int age_field) {
      // Birthdate to age
      SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
      formatter.setLenient(false); 
      long age_ms = new Date().getTime() - formatter.parse(this.birthDate).getTime(); 
      this.age_field = (int) TimeUnit.MILLISECONDS.toDays(age_ms) / 365;;
  }


  public String toString(){
    return this.name_field + ":" + this.age_field + " " + "(" + this.phoneNumber_field + ")";
}

}
