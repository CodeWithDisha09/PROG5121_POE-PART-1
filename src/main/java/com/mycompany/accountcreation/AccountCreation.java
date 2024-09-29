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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your First Name: ");
        String firstName = sc.nextLine();
        
System.out.println("Enter your last name: ");
String lastName = sc.nextLine();
        
System.out.println("Enter your username: Username must contain a underscore and must not be"
                + "more than 5 characters ");
String username = sc.nextLine();
        
if(username.contains("_")&& username.length()<=5){
System.out.println("Username successfully captured");
}
else{
System.out.println("Username is not correctly formatted, please ensure that your username cotains an underscore and is no more longer than  characters is length");
}
System.out.println("Enter your password: Password must meet the following"
+ " rules, the password must be:"
+ " Atleast 8 characters long,"
+ " contain a capitel letter,"
+ " contain a number,"
+ " and contain a speacial character.");
String password = sc.nextLine();
if(password.length() >=8 && password.matches(".*[A-Z]*.") && password.matches(".*\\d*.") && password.matches(".*\\W*.")){
System.out.println("Password successfully captured");
}else{
System.out.println("Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a speacial charcter.");
}
System.out.println("Enter your username to login: ");
String enteredUsername = sc.nextLine();
        
System.out.println("Enter your password to login: ");
String enteredPassword = sc.nextLine();
        
if(enteredUsername.equals(username) && enteredPassword.equals(password)){
System.out.println("Welcome " + firstName + "" +  lastName + ", it is great to see you again.");
}else{
System.out.println("Username or password is incorrect, please try again.");
}
LoginForm LoginForm = new LoginForm();
String registerResult = LoginForm.registerUser(username, password);
if(registerResult.equals("User has been registered successfully")){
System.out.println(registerResult);
String loginResult = LoginForm.returnLoginStatus(LoginForm.loginForm(username, password));
System.out.println(loginResult);
}else{
System.out.println(registerResult);
}
}
public static boolean isValid(String kyl_1) {
throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}
}


