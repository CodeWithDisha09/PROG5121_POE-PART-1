/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class LoginForm {
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
    }
    public boolean checkPasswordComplexity(String password){
        return password.length() >=8 &&
        password.matches(".*[A-Z]*.") &&
        password.matches(".*\\d*.") &&
        password.matches(".*\\w*.");       
    }
public String registerUser(String username, String password){
if(!checkUserName(username)){
return "Username is not correctly formatted. Please ensure that your username contains a underscore and is no more than 5 characters in length.";
}
else if(!checkPasswordComplexity(password)){
return "Password is not correctly formatted. Please ensure that the password contains atleast 8 characters, a capital letter, a number, a special character.";
}
else{
//Code to recieve users information in a file
return"User has been registered successfully";
}
}
 public boolean loginForm(String username,String password){    
     //code to recieve user information in a file 
     //and verify that the entered login details match the stored login detail's
     return true;
     //or false if the login details do not match
 }
    public String returnLoginStatus(boolean loginSuccessfull){
if(loginSuccessfull){
return "Welcome! Login Successfull.";
}else{
return "Username or password incorrect. Please try again.";
}       
        }
    
}
