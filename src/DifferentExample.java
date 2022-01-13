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
        generateCaserCode(word);
        String reverse_word="";
//        for(int i=word.length()-1;i>=0;i--){
//
//           reverse_word=reverse_word+ word.charAt(i);
//
//        }
//        if(word.equals(reverse_word)){
//            System.out.println(word+" is palindrome");
//        }else{
//            System.out.println(word+" is not palindrome");
//        }



    }

    String generateCaserCode(String input){
        String casercode="";
        for(int i=0;i<input.length();i++){
            char character=input.charAt(i);
            int ascii = (int) character+3;
            char convertedChar;
            if((int) character==122){ //x
                convertedChar='c';
            }else if((int) character==120){ //z
                convertedChar='a';
            }else if((int) character==121){ //y
                convertedChar='b';
            }


            else{

                 convertedChar = (char)ascii;

            }
            casercode=casercode+convertedChar;

        }

        System.out.println(casercode);
        return  casercode;
    }


}

//WAP to create tax calculator
//user will input yearly salary.
//if salary upto 4 lakh tax is 1 percent
//if salary is greater than 4 lakh tax is 10 percent.

//WAP to check whether
// word is palindrome or not.
