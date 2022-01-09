import java.util.Scanner;

public class DifferentExample {
    void reverseSentence(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence=scanner.nextLine();
        String words[]=sentence.split(" ");
        String reverse_word="";
        for(int i=
            (words.length-1);i>=0;i--){
          reverse_word=reverse_word+" "+words[i];
        }
        System.out.println(reverse_word);

    }
    void reverseWords(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Words");
        String word=scanner.nextLine();
        String reverse_word="";
        for(int i=word.length()-1;i>=0;i--){

           reverse_word=reverse_word+ word.charAt(i);

        }
        if(word.equals(reverse_word)){
            System.out.println(word+" is palindrome");
        }else{
            System.out.println(word+" is not palindrome");
        }



    }


}

//WAP to create tax calculator
//user will input yearly salary.
//if salary upto 4 lakh tax is 1 percent
//if salary is greater than 4 lakh tax is 10 percent.

//WAP to check whether
// word is palindrome or not.
