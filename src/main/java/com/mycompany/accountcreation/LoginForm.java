/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcreation;

/**
 *
 * @author RC_Student_lab
 */
//Method to check if the username follows the required format
//The username must contain an underscore('_') and be no more than 5 characters long
    public class LoginForm {
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
    }
    
    //Method to check if the password meets the complexity requirements 
    //The password must contain at least 8 characters,an uppercase letter,a digit,and a special character
    public boolean checkPasswordComplexity(String password){
        return password.length() >=8 &&
        password.matches(".*[A-Z]*.") && //Checks if there is at least one Uppercase letter used 
        password.matches(".*\\d*.") && //Checks if there is at least one digit
        password.matches(".*\\w*.");  //Checks if there is at least one special character used    
    }
    // Method to register a user by checking username and password validity
    //If both checks pass,the user is registered,otherwise,error messages and returned  
public String registerUser(String username, String password){
if(!checkUserName(username)){
    //Username is invalid,return an error message 
return "Username is not correctly formatted. Please ensure that your username contains a underscore and is no more than 5 characters in length.";
}
else if(!checkPasswordComplexity(password)){
    //Password does not meet the complexity requirements,return an error message
return "Password is not correctly formatted. Please ensure that the password contains atleast 8 characters, a capital letter, a number, a special character.";
}
else{
//User information can be stored in a file or database(to be implemented)
return"User has been registered successfully";
    }
}
//Method to verify login credentails by compairing entered username and password with stored credentials
 public boolean loginForm(String username,String password){ 
     
     //Code to retrieve user information form a file 
     // Should return true if login details match,or false if they don't  
     return true;
 }
 
 //Method to return the login status message based on whether login was successful
    public String returnLoginStatus(boolean loginSuccessful){
if(loginSuccessful){
    //Login was successful
return " Login Successful! Welcome back.";
}else{
    //Login failed due to incorrect username and password 
return "Username or password incorrect. Please try again.";
}       
        }
    
}

