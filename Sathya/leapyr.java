public class leapyr{
      public static void main(String[] args) {
           int year=2400;
           if(year%4==0 && year%400==0 && year%100==0)
              {
                System.out.println("The given year is a leap year");}
           else{
               System.out.println("The given year is not a leap year");}
}
}