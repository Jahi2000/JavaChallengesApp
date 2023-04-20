package org.yum;

public class Fun {

    public static void throwing(double a,double b){
   try {
       if (b == 0) {
           throw new ArithmeticException("Invalid Division");
       } else {
           System.out.print(a / b);
       }
   }
   catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Hey");
   }
    }
    public  static void main (String [] args){

        /*int [] list = {1,3,5};
        //int num = list[3];
        int num2 = 5;

        try{
           if (num2 > 2) {
               throw new ArrayIndexOutOfBoundsException("Hey");
           }
           else {
               System.out.print(num2);
           }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Error Occurred ");
        }
*/
    /*   if(2 > 1){
           throw new ArrayStoreException("Invalid");
       }
       else{
           System.out.println("Hey");
       }
*/
       try{
           int [] hey = {1,2};
           int num = hey[4];
       }
       catch(ArrayIndexOutOfBoundsException t){
           System.out.println("Hey" + t);
       }

       // throwing(10,0);
    }


}
