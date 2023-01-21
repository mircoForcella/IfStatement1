package it.develhope.ifstatement;

public class Start {
    static String myName = "Mirco";
    
    public static void main(String[] args) {
        if(myName.length() % 2 == 0){
            System.out.println("The name is even");
        }else{
            System.out.println("The name is odd");
        }
    }
}
