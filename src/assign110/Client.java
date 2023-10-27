package assign110;
public class Client {
   public static void main(String[] args) {
       Student s1 = new Student();
       s1.age = 10;
       s1.name = "A";
       s1.display();//My name is A. I am 10 years old
/*
       Student s2 = s1;
       s2.age = 20;
       s2.name = "B";
       s2.display();// My name is B. I am 20 years old
       s1.display();//My name is B. I am 20 years old
       */
    Student s = new Student();
       Student temp = s1;
       s1 = s;
       s = temp;
       s.display();//My name is A. I am 10 years old
       
 /*      Student s2 = new Student();
       int tempAge = s1.age;
       s1.age = s2.age;
       s2.age = tempAge;
       s2.display();//My name is null. I am 10 years old
*/       
     /*  Student s2 = new Student();
       String tempName = s1.name;
       s1.name = s2.name;
       s2.name = tempName;
       s1.display(); // My name is null. I am 10 years old
*/
       Student s2 = new Student();
       s2.age = 20;
       s2.name = "B";
     //  swap(s1, s2);
       s1.display();//My name is B. I am 20 years old
       swap2(s1, s2);
       s1.display(); // My name is A. I am 10 years old
   }
   private static void swap2(Student s1, Student s2) {
       Student temp = s1;
       s1 = s2;
       s2 = temp;
  }
   private static void swap(Student s1, Student s2) {
       int tage = s1.age;
       s1.age = s2.age;
       s2.age = tage;

       String tname = s1.name;
       s1.name = s2.name;
       s2.name = tname;
   }
}