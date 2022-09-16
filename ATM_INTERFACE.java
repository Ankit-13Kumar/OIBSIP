
import java.util.Scanner;  
public class ATM_INTERFACE  
{   
  public static void main(String args[] )  
  {  
    //overview
       int pin;
      int balance = 50000, withdraw, deposit;  
    Scanner in = new Scanner(System.in);  
      
      while(true)  
      {  
          System.out.println("Read The Option Which You Want To Perform"); 
          System.out.println("Choose 1 for Transaction history");
          System.out.println("Choose 2 for Withdraw");  
          System.out.println("Choose 3 for Deposit");  
          System.out.println("Choose 4 for Transfer");  
          System.out.println("Choose 5 for Quit");  
          System.out.print("Select The operation to perform Task:");  

          
            
          //get choice from user 

          int choice =in.nextInt();  
         
          switch(choice)  
          {  
        
            case 1:   
           //transaction details
            System.out.println("Type 4 Digit Pin Code:");
            pin=in.nextInt(); 
            
            System.out.println("You have Been Successfully Loggin");
            System.out.println("Transaction History");
            System.out.println("Sent 9500 Rs To XXXX Accoun Number On 5/02/2022" );
            System.out.println("Sent 4500 Rs To XXXX Accoun Number On 15/3/2022" );
            System.out.println("Sent 5000 Rs To XXXX Accoun Number On 17/7/2022");


    System.out.println("Account Balance : "+balance + " ");  
    System.out.println("");  
    System.exit(0); 


              case 2:  
              //withdrawn
         System.out.println("Type 4 Digit Pin:");
              pin=in.nextInt(); 
            
              System.out.println("You have Successfully Loggin");
      System.out.print("Enter money to be withdrawn:");   
      withdraw =in.nextInt();  
      if(balance >= withdraw)  
      {  
          balance = balance - withdraw;  
          System.out.println("Please collect your money");  
      }  
      else  
      {   
          System.out.println("Insufficient Balance");  
      }  
      System.out.println("");  
      System.exit(0); 

              case 3:
              //Deposit  
              System.out.println("Type 4 Digit Pin:");
              pin=in.nextInt(); 

              System.out.println("You have Successfully Loggin");      

      System.out.print("Enter money to be deposited:");    
      deposit =in.nextInt();    
      balance = balance + deposit;  
      System.out.println("Your Money has been successfully depsited");  
      System.out.println("");  
      System.exit(0); 
         

 
           

      case 4:  
      //Transfer
      System.out.println("Type 4 Digit Pin Code:");
      pin=in.nextInt(); 
      
      System.out.println("You have Been Successfully Loggin");

      System.out.println("Account Based Tranfer");
      System.out.print("Enter Account Number : ");
      int Account_No= in.nextInt();
      System.out.print("Enter Amount : ");
      int amount = in.nextInt();
      
      if(amount > balance)
          System.out.println("Balance is not sufficient");
      else {  
          System.out.println("The amount tranfer successfully");
          balance = balance - amount;
          System.out.println("Remaining Balance in Your Amount:" + balance);
      }
      System.out.println("");
      System.exit(0); 


              case 5: 
              //system exit
    System.out.println("Current Task Has Been Succesfully Quit");

      System.exit(0);  
          }  
      }  
  }  
}