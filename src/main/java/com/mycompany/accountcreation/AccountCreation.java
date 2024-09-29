/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountcreation;


import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class AccountCreation {
// Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Prompting the user for their first name
        System.out.println("Enter your First Name: ");
        String firstName = sc.nextLine();
        // Prompting the user for their last name
System.out.println("Enter your last name: ");
String lastName = sc.nextLine();
        // Prompting the user for their username with specific formatting rules
System.out.println("Enter your username: Username must contain a underscore and must not be"
                + "more than 5 characters ");
String username = sc.nextLine();
     // Validating the username format   
if(username.contains("_")&& username.length()<=5){
System.out.println("Username successfully captured");
}
else{
    // Error message if the username does not meet the required format
System.out.println("Username is not correctly formatted, please ensure that your username cotains an underscore and is no more longer than  characters is length");
}
              // Prompting the user for their password with specific complexity rules
System.out.println("Enter your password: Password must meet the following"
+ " rules, the password must be:"
+ " Atleast 8 characters long,"
+ " contain a capitel letter,"
+ " contain a number,"
+ " and contain a speacial character.");
String password = sc.nextLine();
        // Validating the password complexity
if(password.length() >=8 && password.matches(".*[A-Z]*.") && password.matches(".*\\d*.") && password.matches(".*\\W*.")){
System.out.println("Password successfully captured");
}else{
                // Error message if the password does not meet the complexity requirements
System.out.println("Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a speacial charcter.");
}
        // Asking the user to enter their username and password for login
System.out.println("Enter your username to login: ");
String enteredUsername = sc.nextLine();
        
System.out.println("Enter your password to login: ");
String enteredPassword = sc.nextLine();
        // Verifying the entered credentials match the registered ones
if(enteredUsername.equals(username) && enteredPassword.equals(password)){
    // If login is successful, a welcome message is displayed
System.out.println("Welcome " + firstName + "" +  lastName + ", it is great to see you again.");
}else{
    // If login fails, an error message is shown
System.out.println("Username or password is incorrect, please try again.");
}
        // Creating an instance of the LoginForm class
LoginForm LoginForm = new LoginForm();
        // Registering the user using the LoginForm methods
String registerResult = LoginForm.registerUser(username, password);
        // Checking if the user was successfully registered and displaying appropriate messages
if(registerResult.equals("User has been registered successfully")){
System.out.println(registerResult);
    // Attempting to log in and returning the login status
String loginResult = LoginForm.returnLoginStatus(LoginForm.loginForm(username, password));
System.out.println(loginResult);
}else{
System.out.println(registerResult);
}
}
    // Placeholder for future validation method
public static boolean isValid(String kyl_1) {
throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}
}


