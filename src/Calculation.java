import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculation {
   private double onCalculateAreaOfCircle(double r){
        return 3.14*r*r;

    }

    private double onCalulateCricumferanceOfCircle(double r){
        return  2*3.14*r;
    }
    void onHandleInput(){
//        System.out.print("Enter Radius");
//        Scanner scanner=new Scanner(System.in);
//        double radius=scanner.nextDouble();
//        System.out.println("Area of Circle is ::"
//                +onCalculateAreaOfCircle(radius));
//        System.out.println("Circumferance of Circle is ::"
//                +onCalulateCricumferanceOfCircle(radius));
        System.out.println("factpiral:"+onCalulateFactorial(5));


    }

   int onCalulateFactorial(int num){

       int fac=1;
       for(int i=1;i<=num;i++){
           fac=fac*i;
       }
       return  fac;

   }

   void Odeven(){
       System.out.println("Enter Number");
       Scanner scanner=new Scanner(System.in);
       int number=scanner.nextInt();
       if(number%2==0){
           System.out.println(number+" is even");
       }
       else {
           System.out.println(number+" is odd");
       }
    }

    String[] username=new String[]{"texas1", "texas2","texas3"};
    List<String> nameList = new ArrayList<>(Arrays.asList(username));
    String[] password=new String[]{"1texas", "2texas","3texas"};

    void userNamePass(){
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter User Name::");
        String user=scanner.nextLine();

        if(nameList.contains(user)){
                    int index=nameList.indexOf(user);
                    System.out.println("Enter Password");
                    String pass=scanner.nextLine();
                    if(user.equals(username[index]) && pass.equals(password[index])){
                        System.out.println("Login as "+username[index]);
                    }else {
                        System.out.println("Incorrect credentials");
                    }

        }else{
            System.out.println("User not found");
        }
    }


    void reverseSentence(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Sentece::");
        String sentence=scanner.nextLine();
        String[] words=sentence.split(" ");
        String final_result="";
        for(int i=words.length-1;i>=0;i--){
           final_result=final_result+words[i]+" ";
        }
        System.out.println("reverse sentence is :::");
        System.out.println(final_result);



    }

   //WAP to check whether number is even or odd.
   
//   WAP to check username and password of user.
//    List of username and password is :
//    username=["texas1","texas2","texas3"];
//   password=["1texas",'2texas','3texas']

    //Write a Java program to reverse the content of
    // a sentence (assume a single space between two words)
    // without reverse every word
    //for example: I am good=>good am i

}
