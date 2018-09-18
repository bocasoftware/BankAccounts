package com.LuisCadena;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

////EMPTY CONSTRUCTOR
public BankAccount(){
    this("0000000000",0,"FirstName","LastName", "email", "phonenumber");
    System.out.println("Empty constructor called");

}
////CONSTRUCTOR
public BankAccount(String accountNumber, double balance, String firstName, String lastName, String email, String phoneNumber){
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;

}
////Setter and getter accountNumber
public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}

public String getAccountNumber() {
    return this.accountNumber;
}


////Setter and getter balance
public void setBalance(double balance) {
    this.balance = balance;
}

public double getBalance() {
    return this.balance;
}

////Setter and getter firstName
public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getFirstName() {
    return this.firstName;
}

////Setter and getter lastName
public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getLastName() {
    return this.lastName;
}

////Setter and getter email
public void setEmail(String email) {
    this.email = email;
}

public String getEmail() {
    return this.email;
}

////Setter and getter phoneNumber
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getPhoneNumber() {
    return this.phoneNumber;
}

////Make Deposit and Withdrawal methods
public void makeDeposit(double depositAmount) {

    if (depositAmount < 1){
        System.out.println("Minimum deposit amount is $1.00" );
    } else {
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit successful, current balance is $" + String.format("%.2f",this.balance));
    }

}

public void makeWithdrawal(double withdrawalAmount){
    if (withdrawalAmount > this.balance){
        System.out.println("Insufficient funds, current balance is $" + String.format("%.2f",this.balance));
    } else {
        this.balance = this.balance - withdrawalAmount;
        System.out.println("Withdrawal of $" + withdrawalAmount + " complete, current balance is $" + String.format("%.2f",this.balance)  );
    }
}




}