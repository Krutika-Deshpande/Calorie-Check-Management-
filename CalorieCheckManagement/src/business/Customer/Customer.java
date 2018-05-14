/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

/**
 *
 * @author kruts
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode; 
    private String emailID;
    private String gender;
    private String dateOfBirth;
    private int heightInches;
    private int heightFeet;
    private int weight;
    private int age;
    private Country country;
    private ActivityLevel activityLevel;
    private double Calories;
    private boolean CalorieConscious;
   
    
     public enum Country{
        
        uSA("United States"),
        india("India"),
        china("China"),
        uk("United Kingdom"),
        uae("United Arab Emirates"),
        sriLanka("Sri Lanka"),
        germany("Germany");
       
        private String value;

        public String getValue() {
            return value;
        }
        
        private Country(String value){
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
         
        @Override
        public String toString(){
            return value;
        } 
    }
     public enum ActivityLevel{
        
        sedentary("Sedenatry - little or no exercise "),
        lightlyActive("Lightly Active - excercise/sports 1-3 times/week"),
        moderatelyActive("Moderately Active - exercise/sports 3-5 times/week"),
        veryActive("Very Active - hard exercise/sports 6-7 times/week"),
        extraActive("Extra Active - very hard exercise/sports or physical job");
       
        private String value;

        public String getValue() {
            return value;
        }
       
        private ActivityLevel(String value){
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
         
        @Override
        public String toString(){
            return value;
        } 
     }
    
    public Customer(){
       
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getCalories() {
        return Calories;
    }

    public void setCalories(double Calories) {
        this.Calories = Calories;
    }

    public boolean isCalorieConscious() {
        return CalorieConscious;
    }

    public void setCalorieConscious(boolean CalorieConscious) {
        this.CalorieConscious = CalorieConscious;
    }

    

   
    
    
}
